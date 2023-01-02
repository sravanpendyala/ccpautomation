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
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.maximizeicon"), key);
                    if (flag)
                    flag = nclWebActions.clickValue(value, getObjMap("AmendEditOffloadFormPage.Amendbutton"), key);
                }
                case "Amendreason" -> {
                    flag = nclWebActions.setValue(value, getObjMap("AmendEditOffloadFormPage.Amendreason"), key);
                }
                case "Recallbutton" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("EditOffloadForm.maxbutton"), key);

                    try {
                        Thread.sleep(5000);
                        flag = nclWebActions.clickValue(value, getObjMap("EditOffloadForm.Recallbutton"), key);
                    } catch (Exception ex) {
                    }
                }
                case "RecallReason" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("EditOffloadForm.RecallReason"), key);
                }
                case "NotesFields" -> {
                    flag = nclWebActions.switchFrames(getObjMap("EditOffloadForm.frame"));
                    try {
                        Thread.sleep(8000);
                        flag = nclWebActions.setValue(value, getObjMap("EditOffloadForm.NotesFields"), key);
                        nclWebActions.webDriver.switchTo().defaultContent();
                    } catch (Exception ex) {
                    }
                }case "NotesFields2" -> {
                    try {
                        Thread.sleep(8000);
                        flag = nclWebActions.switchFrames(getObjMap("customsrejectPage.frame"));
                        flag = nclWebActions.setValue(value, getObjMap("customsrejectPage.NotesFields2"), key);
                        nclWebActions.webDriver.switchTo().defaultContent();
                    } catch (Exception ex) {
                    }
                }
                case "Desirednextstatus" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("EditOffloadForm.Desirednextstatus"), key);
                }
                case "Returnoffloadformbacktome" -> {
                    flag = nclWebActions.setValue(value, getObjMap("EditOffloadForm.Returnoffloadformbacktome"), key);
                }

                case "Offloadform2" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("AmendEditOffloadFormPage.Offloadform2"), key);
                }
                case "Offloadform3" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("ExportOfflaodFormPdf.Offloadform3"), key);
                }

                case "exportform1" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("ExportOfflaodFormPdf.exportform1"), key);
                }

                case "edit1" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("StatusBrokerSubmittedToCustomsPage.edit1"), key);
                }
                case "edit2" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadstatuscustomsapprovePage.edit2"), key);
                }
                case "searchbox" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("AmendEditOffloadFormPage.searchbox"), key);
                }
                case "searchbar1" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("ExportOfflaodFormPdf.searchbar1"), key);
                }
                case "searchbar3" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("pdfExportOffloadPage.searchbar3"), key);
                }
                case "searchbar4" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("ExportDraftPage.searchbar4"), key);
                }
                case "searchbar5" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("OffloadEventDocumentPage.searchbar5"), key);
                }
                case "searchbar6" -> {
                    nclWebActions.waitForElement("StatusBrokerSubmittedToCustomsPage.searchbar6");
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("StatusBrokerSubmittedToCustomsPage.searchbar6"), key);
                }
                case "searchbar" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("EditOffloadForm.searchbar"), key);
                }
                case "customsapprove" -> {
                    try {
                        Thread.sleep(1000);
                        flag = nclWebActions.clickValue(value, getObjMap("OffloadstatuscustomsapprovePage.customsapprove"), key);
                    } catch (Exception ex) {
                    }
                }
                case "searchbar7" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("OffloadstatuscustomsapprovePage.searchbar7"), key);
                }
                case "searchbar8" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("customsrejectPage.searchbar8"), key);
                }

                case "customsreject" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("customsrejectPage.customsreject"), key);
                }
                case "status" -> {
                    flag = nclWebActions.clickValue("CLICK", getObjMap("OffloadstatuscustomsapprovePage.status"), key);
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("OffloadstatuscustomsapprovePage.status"), key);


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
                case "Edit5" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("AmendEditOffloadFormPage.Edit5"), key);
                }
                case "editicon" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("EmailOffloadFormPage.editicon"), key);
                }
//                case "NotesFields" -> {
//                    try {
//                        Thread.sleep(5000);
//                        flag = nclWebActions.switchFrames(getObjMap("AmendEditOffloadFormPage.frame"));
//                        flag = nclWebActions.setValue(value, getObjMap("AmendEditOffloadFormPage.NotesFields"), key);
//                        nclWebActions.webDriver.switchTo().defaultContent();
//                    } catch (Exception ex) {
//                    }
//                    //nclWebActions.webDriver.switchTo().frame("//iframe[@class='cke_wysiwyg_frame cke_reset']");

                //}
                case "CreateAmend" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("AmendEditOffloadFormPage.CreateAmend"), key);
                }
                case "rejectreason" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("ExportOfflaodFormPdf.Offloadform3"), key);}
                 default -> {
                    throw new RuntimeException("Field " + key + " is not defined in page " + sheetName + " class");
                }
            }
            if (!flag) throw new RuntimeException("Failed at " + key + " in page " + sheetName + " class");
        }
    }
}
