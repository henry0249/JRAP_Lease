package com.jingrui.jrap.db

import com.jingrui.jrap.liquibase.MigrationHelper
import com.jingrui.jrap.db.excel.ExcelDataLoader

dbType = MigrationHelper.getInstance().dbType()
databaseChangeLog(logicalFilePath:"2017-10-12-task-init-data-migration.groovy"){

    changeSet(author: "jiangpeng", id: "task-init-data-xlsx", runAlways:"true"){
        customChange(class:ExcelDataLoader.class.name){
            param(name:"filePath",value:MigrationHelper.getInstance().dataPath("com/jingrui/jrap/db/data/task-init-data.xlsx"))
        }
    }

}
