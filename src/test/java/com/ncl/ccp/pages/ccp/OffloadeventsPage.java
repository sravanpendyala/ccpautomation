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
public class OffloadeventsPage extends NCLEnvData {
    private static final Logger LOGGER = LoggerFactory.getLogger(OffloadeventsPage.class);

    private static final String sheetName = "OffloadeventsPage";
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
                case "offloadeventspg" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadeventsPage.offloadeventspg"), key);
                }
                case "newoffloadeventsbtn" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadeventsPage.newoffloadeventsbtn"), key);
                }
                case "vesselitinerarydrpdwn" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadeventsPage.vesselitinerarydrpdwn"), key);
                }
                case "vesselitinerarydrpdwntxtusport" -> {
                    String[] b = value.split("\\|");
                    try {
                        flag = nclWebActions.clickValue(b[1], getObjMap("OffloadeventsPage.vesselitinerarydrpdwntxt",b[0]), key);
                    }
                    catch (Exception e) {
                    }
                }
                case "vesselitinerarydrpdwntxtnonusport" -> {
                    String[] b = value.split("\\|");
                    try {
                        flag = nclWebActions.clickValue(b[1], getObjMap("OffloadeventsPage.vesselitinerarydrpdwntxt",b[0]), key);
                    }
                    catch (Exception e) {
                    }
                    if (flag)
                        flag = nclWebActions.setValue(value, getObjMap("OffloadeventsPage.portagentemailtxt"), key);
                               nclWebActions.setValue(value, getObjMap("OffloadeventsPage.portagentcompanytxt"), key);
                }
                case "existingoffloadevent" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("OffloadeventsPage.existingoffloadevent"), key);
                }
                case "editbutton" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadeventsPage.editbutton"), key);
                }
                case "deletebutton" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadeventsPage.deletebutton"), key);
                }
                case "undeletebutton" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadeventsPage.undeletebutton"), key);
                }
                case "Yesbutton" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadeventsPage.Yesbutton"), key);
                }
                case "savebutton" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadeventsPage.savebutton"), key);
                }
                case "displayinactiverecords" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadeventsPage.displayinactiverecords"), key);
                }
                case "deletedoffloadevent" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadeventsPage.deletedoffloadevent"), key);
                }
                case "existingdeleteoffloadevent" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("OffloadeventsPage.existingdeleteoffloadevent"), key);
                }
                default -> {
                    throw new RuntimeException("Field " + key + " is not defined in page " + sheetName + " class");
                }
            }
            if (!flag) throw new RuntimeException("Failed at " + key + " in page " + sheetName + " class");
        }
    }
}