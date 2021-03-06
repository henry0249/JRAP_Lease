package com.jingrui.jrap.customer.controllers;

import com.jingrui.jrap.attachment.dto.SysFile;
import com.jingrui.jrap.attachment.service.ISysFileService;
import com.jingrui.jrap.code.rule.exception.CodeRuleException;
import com.jingrui.jrap.code.rule.service.ISysCodeRuleProcessService;
import com.jingrui.jrap.customer.dto.BusinessLicense;
import com.jingrui.jrap.customer.dto.CustomerID;
import com.jingrui.jrap.customer.dto.CustomerLicense;
import com.jingrui.jrap.customer.service.ICustomerOcrService;
import com.jingrui.jrap.customer.service.ICustomerPengYuanService;
import com.jingrui.jrap.customer.service.ICustomerTongdunService;
import com.jingrui.jrap.product.dto.Product;
import com.jingrui.jrap.product.service.IDocumentTypeService;
import com.jingrui.jrap.system.service.ICodeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import com.jingrui.jrap.system.controllers.BaseController;
import com.jingrui.jrap.core.IRequest;
import com.jingrui.jrap.system.dto.ResponseData;
import com.jingrui.jrap.customer.dto.Customer;
import com.jingrui.jrap.customer.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import org.springframework.validation.BindingResult;

import java.text.ParseException;
import java.util.Date;
import java.util.Calendar;
import java.util.List;
import java.util.GregorianCalendar;

@Controller
@Api(value="CustomerController", tags = {"客户接口"})
public class CustomerController extends BaseController {
    private static final String CUSTOMER_RULE_CODE = "CUSTOMER";

    @Autowired
    private ICustomerService service;

    @Autowired
    private ICustomerOcrService customerOcrService;

    @Autowired
    private ISysFileService sysFileService;

    @Autowired
    private ISysCodeRuleProcessService codeRuleProcessService;

    @Autowired
    private ICodeService codeService;

    @Autowired
    private IDocumentTypeService documentTypeService;

    @Autowired
    private ICustomerPengYuanService customerPengYuanService;

    @Autowired
    private ICustomerTongdunService customerTongdunService;

    @RequestMapping(value = "/afd/customer/query")
    @ResponseBody
    public ResponseData query(Customer dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                              @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        //设置默认商户
        dto.setCompanyId(requestContext.getCompanyId());
        //如果employeeId不为空，设置employee
        if(requestContext.getEmployeeId() != null){
            dto.setEmployeeId(requestContext.getEmployeeId());
        }

        return new ResponseData(service.select(requestContext, dto, page, pageSize));
    }

