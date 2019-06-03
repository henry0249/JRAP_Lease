/*
 * *
 *  @file com.maddyhome.idea.copyright.pattern.JavaCopyrightVariablesProvider$1@509324e1$
 *  @CopyRight (C) 2018 ZheJiangJingRui Co. Ltd.
 *  @brief JingRui Application Platform
 *  @author $name$
 *  @email yulong.yuan@jr-info.cn
 *  @date $date$
 * /
 */

package com.jingrui.jrap.system.dto;

/**Auto Generated By Jrap Code Generator**/

import com.jingrui.jrap.account.dto.Role;
import com.jingrui.jrap.account.dto.User;
import com.jingrui.jrap.fnd.dto.Company;
import com.jingrui.jrap.mybatis.annotation.ExtensionAttribute;
import com.jingrui.jrap.mybatis.common.query.JoinColumn;
import com.jingrui.jrap.mybatis.common.query.JoinOn;
import com.jingrui.jrap.mybatis.common.query.JoinTable;
import com.jingrui.jrap.mybatis.common.query.Where;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Id;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.criteria.JoinType;
import java.util.Date;
@ExtensionAttribute(disable=true)
@Table(name = "sys_homepage")
public class Homepage extends BaseDTO {

     public static final String FIELD_HOMEPAGE = "homepage";
     public static final String FIELD_COMPANY_ID = "companyId";
     public static final String FIELD_ROLE_ID = "roleId";
     public static final String FIELD_USER_ID = "userId";
     public static final String FIELD_HOME_PATH = "homePath";
     public static final String FIELD_REMAKR = "remakr";
     public static final String FIELD_ENABLED_FLAG = "enabledFlag";
     public static final String FIELD_PROGRAM_APPLICATION_ID = "programApplicationId";
     public static final String FIELD_PROGRAM_UPDATE_DATE = "programUpdateDate";


     @Where
     @Id
     @OrderBy("desc")
     private String homepage; // 首页代码

    @Where
    @JoinTable(name = "companyJoin", target = Company.class, type = JoinType.LEFT, on = {@JoinOn(joinField = Company.FIELD_COMPANY_ID)})
    private Long companyId;

    @Transient
    @JoinColumn(joinName = "companyJoin", field = Company.FIELD_COMPANY_FULL_NAME)
    private String companyFullName; // 商户全称

    @Where
    @JoinTable(name = "roleJoin", target = Role.class, type = JoinType.LEFT, on = {@JoinOn(joinField = Role.FIELD_ROLE_ID)})
    private Long roleId;

    @Transient
    @JoinColumn(joinName = "roleJoin", field = Role.FIELD_ROLE_NAME)
    private String roleName; // 角色名

    @Where
    @JoinTable(name = "userJoin", target = User.class, type = JoinType.LEFT, on = {@JoinOn(joinField = User.FIELD_USER_ID)})
    private Long userId;

    @Transient
    @JoinColumn(joinName = "userJoin", field = User.FIELD_USER_NAME)
    private String userName; // 用户名

     @Where
     @Length(max = 200)
     private String homePath; // 路径

     @Where
     @Length(max = 200)
     private String remakr; // 备注

     @Where
     @Length(max = 1)
     private String enabledFlag; // 启用标志

     @Where
     private Long programApplicationId;

     @Where
     private Date programUpdateDate;

    public String getCompanyFullName() {
        return companyFullName;
    }

    public void setCompanyFullName(String companyFullName) {
        this.companyFullName = companyFullName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setHomepage(String homepage){
         this.homepage = homepage;
     }

     public String getHomepage(){
         return homepage;
     }

     public void setCompanyId(Long companyId){
         this.companyId = companyId;
     }

     public Long getCompanyId(){
         return companyId;
     }

     public void setRoleId(Long roleId){
         this.roleId = roleId;
     }

     public Long getRoleId(){
         return roleId;
     }

     public void setUserId(Long userId){
         this.userId = userId;
     }

     public Long getUserId(){
         return userId;
     }

     public void setHomePath(String homePath){
         this.homePath = homePath;
     }

     public String getHomePath(){
         return homePath;
     }

     public void setRemakr(String remakr){
         this.remakr = remakr;
     }

     public String getRemakr(){
         return remakr;
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