package com.jingrui.jrap.product.dto;

/**Auto Generated By Jrap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.jingrui.jrap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.jingrui.jrap.system.dto.BaseDTO;
import java.util.Date;
@ExtensionAttribute(disable=true)
@Table(name = "pro_item_model")
public class ItemModel extends BaseDTO {

     public static final String FIELD_MODEL_ID = "modelId";
     public static final String FIELD_COMPANY_ID = "companyId";
     public static final String FIELD_BRAND = "brand";
     public static final String FIELD_SERIES = "series";
     public static final String FIELD_MODEL = "model";
     public static final String FIELD_COLOR = "color";
     public static final String FIELD_AREA = "area";
     public static final String FIELD_LOCATION = "location";
     public static final String FIELD_ENABLED_FLAG = "enabledFlag";
     public static final String FIELD_REMARK = "remark";
     public static final String FIELD_PROGRAM_APPLICATION_ID = "programApplicationId";
     public static final String FIELD_PROGRAM_UPDATE_DATE = "programUpdateDate";


     @Id
     @GeneratedValue
     private Long modelId;

     private Long companyId; //公司ID

     @Length(max = 200)
     private String brand; //品牌

     @Length(max = 200)
     private String series; //系列

     @Length(max = 200)
     private String model; //型号

     @Length(max = 100)
     private String color; //颜色

     @Length(max = 100)
     private String area; //面积

     @Length(max = 200)
     private String location; //位置

     @Length(max = 1)
     private String enabledFlag; //启用标识

     @Length(max = 2147483647)
     private String remark; //备注说明

     private Long programApplicationId;

     private Date programUpdateDate;


     public void setModelId(Long modelId){
         this.modelId = modelId;
     }

     public Long getModelId(){
         return modelId;
     }

     public void setCompanyId(Long companyId){
         this.companyId = companyId;
     }

     public Long getCompanyId(){
         return companyId;
     }

     public void setBrand(String brand){
         this.brand = brand;
     }

     public String getBrand(){
         return brand;
     }

     public void setSeries(String series){
         this.series = series;
     }

     public String getSeries(){
         return series;
     }

     public void setModel(String model){
         this.model = model;
     }

     public String getModel(){
         return model;
     }

     public void setColor(String color){
         this.color = color;
     }

     public String getColor(){
         return color;
     }

     public void setArea(String area){
         this.area = area;
     }

     public String getArea(){
         return area;
     }

     public void setLocation(String location){
         this.location = location;
     }

     public String getLocation(){
         return location;
     }

     public void setEnabledFlag(String enabledFlag){
         this.enabledFlag = enabledFlag;
     }

     public String getEnabledFlag(){
         return enabledFlag;
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
