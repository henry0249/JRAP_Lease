package com.jingrui.jrap.item.dto;

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
@Table(name = "afd_warehouse")
public class Warehouse extends BaseDTO {

     public static final String FIELD_WAREHOUSE_ID = "warehouseId";
     public static final String FIELD_COMPANY_ID = "companyId";
     public static final String FIELD_WAREHOUSE_NAME = "warehouseName";
     public static final String FIELD_WAREHOUSE_LOCATION = "warehouseLocation";
     public static final String FIELD_REMARK = "remark";
     public static final String FIELD_ENABLED_FLAG = "enabledFlag";
     public static final String FIELD_PROGRAM_APPLICATION_ID = "programApplicationId";
     public static final String FIELD_PROGRAM_UPDATE_DATE = "programUpdateDate";


     @Where
     @Id
     @GeneratedValue
     @OrderBy("desc")
     private Long warehouseId;

     @Where
     private Long companyId; //公司FND_COMPANY_B.COMPANY_ID

     @Where
     @Length(max = 200)
     private String warehouseName; //仓库名称

     @Where
     @Length(max = 200)
     private String warehouseLocation; //仓库地址

     @Where
     @Length(max = 200)
     private String remark; //备注

     @Where
     @Length(max = 1)
     private String enabledFlag; //启用标识

     @Where
     private Long programApplicationId;

     @Where
     private Date programUpdateDate;


     public void setWarehouseId(Long warehouseId){
         this.warehouseId = warehouseId;
     }

     public Long getWarehouseId(){
         return warehouseId;
     }

     public void setCompanyId(Long companyId){
         this.companyId = companyId;
     }

     public Long getCompanyId(){
         return companyId;
     }

     public void setWarehouseName(String warehouseName){
         this.warehouseName = warehouseName;
     }

     public String getWarehouseName(){
         return warehouseName;
     }

     public void setWarehouseLocation(String warehouseLocation){
         this.warehouseLocation = warehouseLocation;
     }

     public String getWarehouseLocation(){
         return warehouseLocation;
     }

     public void setRemark(String remark){
         this.remark = remark;
     }

     public String getRemark(){
         return remark;
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
