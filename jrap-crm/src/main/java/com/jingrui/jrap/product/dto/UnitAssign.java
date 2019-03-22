package com.jingrui.jrap.product.dto;

/**
 * Auto Generated By Jrap Code Generator
 **/

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.jingrui.jrap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Table;

import com.jingrui.jrap.system.dto.BaseDTO;

import java.util.Date;

@ExtensionAttribute(disable = true)
@Table(name = "pro_unit_assign")
public class UnitAssign extends BaseDTO {

    public static final String FIELD_ASSIGN_ID = "assignId";
    public static final String FIELD_UNIT_ID = "unitId";
    public static final String FIELD_PRODUCT_CODE = "productCode";
    public static final String FIELD_ENABLED_FLAG = "enabledFlag";
    public static final String FIELD_START_DATE = "startDate";
    public static final String FIELD_END_DATE = "endDate";
    public static final String FIELD_REMARK = "remark";
    public static final String FIELD_PROGRAM_APPLICATION_ID = "programApplicationId";
    public static final String FIELD_PROGRAM_UPDATE_DATE = "programUpdateDate";


    @Id
    @GeneratedValue
    private Long assignId;

    private Long unitId; //组织部门HR_ORG_UNIT_B.UNIT_ID

    @Length(max = 60)
    private String productCode; //产品Code

    @Length(max = 1)
    private String enabledFlag; //启用标识

    private Date startDate; //有效期从

    private Date endDate; //有效期至


    public void setAssignId(Long assignId) {
        this.assignId = assignId;
    }

    public Long getAssignId() {
        return assignId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public Long getUnitId() {
        return unitId;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag;
    }

    public String getEnabledFlag() {
        return enabledFlag;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEndDate() {
        return endDate;
    }

}
