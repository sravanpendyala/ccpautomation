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
public class DashboardPage extends NCLEnvData {
    private static final Logger LOGGER = LoggerFactory.getLogger(DashboardPage.class);

    private static final String sheetName = "DashboardPage";
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
                    flag = nclWebActions.clickValue(value, getObjMap("DashboardPage.settingsbutton"), key);
                }
                case "portlink" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("DashboardPage.portlink"), key);
                }
                case "exportform1" -> {
                    try {
                        Thread.sleep(3000);
                        flag = nclWebActions.clickValue(value, getObjMap("ExportOfflaodFormPdf.exportform1"), key);

                    } catch (Exception e) {
                    }
                }

                case "offloadformpdf" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("ExportOfflaodFormPdf.offloadformpdf"), key);
                    try {
                        Thread.sleep(5000);
                    } catch (Exception ex) {
                    }
                }
                case "attachedfiles" -> {
                    try {
                        flag = nclWebActions.clickValue(value, getObjMap("OffloadEventDocumentPage.attachedfiles"), key);
                    } catch (Exception ex) {
                    }
                }
                case "logoutbutton" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("DashboardPage.logoutbutton"), key);
                }

                case "attachedoffloadforms" -> {
                    try {
                        Thread.sleep(10000);
                        flag = nclWebActions.clickValue(value, getObjMap("pdfExportOffloadPage.attachedoffloadforms"), key);

                    } catch (Exception ex) {
                    }

                }

                case "userprofile" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("DashboardPage.userprofile"), key);
                }

                case "offloadformxls" -> {
                    //nclWebActions.webDriver.findElement(By.xpath("//li[@title='Export Offload Form in Excel format')]"));
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadExportFormXl.offloadformxls"), key);

                    try {
                        Thread.sleep(5000);
                    } catch (Exception ex) {
                    }
                }
                case "cvcidpage" -> {
                    flag = nclWebActions.setValue(value, getObjMap("DashboardPage.cvcidpage"), key);
                }
                case "itineraries" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("DashboardPage.itineraries"), key);
                }
                case "offloadeventsLnk" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("DashboardPage.offloadeventsLnk"), key);
                }
                case "offloadresponseLnk" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("DashboardPage.offloadeventsLnk"), key);
                }
                case "administrationlnk" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("DashboardPage.administrationlnk"), key);
                }
                case "usermanagementlnk" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("DashboardPage.usermanagementlnk"), key);
                }
                case "newvesselitinerary" -> {
                    //nclWebActions.webDriver.switchTo().frame(nclWebActions.webDriver.findElement(By.xpath("//html[@dir='ltr']")));
                    flag = nclWebActions.clickValue(value, getObjMap("DashboardPage.newvesselitinerary"), key);
                }
                case "companyname" -> {

                    flag = nclWebActions.clickValue(value, getObjMap("DashboardPage.companyname"), key);
                }


                case "email" -> {

                    flag = nclWebActions.clickValue(value, getObjMap("EmailOffloadForm.email"), key);
                }
                case "companynametxt" -> {
                    String[] a = value.split("\\|");
                    try {
                        flag = nclWebActions.clickValue(a[1], getObjMap("DashboardPage.companynametxt",a[0]), key);
                    }
                    catch (Exception e) {
                    }
                    // nclWebActions.waitForElement("DashboardPage.companynametxt");
                }
                case "vesseltxt" -> {
                    String[] b = value.split("\\|");
                    try {
                        flag = nclWebActions.clickValue(b[1], getObjMap("DashboardPage.vesseltxt",b[0]), key);
                    }
                    catch (Exception e) {
                    }
                }
                case "vessel" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("DashboardPage.vessel"), key);
                }
                case "vesselitinerary" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("DashboardPage.vessselitinerary"), key);
                }
                case "offloadformsLnk" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("DashboardPage.offloadformsLnk"), key);
                }
                case "send" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("EmailOffloadForm.send"), key);
                }

                default -> {
                    throw new RuntimeException("Field " + key + " is not defined in page " + sheetName + " class");
                }
            }
            if (!flag) throw new RuntimeException("Failed at " + key + " in page " + sheetName + " class");
        }
    }
}
