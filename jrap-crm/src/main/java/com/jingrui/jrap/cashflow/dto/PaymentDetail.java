package com.jingrui.jrap.cashflow.dto;

/**Auto Generated By Jrap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.jingrui.jrap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.jingrui.jrap.system.dto.BaseDTO;
import java.util.Date;
@ExtensionAttribute(disable=true)
@Table(name = "csh_payment_detail")
public class PaymentDetail extends BaseDTO {

     public static final String FIELD_DETAIL_ID = "detailId";
     public static final String FIELD_PAYMENT_ID = "paymentId";
     public static final String FIELD_PAYMENT_TYPE = "paymentType";
     public static final String FIELD_PAYMENT_STATUS = "paymentStatus";
     public static final String FIELD_AMOUNT = "amount";
     public static final String FIELD_AMOUNT_PAID = "amountPaid";
     public static final String FIELD_PAYMENT_DATE = "paymentDate";
     public static final String FIELD_COMPLETED_DATE = "completedDate";
     public static final String FIELD_PAYMENT_METHOD = "paymentMethod";
     public static final String FIELD_DESCRIPTION = "description";
     public static final String FIELD_BANK_ACCOUNT_ID = "bankAccountId";
     public static final String FIELD_OPT_ACCOUNT_ID = "optAccountId";
     public static final String FIELD_OPT_ACCOUNT_NUM = "optAccountNum";
     public static final String FIELD_OPT_ACCOUNT_NAME = "optAccountName";
     public static final String FIELD_OPT_BANK_NAME = "optBankName";
     public static final String FIELD_SOURCE_TYPE = "sourceType";
     public static final String FIELD_SOURCE_ID = "sourceId";
     public static final String FIELD_SOURCE_LINE_ID = "sourceLineId";
     public static final String FIELD_REMARK = "remark";
     public static final String FIELD_PROGRAM_APPLICATION_ID = "programApplicationId";
     public static final String FIELD_PROGRAM_UPDATE_DATE = "programUpdateDate";


     @Id
     @GeneratedValue
     private Long detailId;

     private Long paymentId; //付款ID

     @Length(max = 60)
     private String paymentType; //行类型（PREPAYMENT/预付款、DEBT/债务、EXP_REPORT/报销单、OTHERS/其他）

     @Length(max = 60)
     private String paymentStatus; //付款状态（ NOT/未付款 ，PARTIAL/部分付款 ， FULL/全部付款 ）

     private Long amount; //申请金额

     private Long amountPaid; //已付金额

     private Date paymentDate; //付款日期

     private Date completedDate; //完成日期

     @Length(max = 60)
     private String paymentMethod; //付款方式

     @Length(max = 200)
     private String description; //付款摘要

     private Long bankAccountId; //本方账户ID

     private Long optAccountId; //对方账户ID

     @Length(max = 60)
     private String optAccountNum; //对方账号

     @Length(max = 200)
     private String optAccountName; //对方账户

     @Length(max = 200)
     private String optBankName; //对方开户行

     @Length(max = 60)
     private String sourceType; //来源类型

     private Long sourceId; //来源ID

     private Long sourceLineId; //来源行ID

     @Length(max = 2147483647)
     private String remark; //备注说明

     private Long programApplicationId;

     private Date programUpdateDate;


     public void setDetailId(Long detailId){
         this.detailId = detailId;
     }

     public Long getDetailId(){
         return detailId;
     }

     public void setPaymentId(Long paymentId){
         this.paymentId = paymentId;
     }

     public Long getPaymentId(){
         return paymentId;
     }

     public void setPaymentType(String paymentType){
         this.paymentType = paymentType;
     }

     public String getPaymentType(){
         return paymentType;
     }

     public void setPaymentStatus(String paymentStatus){
         this.paymentStatus = paymentStatus;
     }

     public String getPaymentStatus(){
         return paymentStatus;
     }

     public void setAmount(Long amount){
         this.amount = amount;
     }

     public Long getAmount(){
         return amount;
     }

     public void setAmountPaid(Long amountPaid){
         this.amountPaid = amountPaid;
     }

     public Long getAmountPaid(){
         return amountPaid;
     }

     public void setPaymentDate(Date paymentDate){
         this.paymentDate = paymentDate;
     }

     public Date getPaymentDate(){
         return paymentDate;
     }

     public void setCompletedDate(Date completedDate){
         this.completedDate = completedDate;
     }

     public Date getCompletedDate(){
         return completedDate;
     }

     public void setPaymentMethod(String paymentMethod){
         this.paymentMethod = paymentMethod;
     }

     public String getPaymentMethod(){
         return paymentMethod;
     }

     public void setDescription(String description){
         this.description = description;
     }

     public String getDescription(){
         return description;
     }

     public void setBankAccountId(Long bankAccountId){
         this.bankAccountId = bankAccountId;
     }

     public Long getBankAccountId(){
         return bankAccountId;
     }

     public void setOptAccountId(Long optAccountId){
         this.optAccountId = optAccountId;
     }

     public Long getOptAccountId(){
         return optAccountId;
     }

     public void setOptAccountNum(String optAccountNum){
         this.optAccountNum = optAccountNum;
     }

     public String getOptAccountNum(){
         return optAccountNum;
     }

     public void setOptAccountName(String optAccountName){
         this.optAccountName = optAccountName;
     }

     public String getOptAccountName(){
         return optAccountName;
     }

     public void setOptBankName(String optBankName){
         this.optBankName = optBankName;
     }

     public String getOptBankName(){
         return optBankName;
     }

     public void setSourceType(String sourceType){
         this.sourceType = sourceType;
     }

     public String getSourceType(){
         return sourceType;
     }

     public void setSourceId(Long sourceId){
         this.sourceId = sourceId;
     }

     public Long getSourceId(){
         return sourceId;
     }

     public void setSourceLineId(Long sourceLineId){
         this.sourceLineId = sourceLineId;
     }

     public Long getSourceLineId(){
         return sourceLineId;
     }

     public void setRemark(String remark){
         this.remark = remark;
     }

     public String getRemark(){
         return remark;
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