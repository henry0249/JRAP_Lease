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
@Table(name = "acc_charge_rule")
public class ChargeRule extends BaseDTO {

     public static final String FIELD_RULE_ID = "ruleId";
     public static final String FIELD_RULE_CODE = "ruleCode";
     public static final String FIELD_COMPANY_ID = "companyId";
     public static final String FIELD_CHANNEL = "channel";
     public static final String FIELD_INTERVAL_MIN = "intervalMin";
     public static final String FIELD_INTERVAL_MAX = "intervalMax";
     public static final String FIELD_CHARGE_TYPE = "chargeType";
     public static final String FIELD_SINGLE_FEE = "singleFee";
     public static final String FIELD_MIN_FEE = "minFee";
     public static final String FIELD_MAX_FEE = "maxFee";
     public static final String FIELD_CALC_SEQ = "calcSeq";
     public static final String FIELD_ENABLED_FLAG = "enabledFlag";
     public static final String FIELD_PROGRAM_APPLICATION_ID = "programApplicationId";
     public static final String FIELD_PROGRAM_UPDATE_DATE = "programUpdateDate";


     @Where
     @Id
     @GeneratedValue
     @OrderBy("desc")
     private Long ruleId;

     @Where
     @Length(max = 60)
     private String ruleCode; //规则代码

     @Where
     private Long companyId; //公司FND_COMPANY_B.COMPANY_ID

     @Where
     @Length(max = 60)
     private String channel; //通道

     @Where
     private Long intervalMin; //分段下限

     @Where
     private Long intervalMax; //分段上限

     @Where
     @Length(max = 60)
     private String chargeType; //费用类型

     @Where
     private Long singleFee; //费用/费率

     @Where
     private Long minFee; //最低费用

     @Where
     private Long maxFee; //最高费用

     @Where
     private Long calcSeq; //计算顺序

     @Where
     @Length(max = 1)
     private String enabledFlag; //启用标识

     @Where
     private Long programApplicationId;

     @Where
     private Date programUpdateDate;


     public void setRuleId(Long ruleId){
         this.ruleId = ruleId;
     }

     public Long getRuleId(){
         return ruleId;
     }

     public void setRuleCode(String ruleCode){
         this.ruleCode = ruleCode;
     }

     public String getRuleCode(){
         return ruleCode;
     }

     public void setCompanyId(Long companyId){
         this.companyId = companyId;
     }

     public Long getCompanyId(){
         return companyId;
     }

     public void setChannel(String channel){
         this.channel = channel;
     }

     public String getChannel(){
         return channel;
     }

     public void setIntervalMin(Long intervalMin){
         this.intervalMin = intervalMin;
     }

     public Long getIntervalMin(){
         return intervalMin;
     }

     public void setIntervalMax(Long intervalMax){
         this.intervalMax = intervalMax;
     }

     public Long getIntervalMax(){
         return intervalMax;
     }

     public void setChargeType(String chargeType){
         this.chargeType = chargeType;
     }

     public String getChargeType(){
         return chargeType;
     }

     public void setSingleFee(Long singleFee){
         this.singleFee = singleFee;
     }

     public Long getSingleFee(){
         return singleFee;
     }

     public void setMinFee(Long minFee){
         this.minFee = minFee;
     }

     public Long getMinFee(){
         return minFee;
     }

     public void setMaxFee(Long maxFee){
         this.maxFee = maxFee;
     }

     public Long getMaxFee(){
         return maxFee;
     }

     public void setCalcSeq(Long calcSeq){
         this.calcSeq = calcSeq;
     }

     public Long getCalcSeq(){
         return calcSeq;
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