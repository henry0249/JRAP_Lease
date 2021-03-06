/*
 * *
 *  @file org.jetbrains.plugins.groovy.copyright.GroovyCopyrightVariablesProvider$collectVariables$1@76e13d07$
 *  @CopyRight (C) 2018 ZheJiangJingRui Co. Ltd.
 *  @brief JingRui Application Platform
 *  @author $name$
 *  @email yulong.yuan@jr-info.cn
 *  @date $date$
 * /
 */

package com.jingrui.jrap.db

import com.jingrui.jrap.liquibase.MigrationHelper
import com.jingrui.jrap.db.excel.ExcelDataLoader
dbType = MigrationHelper.getInstance().dbType()
databaseChangeLog(logicalFilePath:"crm-init-data-migration.groovy") {
    //Milestone , excel data, runAlways=true
    changeSet(author: "ivan", id: "crm-init-data-xlsx", runAlways: "true") {
        customChange(class: ExcelDataLoader.class.name) {
            param(name: "filePath", value: MigrationHelper.getInstance().dataPath("com/jingrui/jrap/db/data/crm-init-data.xlsx"))
        }
    }

    changeSet(author: "ivan", id: "20190428-crm-init-data-xlsx", runAlways: "true") {
        customChange(class: ExcelDataLoader.class.name) {
            param(name: "filePath", value: MigrationHelper.getInstance().dataPath("com/jingrui/jrap/db/data/20190428-init-data.xlsx"))
        }
    }

    changeSet(author: "ivan", id: "20190430-crm-init-data-xlsx", runAlways: "true") {
        customChange(class: ExcelDataLoader.class.name) {
            param(name: "filePath", value: MigrationHelper.getInstance().dataPath("com/jingrui/jrap/db/data/20190430-init-data.xlsx"))
        }
    }
	
	changeSet(author: "ivan", id: "20190505-crm-init-data-xlsx", runAlways: "true") {
        customChange(class: ExcelDataLoader.class.name) {
            param(name: "filePath", value: MigrationHelper.getInstance().dataPath("com/jingrui/jrap/db/data/20190505-init-data.xlsx"))
        }
    }
	
	changeSet(author: "ivan", id: "20190507-crm-init-data-xlsx", runAlways: "true") {
        customChange(class: ExcelDataLoader.class.name) {
            param(name: "filePath", value: MigrationHelper.getInstance().dataPath("com/jingrui/jrap/db/data/20190507-init-data.xlsx"))
        }
    }

    changeSet(author: "ivan", id: "201903012-data-cashflow-type") {
        sqlFile(path: MigrationHelper.getInstance().dataPath("com/jingrui/jrap/db/data/"+dbType+"/init/pro_cashflow_type_insert.sql"), encoding: "UTF-8")
    }

    changeSet(author: "ivan", id: "201903012-data-business-type") {
        sqlFile(path: MigrationHelper.getInstance().dataPath("com/jingrui/jrap/db/data/"+dbType+"/init/pro_business_type.sql"), encoding: "UTF-8")
    }

    changeSet(author: "ivan", id: "201903012-data-document-category") {
        sqlFile(path: MigrationHelper.getInstance().dataPath("com/jingrui/jrap/db/data/"+dbType+"/init/pro_document_category_insert.sql"), encoding: "UTF-8")
    }

    changeSet(author: "ivan", id: "201903012-data-document-type") {
        sqlFile(path: MigrationHelper.getInstance().dataPath("com/jingrui/jrap/db/data/"+dbType+"/init/pro_document_type_insert.sql"), encoding: "UTF-8")
    }

}