    @RequestMapping(value = "/afd/customer/submit")
    @ResponseBody
    public ResponseData update(@RequestBody List<Customer> dto, BindingResult result, HttpServletRequest request) {
        IRequest requestCtx = createRequestContext(request);

        //设置编码并自动填充身份证信息
        for (Customer record : dto) {
            String customerCode = record.getCustomerCode();
            String idType = record.getIdType();
            String idNo = record.getIdNo();
            Long customerId = record.getCustomerId();
            Long companyId = record.getCompanyId();
            Long employeeId = record.getEmployeeId();
            String customerSource = record.getCustomerSource();

            if (customerCode == null || "".equalsIgnoreCase(customerCode)) {
                try {
                    String ruleCode = documentTypeService.getDocumentCodeRule(record.getCustomerCategory(), record.getCustomerType());
                    if(ruleCode == null || "ERROR".equalsIgnoreCase(ruleCode)){
                        ruleCode = CustomerController.CUSTOMER_RULE_CODE;
                    }
                    customerCode = codeRuleProcessService.getRuleCode(ruleCode);
                    record.setCustomerCode(customerCode);
                } catch (CodeRuleException e) {
                    e.printStackTrace();
                }
            }

            //设置默认商户
            if(companyId == null){
                record.setCompanyId(requestCtx.getCompanyId());
            }

            //设置默认业务员
            if(employeeId == null){
                record.setEmployeeId(requestCtx.getEmployeeId());
            }

            //设置客户来源
            if(customerSource == null){
                record.setCustomerSource("MANUAL");
            }

            if ("ID".equalsIgnoreCase(idType)) {
                if (("".equalsIgnoreCase(idNo) || idNo == null) && customerId != null) {
                    //获取身份证正面的附件地址
                    List<SysFile> frontFiles = sysFileService.selectFilesByTypeAndKey(requestCtx, "CUSTOMER_FID", customerId);
                    List<SysFile> backFiles = sysFileService.selectFilesByTypeAndKey(requestCtx, "CUSTOMER_BID", customerId);

                    if (frontFiles != null && !frontFiles.isEmpty()) {
                        for (SysFile sysFile : frontFiles) {
                            try {
                                CustomerID customerID = customerOcrService.readCustomerPicture(sysFile.getFilePath(), "front");
                                String sex = customerID.getSex();
                                Calendar bornDate = new GregorianCalendar();
                                bornDate.setTime(customerID.getBornDate());
                                Calendar now = Calendar.getInstance();
                                int age = (now.get(Calendar.YEAR) - bornDate.get(Calendar.YEAR));

                                record.setIdNo(customerID.getIdNumber());
                                record.setCustomerName(customerID.getCustomerName());
                                record.setHomeAddress(customerID.getAddress());
                                record.setSex(codeService.getCodeValueByMeaning(requestCtx, "HR.EMPLOYEE_GENDER", sex));
                                record.setAge(Long.valueOf(age));
                            } catch (ParseException e) {
                                frontFiles.clear();
                                ResponseData responseData = new ResponseData(false);
                                responseData.setMessage(e.getMessage());
                                return responseData;
                            } catch (Exception e) {
                                frontFiles.clear();
                                ResponseData responseData = new ResponseData(false);
                                responseData.setMessage(e.getMessage());
                                return responseData;
                            }
                        }
                        frontFiles.clear();
                    }

                    if (backFiles != null && !backFiles.isEmpty()) {
                        for (SysFile sysFile : backFiles) {
                            try {
                                CustomerID customerID = customerOcrService.readCustomerPicture(sysFile.getFilePath(), "back");
                                record.setIdEndDate(customerID.getInvalidDate());
                            } catch (ParseException e) {
                                backFiles.clear();
                                ResponseData responseData = new ResponseData(false);
                                responseData.setMessage(e.getMessage());
                                return responseData;
                            } catch (Exception e) {
                                backFiles.clear();
                                ResponseData responseData = new ResponseData(false);
                                responseData.setMessage(e.getMessage());
                                return responseData;
                            }
                        }
                        backFiles.clear();
                    }
                }
            } else if ("LS".equalsIgnoreCase(idType)) {
                if (("".equalsIgnoreCase(idNo) || idNo == null) && customerId != null) {
                    //获取驾照信息
                    List<SysFile> sysFiles = sysFileService.selectFilesByTypeAndKey(requestCtx, "CUSTOMER_LID", customerId);

                    if (sysFiles != null && !sysFiles.isEmpty()) {
                        for (SysFile sysFile : sysFiles) {
                            try {
                                CustomerLicense customerLicense = customerOcrService.readDrivingLicense(sysFile.getFilePath());
                                String sex = customerLicense.getSex();
                                Calendar bornDate = new GregorianCalendar();
                                bornDate.setTime(customerLicense.getBornDate());
                                Calendar now = Calendar.getInstance();
                                int age = (now.get(Calendar.YEAR) - bornDate.get(Calendar.YEAR));

                                record.setIdNo(customerLicense.getIdNumber());
                                record.setCustomerName(customerLicense.getCustomerName());
                                record.setHomeAddress(customerLicense.getAddress());
                                record.setSex(codeService.getCodeValueByMeaning(requestCtx, "HR.EMPLOYEE_GENDER", sex));
                                record.setAge(Long.valueOf(age));
                                record.setIdEndDate(customerLicense.getValidLimit());
                            } catch (ParseException e) {
                                sysFiles.clear();
                                ResponseData responseData = new ResponseData(false);
                                responseData.setMessage(e.getMessage());
                                return responseData;
                            } catch (Exception e) {
                                sysFiles.clear();
                                ResponseData responseData = new ResponseData(false);
                                responseData.setMessage(e.getMessage());
                                return responseData;
                            }
                        }
                        sysFiles.clear();
                    }
                }
            }else if ("BT".equalsIgnoreCase(idType)) {
                //获取营业执照信息
                if (("".equalsIgnoreCase(idNo) || idNo == null) && customerId != null) {
                    List<SysFile> sysFiles = sysFileService.selectFilesByTypeAndKey(requestCtx, "CUSTOMER_CID", customerId);

                    if (sysFiles != null && !sysFiles.isEmpty()) {
                        for (SysFile sysFile : sysFiles) {
                            try {
                                BusinessLicense customerLicense = customerOcrService.readBusinessLicense(sysFile.getFilePath());
                                Calendar bornDate = new GregorianCalendar();
                                bornDate.setTime(customerLicense.getBornDate());
                                Calendar now = Calendar.getInstance();
                                int age = (now.get(Calendar.YEAR) - bornDate.get(Calendar.YEAR));

                                record.setIdNo(customerLicense.getUscc());
                                record.setCustomerName(customerLicense.getCompanyName());
                                record.setUnitAddress(customerLicense.getAddress());
                                record.setAge(Long.valueOf(age));
                                record.setAttribute2(customerLicense.getLegelPerson());
                            } catch (ParseException e) {
                                sysFiles.clear();
                                ResponseData responseData = new ResponseData(false);
                                responseData.setMessage(e.getMessage());
                                return responseData;
                            } catch (Exception e) {
                                sysFiles.clear();
                                ResponseData responseData = new ResponseData(false);
                                responseData.setMessage(e.getMessage());
                                return responseData;
                            }
                        }
                        sysFiles.clear();
                    }
                }
            }
        }

        getValidator().validate(dto, result);
        if (result.hasErrors()) {
            ResponseData responseData = new ResponseData(false);
            responseData.setMessage(getErrorMessage(result, request));
            return responseData;
        }

        return new ResponseData(service.batchUpdate(requestCtx, dto));
    }

