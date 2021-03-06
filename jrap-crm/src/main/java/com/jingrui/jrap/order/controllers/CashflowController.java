package com.jingrui.jrap.order.controllers;

import org.springframework.stereotype.Controller;
import com.jingrui.jrap.system.controllers.BaseController;
import com.jingrui.jrap.core.IRequest;
import com.jingrui.jrap.system.dto.ResponseData;
import com.jingrui.jrap.order.dto.Cashflow;
import com.jingrui.jrap.order.service.ICashflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import org.springframework.validation.BindingResult;
import java.util.List;

    @Controller
    public class CashflowController extends BaseController{

    @Autowired
    private ICashflowService service;


    @RequestMapping(value = "/con/cashflow/query")
    @ResponseBody
    public ResponseData query(Cashflow dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
        @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(service.select(requestContext,dto,page,pageSize));
    }

    @RequestMapping(value = "/con/cashflow/submit")
    @ResponseBody
    public ResponseData update(@RequestBody List<Cashflow> dto, BindingResult result, HttpServletRequest request){
        getValidator().validate(dto, result);
        if (result.hasErrors()) {
        ResponseData responseData = new ResponseData(false);
        responseData.setMessage(getErrorMessage(result, request));
        return responseData;
        }
        IRequest requestCtx = createRequestContext(request);
        return new ResponseData(service.batchUpdate(requestCtx, dto));
    }

    @RequestMapping(value = "/con/cashflow/remove")
    @ResponseBody
    public ResponseData delete(HttpServletRequest request,@RequestBody List<Cashflow> dto){
        service.batchDelete(dto);
        return new ResponseData();
    }
    }