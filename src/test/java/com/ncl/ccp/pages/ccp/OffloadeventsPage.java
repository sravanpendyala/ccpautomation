package com.ncl.ccp.pages.ccp;

import com.ncl.ccp.common.NCLEnvData;
import com.ncl.ccp.common.NCLHooks;
import com.ncl.ccp.common.NCLWebActions;
import com.ncl.ccp.data.OrderedHashtable;
import com.ncl.ccp.selenium.Commands;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
                case "offloadresponsepg" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadeventsPage.offloadresponsepg"), key);
                }
                case "newoffloadeventsbtn" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadeventsPage.newoffloadeventsbtn"), key);
                }
                case "vesselitinerarydrpdwn" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadeventsPage.vesselitinerarydrpdwn"), key);
                }
                case "vesselitinerarydrpdwntxtusport" -> {
                    String finalOutput = "NCL_Gem_";
                    value = NCLHooks.getRuntimeData(value);
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("OffloadeventsPage.vesselitinerarydrpdwntxt"), key);
                    if (flag) {
//                       String initialString = "Ship:Gem on:Dec 28, 2022 at: (PHI-Philipsburg) {CW-Curaçao}";
                        String dateOutcome = value.split(":")[2].replace(",", "").replace(" at", "");
                        String[] s1 = value.split("\\(");
                        finalOutput = finalOutput + s1[1].split("-")[0] + "_" + dateOutcome;
                        System.out.println(finalOutput);
                        NCLHooks.setRuntimeData("OffloadEventCodeVal", finalOutput);
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                case "vesselitinerarydrpdwntxtsingle" -> {
                    //value = NCLHooks.getRuntimeData(value);
                    try {
                        Thread.sleep(5000);
                        flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("OffloadeventsPage.vesselitinerarydrpdwntxt"), key);
                    //    Thread.sleep(5000);
                   //     if (flag)
                    //////        flag = nclWebActions.(value, getObjMap("OffloadeventsPage.vesselitinerarydrpdwntxt1"), key);
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "vesselitinerarydrpdwntxtnonusport" -> {

//                    String finalOutput = "NCL_Gem_";
//                    value = NCLHooks.getRuntimeData(value);
//                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("OffloadeventsPage.vesselitinerarydrpdwntxt"), key);
//                    if (flag) {
////                       String initialString = "Ship:Gem on:Dec 28, 2022 at: (PHI-Philipsburg) {CW-Curaçao}";
//                        String dateOutcome = value.split(":")[2].replace(",", "").replace(" at", "");
//                        String[] s1 = value.split("\\(");
//                        finalOutput = finalOutput + s1[1].split("-")[0] + "_" + dateOutcome;
//                        System.out.println(finalOutput);
//                        NCLHooks.setRuntimeData("OffloadEventCodeVal", finalOutput);
//                        try {
//                            Thread.sleep(2000);
//                        } catch (InterruptedException e) {
//                            throw new RuntimeException(e);
//                        }}
}                case "portagentemailtxt" -> {
                    flag = nclWebActions.setValue(value, getObjMap("OffloadeventsPage.portagentemailtxt"), key);
                }
                case "portagentcompanytxt" -> {
                    flag = nclWebActions.setValue(value, getObjMap("OffloadeventsPage.portagentcompanytxt"), key);
                }
                case "existingoffloadevent" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("OffloadeventsPage.existingoffloadevent"), key);
                }
                case "applychanges" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadeventsPage.applychanges"), key);
                    if (flag) {
                        try {
                            Thread.sleep(8000);
                            String strActualVal = nclWebActions.getText(getObjMap("OffloadeventsPage.newitineraryname"));
                            int actval = strActualVal.length() - 1;
                            String strVal = strActualVal.substring(23, actval);
                            NCLHooks.setRuntimeData("NewItinryName", strVal);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                case "editbutton" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadeventsPage.editbutton"), key);
                }
                case "newitineraryname" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadeventsPage.newitineraryname"), key);
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
                    if (flag) {
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
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
                case "searchvalue" -> {
                    value = NCLHooks.getRuntimeData(value);
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("OffloadformsPage.existingsubmittedoffloadform"), key);
                }
                default -> {
                    throw new RuntimeException("Field " + key + " is not defined in page " + sheetName + " class");
                }
            }
            if (!flag) throw new RuntimeException("Failed at " + key + " in page " + sheetName + " class");
        }
    }
}