package com.jingrui.jrap.settle.dto;

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
@Table(name = "acc_operate")
public class Operate extends BaseDTO {

     public static final String FIELD_OPERATE_ID = "operateId";
     public static final String FIELD_OPERATE_TYPE = "operateType";
     public static final String FIELD_OPERATE_DATE = "operateDate";
     public static final String FIELD_TRANSACTION_ID = "transactionId";
     public static final String FIELD_BATCH_NO = "batchNo";
     public static final String FIELD_OPERATE_STATUS = "operateStatus";
     public static final String FIELD_DEAL_STATUS = "dealStatus";
     public static final String FIELD_USER_ID = "userId";
     public static final String FIELD_TOTAL_AMOUNT = "totalAmount";
     public static final String FIELD_TOTAL_COUNT = "totalCount";
     public static final String FIELD_SUCCESS_AMOUNT = "successAmount";
     public static final String FIELD_SUCCESS_COUNT = "successCount";
     public static final String FIELD_FAILURE_AMOUNT = "failureAmount";
     public static final String FIELD_FAILURE_COUNT = "failureCount";
     public static final String FIELD_ACCOUNT_ID = "accountId";
     public static final String FIELD_CUST_CODE = "custCode";
     public static final String FIELD_USER_NAME = "userName";
     public static final String FIELD_PASSWORD = "password";
     public static final String FIELD_TX_CODE = "txCode";
     public static final String FIELD_USEAGE = "useage";
     public static final String FIELD_REQUEST_MESSAGE = "requestMessage";
     public static final String FIELD_RESPONSE_MESSAGE = "responseMessage";
     public static final String FIELD_RETURN_CODE = "returnCode";
     public static final String FIELD_RETURN_MSG = "returnMsg";
     public static final String FIELD_DEAL_SN = "dealSn";
     public static final String FIELD_REQUEST01 = "request01";
     public static final String FIELD_REQUEST02 = "request02";
     public static final String FIELD_RESPONSE01 = "response01";
     public static final String FIELD_RESPONSE02 = "response02";
     public static final String FIELD_PROGRAM_APPLICATION_ID = "programApplicationId";
     public static final String FIELD_PROGRAM_UPDATE_DATE = "programUpdateDate";


     @Where
     @Id
     @GeneratedValue
     @OrderBy("desc")
     private Long operateId;

     @Where
     @Length(max = 60)
     private String operateType; //操作类型

     @Where
     private Date operateDate; //操作日期

     @Where
     private Long transactionId; //结算事务ID

     @Where
     @Length(max = 60)
     private String batchNo; //批次号

     @Where
     @Length(max = 60)
     private String operateStatus; //操作状态

     @Where
     @Length(max = 60)
     private String dealStatus; //交易状态

     @Where
     private Long userId; //用户ID

     @Where
     private Long totalAmount; //交易总额

     @Where
     private Long totalCount; //交易笔数

     @Where
     private Long successAmount; //成功金额

     @Where
     private Long successCount; //成功笔数

     @Where
     private Long failureAmount; //失败金额

     @Where
     private Long failureCount; //失败笔数

     @Where
     private Long accountId; //本方账号

     @Where
     @Length(max = 200)
     private String custCode; //客户号

     @Where
     @Length(max = 200)
     private String userName; //用户名

     @Where
     @Length(max = 200)
     private String password; //密码

     @Where
     @Length(max = 60)
     private String txCode; //交易码

     @Where
     @Length(max = 200)
     private String useage; //用途代码

     @Where
     @Length(max = 65535)
     private String requestMessage; //请求报文

     @Where
     @Length(max = 65535)
     private String responseMessage; //响应报文

     @Where
     @Length(max = 70)
     private String returnCode; //返回编码

     @Where
     @Length(max = 200)
     private String returnMsg; //返回详情

     @Where
     @Length(max = 60)
     private String dealSn; //交易唯一码

     @Where
     @Length(max = 200)
     private String request01; //请求字段01

     @Where
     @Length(max = 200)
     private String request02; //请求字段02

     @Where
     @Length(max = 200)
     private String response01; //响应字段01

     @Where
     @Length(max = 200)
     private String response02; //响应字段02

