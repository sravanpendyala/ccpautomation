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
import java.util.GregorianCalendar;

import static com.ncl.ccp.common.NCLWebActions.randBetween;

@Component
public class ItineraryForUsPortPage extends NCLEnvData {
    private static final Logger LOGGER = LoggerFactory.getLogger(ItineraryForUsPortPage.class);

    private static final String sheetName = "ItineraryForUsPortPage";
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
                case "settingsbutton" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("ItineraryForUsPortPage.settingsbutton"), key);
                }
                case "cvcidpage" -> {
                    flag = nclWebActions.setValue(value, getObjMap("ItineraryForUsPortPage.cvcidpage"), key);
                }
                case "itinerariespg" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("ItineraryForUsPortPage.itinerariespg"), key);
                }
                case "newvesselitinerary" -> {
                    //nclWebActions.webDriver.switchTo().frame(nclWebActions.webDriver.findElement(By.xpath("//html[@dir='ltr']")));
                    flag = nclWebActions.clickValue(value, getObjMap("ItineraryForUsPortPage.newvesselitinerary"), key);
                }
                case "vesseloffload" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("ExportOfflaodFormPdf.vesseloffload"), key);
                }
                case "buttonVessel" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("EmailOffloadForm.buttonVessel"), key);
                }
                case "offloadform" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("ExportOfflaodFormPdf.offloadform"), key);
                }
                case "vesseltxt" -> {
                    String[] b = value.split("\\|");
                    try {
                        flag = nclWebActions.clickValue(b[1], getObjMap("ItineraryForUsPortPage.vesseltxt", b[0]), key);
                    } catch (Exception e) {
                    }
                }
                case "itinerariesfromdate" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("ItineraryForUsPortPage.itinerariesfromdate"), key);
                }
                case "itineraryday" -> {
                    GregorianCalendar gc = new GregorianCalendar();
                    int year = randBetween(2023, 2023);
                    gc.set(gc.YEAR, year);
                    int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
                    gc.set(gc.DAY_OF_YEAR, dayOfYear);
                    value = ((gc.get(gc.MONTH) + 1) + "/" + gc.get(gc.DAY_OF_MONTH)+ "/" + gc.get(gc.YEAR));

                    NCLHooks.setRuntimeData("ItineraryDate", value);

                  //  value = NCLHooks.getRuntimeData(value);
                    flag = nclWebActions.setValue(value, getObjMap("ItineraryForUsPortPage.itineraryday"), key);
                }
                case "port" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("ItineraryForUsPortPage.port"), key);
                }
                case "portvalue" -> {
                    String[] b = value.split("\\|");
                    try {
                        flag = nclWebActions.clickValue(b[1], getObjMap("ItineraryForUsPortPage.portvalue", b[0]), key);
                    } catch (Exception e) {
                    }
                }
                case "exportform1" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("ExportOfflaodFormPdf.exportform1"), key);
                }
                case "sequence" -> {
                    flag = nclWebActions.setValue(value, getObjMap("ItineraryForUsPortPage.sequence"), key);
                }
                case "description" -> {
                    flag = nclWebActions.setValue(value, getObjMap("ItineraryForUsPortPage.description"), key);
                }
                case "offloadingallowed" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("ItineraryForUsPortPage.offloadingallowed"), key);
                }
                case "offloadingallowedvalue" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("ItineraryForUsPortPage.offloadingallowedvalue"), key);
                }
                case "offloadingallowedvalue1" -> {
                    String[] b = value.split("\\|");
                    try {
                        flag = nclWebActions.clickValue(b[1], getObjMap("ItineraryForUsPortPage.offloadingallowedvalue", b[0]), key);
                    } catch (Exception e) {
                    }
                }
                case "savebutton" -> {

                    flag = nclWebActions.clickValue(value, getObjMap("ItineraryForUsPortPage.savebutton"), key);
                }
                case "updatebutton" -> {

                    flag = nclWebActions.clickValue(value, getObjMap("ItineraryForUsPortPage.updatebutton"), key);
                }
                case "closewindow" -> {

                    flag = nclWebActions.clickValue(value, getObjMap("ItineraryForUsPortPage.closewindow"), key);
                }

                case "anchoredchkbx" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("ItineraryForUsPortPage.anchoredchkbx"), key);
                }
                case "email" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("EmailOffloadFormPage.email"), key);
                }
                case "offloadformpdf" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("EmailOffloadFormPage.offloadformpdf"), key);
                }
                case "to" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("EmailOffloadFormPage.to"), key);
                }
                case "Message" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("EmailOffloadFormPage.Message"), key);
                }
                case "send" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("EmailOffloadFormPage.send"), key);
                }
                default -> {
                    throw new RuntimeException("Field " + key + " is not defined in page " + sheetName + " class");
                }
            }
            if (!flag) throw new RuntimeException("Failed at " + key + " in page " + sheetName + " class");
        }
    }
}

