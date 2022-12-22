package com.ncl.ccp.pages.ccp;

import com.ncl.ccp.common.NCLEnvData;
import com.ncl.ccp.common.NCLHooks;
import com.ncl.ccp.common.NCLWebActions;
import com.ncl.ccp.data.OrderedHashtable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Enumeration;

@Component
public class SettingsPortPage extends NCLEnvData {
    private static final Logger LOGGER = LoggerFactory.getLogger(SettingsPortPage.class);

    private static final String sheetName = "SettingsPortPage";
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
                case "newportbutton" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("SettingsPortPage.newportbutton"), key);
                }
                case "portpage" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("SettingsPortPage.portpage"), key);
                }
                case "portcodetxt" -> {
                    value =  nclWebActions.randomValueGenerator();
                    flag = nclWebActions.setValue(value, getObjMap("SettingsPortPage.portcodetxt"), key);
                    NCLHooks.setRuntimeData("SearchPortCodeValue", value);
                }
                case "portnametxt" -> {
                    value =  nclWebActions.randomValueGenerator();
                    flag = nclWebActions.setValue(value, getObjMap("SettingsPortPage.portnametxt"), key);
                }
                case "portnamewodiacriticstxt" -> {
                    value =  nclWebActions.randomValueGenerator();
                    flag = nclWebActions.setValue(value, getObjMap("SettingsPortPage.portnamewodiacriticstxt"), key);
                }
                case "countrydrpdwn" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("SettingsPortPage.countrydrpdwn"), key);
                }
                case "countrydrpdwntxt" -> {
                    String[] a = value.split("\\|");
                    try {
                        flag = nclWebActions.clickValue(a[1], getObjMap("SettingsPortPage.countrydrpdwntxt",a[0]), key);
                    }
                    catch (Exception e) {
                    }
                }
                case "newportsavebtn" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("SettingsPortPage.newportsavebtn"), key);
                }
                case "newportpg" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("SettingsPortPage.newportpg"), key);
                }

                case "searchportcode" -> {
                    value = NCLHooks.getRuntimeData(value);
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("UsportPage.Searchdatavalue"), key);
                }
                case "verifydata" -> {
                    value = NCLHooks.getRuntimeData(value);
                    String a = value;
                    flag = nclWebActions.clickValue(value, getObjMap("SettingsPortPage.verifydata", a), key);
                }

//                case "verifynewcreatordata" -> {
//                    value = NCLHooks.getRuntimeData(value);
//                    String a = value;
//                    flag = nclWebActions.clickValue(value, getObjMap("SettingsPortPage.verifydata", a), key);
//                }
//                case "verifynewpurserdatadata" -> {
//                    value = NCLHooks.getRuntimeData(value);
//                    String a = value;
//                    flag = nclWebActions.clickValue(value, getObjMap("SettingsPortPage.verifydata", a), key);
//                }
                default -> {
                    throw new RuntimeException("Field " + key + " is not defined in page " + sheetName + " class");
                }
            }
            if (!flag) throw new RuntimeException("Failed at " + key + " in page " + sheetName + " class");
        }
    }
}
