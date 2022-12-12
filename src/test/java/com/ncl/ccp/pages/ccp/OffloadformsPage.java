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
public class OffloadformsPage extends NCLEnvData {
    private static final Logger LOGGER = LoggerFactory.getLogger(OffloadformsPage.class);

    private static final String sheetName = "OffloadformsPage";
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
                case "offloadformspg" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadformsPage.offloadformspg"), key);
                }
                case "existingsubmittedoffloadform" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("OffloadformsPage.existingsubmittedoffloadform"), key);
                }
                case "editbutton" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadformsPage.editbutton"), key);
                }
                case "releasebutton" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadformsPage.releasebutton"), key);
                }
                case "Yesbutton" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadformsPage.Yesbutton"), key);
                }
                case "editoffloadform" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadformsPage.editoffloadform"), key);
                }
                case "displayinactiverecords" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadeventsPage.displayinactiverecords"), key);
                }
                case "deletedoffloadform" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadformsPage.deletedoffloadform"), key);
                }
                case "purserreleasedstatus" -> {
                    String a = "Purser_GSAM_Released";
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadformsPage.purserupdatedstatus",a), key);
                }
                case "purseronholdstatus" -> {
                    String a = "Purser_GSAM_OnHold";
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadformsPage.purserupdatedstatus",a), key);
                }
                case "purserrejectedstatus" -> {
                    String a = "Purser_GSAM_Rejected";
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadformsPage.purserupdatedstatus",a), key);
                }
                case "existingdeleteoffloadevent" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("OffloadeventsPage.existingdeleteoffloadevent"), key);
                }
                case "rejectbutton" -> {
                    flag = nclWebActions.setValue(value, getObjMap("OffloadformsPage.rejectbutton"), key);
                }
                case "onholdbutton" -> {
                    flag = nclWebActions.setValue(value, getObjMap("OffloadformsPage.onholdbutton"), key);
                }
                case "rejectreason" -> {
                    flag = nclWebActions.setValue(value, getObjMap("OffloadformsPage.rejectreason"), key);
                }
                case "notes" -> {
                    flag = nclWebActions.switchFrames("//iframe[@class='cke_wysiwyg_frame cke_reset']");
                  if(flag)
                      flag = nclWebActions.setValue(value, getObjMap("OffloadformsPage.notes"), key);
                    nclWebActions.webDriver.switchTo().defaultContent();
                }
                case "savebtn" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadformsPage.savebtn"), key);
                }

                default -> {
                    throw new RuntimeException("Field " + key + " is not defined in page " + sheetName + " class");
                }
            }
            if (!flag) throw new RuntimeException("Failed at " + key + " in page " + sheetName + " class");
        }
    }
}