package com.ncl.ccp.pages.ccp;

import com.ncl.ccp.common.NCLEnvData;
import com.ncl.ccp.common.NCLWebActions;
import com.ncl.ccp.data.OrderedHashtable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Enumeration;


    @Component
    public class CustomsExportFormPdfPage extends NCLEnvData {
        private static final Logger LOGGER = LoggerFactory.getLogger(CustomsExportFormPdfPage.class);

        private static final String sheetName = "CustomsExportFormPdfPage";
        @Autowired
        NCLWebActions nclWebActions;

        public void performActions(String dataID) {
            // public void performActions(String dataID) {
            boolean flag = false;

            OrderedHashtable data = readData(sheetName, dataID);

            Enumeration<String> keys = data.enumerateKeys();

            while (keys.hasMoreElements()) {
                flag = false;
                String key = keys.nextElement();
                String value = data.get(key).toString();
                switch (key) {

                    case "vesseloffload" -> {
                        flag = nclWebActions.clickValue(value, getObjMap("CustomsExportFormPdf.vesseloffload"), key);
                    }
                    case "offloadform" -> {
                        flag = nclWebActions.clickValue(value, getObjMap("CustomsExportFormPdf.offloadform"), key);
                    }
                    case "searchbar1" -> {
                        //String a = "sravan.bar";
                        flag = nclWebActions.setValue(value, getObjMap("CustomsExportFormPdf.searchbar1"), key);
                    }
                    case "edit1" -> {
                        flag = nclWebActions.setValue(value, getObjMap("CustomsExportFormPdf.edit1"), key);

                    }
                    case "exportform1" -> {
                        flag = nclWebActions.clickValue(value, getObjMap("CustomsExportFormPdf.exportform1"), key);
                    }

                    case "customsformpdf" -> {
                        flag = nclWebActions.clickValue(value, getObjMap("CustomsExportFormPdf.customsformpdf"), key);
                    }
                    default -> {
                        throw new RuntimeException("Field " + key + " is not defined in page " + sheetName + " class");
                    }
                }
                if (!flag) throw new RuntimeException("Failed at " + key + " in page " + sheetName + " class");
            }
        }
    }

