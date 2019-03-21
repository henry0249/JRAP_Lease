package com.jingrui.jrap.order.dto;

/**Auto Generated By Jrap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.jingrui.jrap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.jingrui.jrap.system.dto.BaseDTO;
import java.util.Date;
@ExtensionAttribute(disable=true)
@Table(name = "con_content")
public class Content extends BaseDTO {

     public static final String FIELD_CONTENT_ID = "contentId";
     public static final String FIELD_ORDER_ID = "orderId";
     public static final String FIELD_CONTENT_NAME = "contentName";
     public static final String FIELD_CLAUSE_USAGE = "clauseUsage";
     public static final String FIELD_TEMPLET_ID = "templetId";
     public static final String FIELD_PRINT_FLAG = "printFlag";
     public static final String FIELD_TIMES = "times";
     public static final String FIELD_TRANSACTION_ID = "transactionId";
     public static final String FIELD_PAYMENT_ID = "paymentId";
     public static final String FIELD_PRINT_COUNT = "printCount";
     public static final String FIELD_AVAILABLE_FLAG = "availableFlag";
     public static final String FIELD_REMARK = "remark";
     public static final String FIELD_PROGRAM_APPLICATION_ID = "programApplicationId";
     public static final String FIELD_PROGRAM_UPDATE_DATE = "programUpdateDate";


     @Id
     @GeneratedValue
     private Long contentId;

     private Long orderId; //订单ID

     @Length(max = 200)
     private String contentName; //文本名称

     @Length(max = 60)
     private String clauseUsage; //模板用途

     @Length(max = 50)
     private String templetId; //模板ID

     @Length(max = 1)
     private String printFlag; //打印标志

     private Long times; //期数

     private Long transactionId; //现金事务ID

     private Long paymentId; //付款ID

     private Long printCount; //打印次数

     @Length(max = 1)
     private String availableFlag; //生效标志

     @Length(max = 2147483647)
     private String remark; //备注说明

     private Long programApplicationId;

     private Date programUpdateDate;


     public void setContentId(Long contentId){
         this.contentId = contentId;
     }

     public Long getContentId(){
         return contentId;
     }

     public void setOrderId(Long orderId){
         this.orderId = orderId;
     }

     public Long getOrderId(){
         return orderId;
     }

     public void setContentName(String contentName){
         this.contentName = contentName;
     }

     public String getContentName(){
         return contentName;
     }

     public void setClauseUsage(String clauseUsage){
         this.clauseUsage = clauseUsage;
     }

     public String getClauseUsage(){
         return clauseUsage;
     }

     public void setTempletId(String templetId){
         this.templetId = templetId;
     }

     public String getTempletId(){
         return templetId;
     }

     public void setPrintFlag(String printFlag){
         this.printFlag = printFlag;
     }

     public String getPrintFlag(){
         return printFlag;
     }

     public void setTimes(Long times){
         this.times = times;
     }

     public Long getTimes(){
         return times;
     }

     public void setTransactionId(Long transactionId){
         this.transactionId = transactionId;
     }

     public Long getTransactionId(){
         return transactionId;
     }

     public void setPaymentId(Long paymentId){
         this.paymentId = paymentId;
     }

     public Long getPaymentId(){
         return paymentId;
     }

     public void setPrintCount(Long printCount){
         this.printCount = printCount;
     }

     public Long getPrintCount(){
         return printCount;
     }

     public void setAvailableFlag(String availableFlag){
         this.availableFlag = availableFlag;
     }

     public String getAvailableFlag(){
         return availableFlag;
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
