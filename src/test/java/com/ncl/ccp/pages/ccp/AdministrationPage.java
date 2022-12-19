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
public class AdministrationPage extends NCLEnvData {
    private static final Logger LOGGER = LoggerFactory.getLogger(AdministrationPage.class);
    private static final String sheetName = "AdministrationPage";
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
                case "userspage" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("AdministrationPage.userspage"), key); }
                case "newuserbutton" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("AdministrationPage.newuserbutton"), key); }
                case "companydrpdwn" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("AdministrationPage.companydrpdwn"), key); }
                case "companydrpdwntxt" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("AdministrationPage.companydrpdwntxt"), key); }
                case "sitedrpdwn" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("AdministrationPage.sitedrpdwn"), key); }
                case "sitedrpdwntxt" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("AdministrationPage.sitedrpdwntxt"), key); }
                case "departmentdrpdwn" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("AdministrationPage.departmentdrpdwn"), key); }
                case "departmentdrpdwntxt" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("AdministrationPage.departmentdrpdwntxt"), key); }
                case "siterdbtn" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("AdministrationPage.siterdbtn"), key); }
                case "usernametxt" -> {
                    flag = nclWebActions.setValue(value, getObjMap("AdministrationPage.usernametxt"), key); }
                case "displaynametxt" -> {
                    flag = nclWebActions.setValue(value, getObjMap("AdministrationPage.displaynametxt"), key); }
                case "emailtxt" -> {
                    flag = nclWebActions.setValue(value, getObjMap("AdministrationPage.emailtxt"), key); }
                case "passwordtxt" -> {
                    flag = nclWebActions.setValue(value, getObjMap("AdministrationPage.passwordtxt"), key); }
                case "confirmpasswordtxt" -> {
                    flag = nclWebActions.setValue(value, getObjMap("AdministrationPage.confirmpasswordtxt"), key); }
                case "roletxt" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("AdministrationPage.roletxt"), key); }
                case "roletxtvalue" -> {
                    String[] b = value.split("\\|");
                    flag = nclWebActions.clickValue(b[1], getObjMap("AdministrationPage.roletxtvalue", b[0]), key);
                }
                case "savebutton" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("AdministrationPage.savebutton"), key); }
                default -> {
                    throw new RuntimeException("Field " + key + " is not defined in page " + sheetName + " class");
                }
            }
            if (!flag) throw new RuntimeException("Failed at " + key + " in page " + sheetName + " class");
        }
    }
}