     @Where
     private Long programApplicationId;

     @Where
     private Date programUpdateDate;


     public void setOperateId(Long operateId){
         this.operateId = operateId;
     }

     public Long getOperateId(){
         return operateId;
     }

     public void setOperateType(String operateType){
         this.operateType = operateType;
     }

     public String getOperateType(){
         return operateType;
     }

     public void setOperateDate(Date operateDate){
         this.operateDate = operateDate;
     }

     public Date getOperateDate(){
         return operateDate;
     }

     public void setTransactionId(Long transactionId){
         this.transactionId = transactionId;
     }

     public Long getTransactionId(){
         return transactionId;
     }

     public void setBatchNo(String batchNo){
         this.batchNo = batchNo;
     }

     public String getBatchNo(){
         return batchNo;
     }

     public void setOperateStatus(String operateStatus){
         this.operateStatus = operateStatus;
     }

     public String getOperateStatus(){
         return operateStatus;
     }

     public void setDealStatus(String dealStatus){
         this.dealStatus = dealStatus;
     }

     public String getDealStatus(){
         return dealStatus;
     }

     public void setUserId(Long userId){
         this.userId = userId;
     }

     public Long getUserId(){
         return userId;
     }

     public void setTotalAmount(Long totalAmount){
         this.totalAmount = totalAmount;
     }

     public Long getTotalAmount(){
         return totalAmount;
     }

     public void setTotalCount(Long totalCount){
         this.totalCount = totalCount;
     }

     public Long getTotalCount(){
         return totalCount;
     }

     public void setSuccessAmount(Long successAmount){
         this.successAmount = successAmount;
     }

     public Long getSuccessAmount(){
         return successAmount;
     }

     public void setSuccessCount(Long successCount){
         this.successCount = successCount;
     }

     public Long getSuccessCount(){
         return successCount;
     }

     public void setFailureAmount(Long failureAmount){
         this.failureAmount = failureAmount;
     }

     public Long getFailureAmount(){
         return failureAmount;
     }

     public void setFailureCount(Long failureCount){
         this.failureCount = failureCount;
     }

     public Long getFailureCount(){
         return failureCount;
     }

     public void setAccountId(Long accountId){
         this.accountId = accountId;
     }

     public Long getAccountId(){
         return accountId;
     }

     public void setCustCode(String custCode){
         this.custCode = custCode;
     }

     public String getCustCode(){
         return custCode;
     }

     public void setUserName(String userName){
         this.userName = userName;
     }

     public String getUserName(){
         return userName;
     }

     public void setPassword(String password){
         this.password = password;
     }

     public String getPassword(){
         return password;
     }

     public void setTxCode(String txCode){
         this.txCode = txCode;
     }

     public String getTxCode(){
         return txCode;
     }

     public void setUseage(String useage){
         this.useage = useage;
     }

     public String getUseage(){
         return useage;
     }

     public void setRequestMessage(String requestMessage){
         this.requestMessage = requestMessage;
     }

     public String getRequestMessage(){
         return requestMessage;
     }

     public void setResponseMessage(String responseMessage){
         this.responseMessage = responseMessage;
     }

     public String getResponseMessage(){
         return responseMessage;
     }

     public void setReturnCode(String returnCode){
         this.returnCode = returnCode;
     }

     public String getReturnCode(){
         return returnCode;
     }

     public void setReturnMsg(String returnMsg){
         this.returnMsg = returnMsg;
     }

     public String getReturnMsg(){
         return returnMsg;
     }

     public void setDealSn(String dealSn){
         this.dealSn = dealSn;
     }

     public String getDealSn(){
         return dealSn;
     }

     public void setRequest01(String request01){
         this.request01 = request01;
     }

     public String getRequest01(){
         return request01;
     }

     public void setRequest02(String request02){
         this.request02 = request02;
     }

     public String getRequest02(){
         return request02;
     }

     public void setResponse01(String response01){
         this.response01 = response01;
     }

     public String getResponse01(){
         return response01;
     }

     public void setResponse02(String response02){
         this.response02 = response02;
     }

     public String getResponse02(){
         return response02;
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