    @RequestMapping(value = "/afd/customer/remove")
    @ResponseBody
    public ResponseData delete(HttpServletRequest request, @RequestBody List<Customer> dto) {
        service.batchDelete(dto);
        return new ResponseData();
    }

    @RequestMapping(value = "/afd/customer/credit")
    @ResponseBody
    @ApiOperation(value="同步征信信息", notes = "同步征信信息", httpMethod="POST")
    public ResponseData creditQuery(@RequestBody List<Customer> dto, BindingResult result, HttpServletRequest request) {
        IRequest requestCtx = createRequestContext(request);
        ResponseData responseData = new ResponseData();

        for (Customer record : dto) {
            String message = "";
            try {
                message = customerTongdunService.readCustomerCredit(requestCtx, record.getCustomerId(), record.getCustomerName(), record.getIdNo(), record.getTelphone());
                message = message + customerPengYuanService.readCustomerCredit(requestCtx, record.getCustomerId(), record.getCustomerName(), record.getIdNo(), record.getTelphone());
                message = message + customerPengYuanService.readCustomerLoan(requestCtx, record.getCustomerId(), record.getCustomerName(), record.getIdNo(), record.getTelphone());
                responseData.setSuccess(true);
                responseData.setMessage(message);
            }catch(ParseException e){
                responseData.setSuccess(false);
                responseData.setMessage(e.getMessage());
                e.printStackTrace();
            }catch(Exception e){
                responseData.setSuccess(false);
                responseData.setMessage(e.getMessage());
                e.printStackTrace();
            }
        }

        return responseData;
    }
}