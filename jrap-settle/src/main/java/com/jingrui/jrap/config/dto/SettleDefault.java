package com.jingrui.jrap.config.dto;

/**Auto Generated By Jrap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.jingrui.jrap.mybatis.annotation.ExtensionAttribute;
import com.jingrui.jrap.mybatis.common.query.Where;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import javax.persistence.OrderBy;
import com.jingrui.jrap.system.dto.BaseDTO;
import java.util.Date;
@ExtensionAttribute(disable=true)
@Table(name = "acc_settle_default")
public class SettleDefault extends BaseDTO {

     public static final String FIELD_DEFAULT_ID = "defaultId";
     public static final String FIELD_DEFAULT_CODE = "defaultCode";
     public static final String FIELD_COMPANY_ID = "companyId";
     public static final String FIELD_EMPLOYEE_ID = "employeeId";
     public static final String FIELD_ACCOUNT_ID = "accountId";
     public static final String FIELD_ITEM_CODE = "itemCode";
     public static final String FIELD_CHANNEL = "channel";
     public static final String FIELD_DIGEST = "digest";
     public static final String FIELD_AUX01 = "aux01";
     public static final String FIELD_AUX02 = "aux02";
     public static final String FIELD_AUX03 = "aux03";
     public static final String FIELD_AUX04 = "aux04";
     public static final String FIELD_AUX05 = "aux05";
     public static final String FIELD_ENABLED_FLAG = "enabledFlag";
     public static final String FIELD_PROGRAM_APPLICATION_ID = "programApplicationId";
     public static final String FIELD_PROGRAM_UPDATE_DATE = "programUpdateDate";


     @Where
     @Id
     @GeneratedValue
     @OrderBy("desc")
     private Long defaultId;

     @Where
     @Length(max = 60)
     private String defaultCode; //默认编号

     @Where
     private Long companyId; //公司FND_COMPANY_B.COMPANY_ID

     @Where
     private Long employeeId; //操作员ID

     @Where
     private Long accountId; //本方账号ID

     @Where
     @Length(max = 60)
     private String itemCode; //费用项

     @Where
     @Length(max = 60)
     private String channel; //通道

     @Where
     @Length(max = 200)
     private String digest; //摘要

     @Where
     @Length(max = 200)
     private String aux01; //辅助核算01

     @Where
     @Length(max = 200)
     private String aux02; //辅助核算02

     @Where
     @Length(max = 200)
     private String aux03; //辅助核算03

     @Where
     @Length(max = 200)
     private String aux04; //辅助核算04

     @Where
     @Length(max = 200)
     private String aux05; //辅助核算05

     @Where
     @Length(max = 1)
     private String enabledFlag; //启用标识

     @Where
     private Long programApplicationId;

     @Where
     private Date programUpdateDate;


     public void setDefaultId(Long defaultId){
         this.defaultId = defaultId;
     }

     public Long getDefaultId(){
         return defaultId;
     }

     public void setDefaultCode(String defaultCode){
         this.defaultCode = defaultCode;
     }

     public String getDefaultCode(){
         return defaultCode;
     }

     public void setCompanyId(Long companyId){
         this.companyId = companyId;
     }

     public Long getCompanyId(){
         return companyId;
     }

     public void setEmployeeId(Long employeeId){
         this.employeeId = employeeId;
     }

     public Long getEmployeeId(){
         return employeeId;
     }

     public void setAccountId(Long accountId){
         this.accountId = accountId;
     }

     public Long getAccountId(){
         return accountId;
     }

     public void setItemCode(String itemCode){
         this.itemCode = itemCode;
     }

     public String getItemCode(){
         return itemCode;
     }

     public void setChannel(String channel){
         this.channel = channel;
     }

     public String getChannel(){
         return channel;
     }

     public void setDigest(String digest){
         this.digest = digest;
     }

     public String getDigest(){
         return digest;
     }

     public void setAux01(String aux01){
         this.aux01 = aux01;
     }

     public String getAux01(){
         return aux01;
     }

     public void setAux02(String aux02){
         this.aux02 = aux02;
     }

     public String getAux02(){
         return aux02;
     }

     public void setAux03(String aux03){
         this.aux03 = aux03;
     }

     public String getAux03(){
         return aux03;
     }

     public void setAux04(String aux04){
         this.aux04 = aux04;
     }

     public String getAux04(){
         return aux04;
     }

     public void setAux05(String aux05){
         this.aux05 = aux05;
     }

     public String getAux05(){
         return aux05;
     }

     public void setEnabledFlag(String enabledFlag){
         this.enabledFlag = enabledFlag;
     }

     public String getEnabledFlag(){
         return enabledFlag;
     }

     public void setProgramApplicationId(Long programApplicationId){
         this.programApplicationId = programApplicationId;
     }

     public Long getProgramApplicationId(){
         return programApplicationId;
     }

     public void setProgramUpdateDate(Date programUpdateDate){
         this.programUpdateDate = programUpdateDate;
     }

     public Date getProgramUpdateDate(){
         return programUpdateDate;
     }

     }
