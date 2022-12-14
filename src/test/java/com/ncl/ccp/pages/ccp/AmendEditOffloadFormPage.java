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
    public class AmendEditOffloadFormPage extends NCLEnvData {
        private static final Logger LOGGER = LoggerFactory.getLogger(AmendEditOffloadFormPage.class);

        private static final String sheetName = "AmendEditOffloadFormPage";
        @Autowired
        NCLWebActions nclWebActions;

        public void performActions(String dataID) {
            boolean flag = false;

            OrderedHashtable data = readData(sheetName, dataID);

            Enumeration<String> keys = data.enumerateKeys();

            while (keys.hasMoreElements()) {
                flag = false;
                String key = keys.nextElement();
                String value = data.get(key).toString();
                switch (key) {

                    case "Amendbutton" -> {
                        flag = nclWebActions.clickValue(value, getObjMap("AmendEditOffloadFormPage.Amendbutton"), key);
                    }
                    case "Amendreason" -> {
                        flag = nclWebActions.setValue(value, getObjMap("AmendEditOffloadFormPage.Amendreason"), key);
                    }
                    case "searchbox" -> {
                        flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("AmendEditOffloadFormPage.searchbox"), key);
                    }
                    case "searchbar1" -> {
                        flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("ExportOfflaodFormPdf.searchbar1"), key);
                    }
                    case "searchbar2" -> {
                        flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("EmailOffloadFormPage.searchbar1"), key);
                        try {
                            Thread.sleep(5000);
                        } catch (Exception ex) {
                        }
                    }
                    case "Edit" -> {
                        flag = nclWebActions.clickValue(value, getObjMap("EmailOffloadFormPage.Edit"), key);
                    }
                    case "editicon" -> {
                        flag = nclWebActions.clickValue(value, getObjMap("EmailOffloadFormPage.editicon"), key);
                    }
                    case "NotesFields" -> {
                        //String b = "test";
//                    nclWebActions.webDriver.switchTo().frame("//iframe[@allowtransparency='true')]");
                        //nclWebActions.webDriver.switchTo().frame(nclWebActions.webDriver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
                        flag = nclWebActions.switchFrames("//iframe[@class='cke_wysiwyg_frame cke_reset']");
                        if (flag)
                            //nclWebActions.webDriver.switchTo().frame(nclWebActions.webDriver.findElement(By.xpath("//html[@dir='ltr']")));
                            flag = nclWebActions.setValue(value, getObjMap("AmendEditOffloadFormPage.NotesFields"), key);
                        nclWebActions.webDriver.switchTo().defaultContent();
                    }
                    case "CreateAmend" -> {
                        flag = nclWebActions.clickValue(value, getObjMap("AmendEditOffloadFormPage.CreateAmend"), key);
                    }
                    default -> {
                        throw new RuntimeException("Field " + key + " is not defined in page " + sheetName + " class");
                    }
                }
                if (!flag) throw new RuntimeException("Failed at " + key + " in page " + sheetName + " class");
            }
        }
    }
