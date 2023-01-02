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
public class EditOffloadFormPage extends NCLEnvData {
    private static final Logger LOGGER = LoggerFactory.getLogger(UsportPage.class);

    private static final String sheetName = "EditOffloadFormPage";
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

                case "Editbutton" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("EditOffloadForm.Editbutton"), key);
                }
                case "offloadformpdf5" -> {
                    try{
                        flag = nclWebActions.clickValue(value, getObjMap("EmailOffloadForm.offloadformpdf"), key);
                        Thread.sleep(6000);
                    } catch (Exception ex) {
                    }
                }
                case "edit1" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("EditOffloadForm.edit1"), key);
                }
                case "edit4" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("ExportOfflaodFormPdf.edit4"), key);
                }

                case "to" -> {
                    flag = nclWebActions.setValue(value, getObjMap("EmailOffloadForm.to"), key);
                    try {
                        Thread.sleep(5000);
                    } catch (Exception ex) {
                    }

                }


                case "NotesFields1" -> {
                    //String b = "test";
                    try{
                        flag = nclWebActions.switchFrames(getObjMap("EditOffloadForm.frame"));
                        Thread.sleep(5000);
                        flag = nclWebActions.setValue(value, getObjMap("EditOffloadForm.NotesFields1"), key);
                        nclWebActions.webDriver.switchTo().defaultContent();
                    } catch (Exception ex) {
                    }
                }
                case "edit2" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadstatuscustomsapprovePage.edit2"), key);
                }
                case "Recallbutton" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("EditOffloadForm.Recallbutton"), key);
                }


                case "exportform1" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("ExportOfflaodFormPdf.exportform1"), key);
                }


                case "Message" -> {
                    //flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("EmailOffloadForm.Message"), key);
                    try {
                        Thread.sleep(5000);

                        flag = nclWebActions.switchFrames(getObjMap("EmailOffloadForm.frame"));
                        //nclWebActions.webDriver.switchTo().frame("//iframe[@class='cke_wysiwyg_frame cke_reset']");
                        Thread.sleep(5000);
                        flag = nclWebActions.setValue(value, getObjMap("EmailOffloadForm.Message"), key);
                        Thread.sleep(5000);
                        nclWebActions.webDriver.switchTo().defaultContent();
                    } catch (Exception ex) {
                    }

                    /*if (flag)
                        nclWebActions.webDriver.switchTo().frame(nclWebActions.webDriver.findElement(By.xpath("//html[@dir='ltr']")));
                        flag = nclWebActions.setValue(value, getObjMap("EmailOffloadForm.Message"), key);
                    nclWebActions.webDriver.switchTo().defaultContent();*/

                }
                case "RecallReason" -> {
                    //String a = "sravan.bar";
                    flag = nclWebActions.setValue(value, getObjMap("EditOffloadForm.RecallReason"), key);
                }

                case "NotesFields" -> {
                    try {
                        Thread.sleep(8000);
                        flag = nclWebActions.switchFrames(getObjMap("EditOffloadForm.frame"));
                        flag = nclWebActions.setValue(value, getObjMap("EditOffloadForm.NotesFields"), key);
                        nclWebActions.webDriver.switchTo().defaultContent();
                    } catch (Exception ex) {
                    }
                }
                case "Desirednextstatus" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("EditOffloadForm.Desirednextstatus"), key);
                }
                case "Returnoffloadformbacktome" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("EditOffloadForm.Returnoffloadformbacktome"), key);
                }

                case "update" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadEventDocumentPage.update"), key);
                }

                case "offloadform" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("StatusBrokerSubmittedToCustomsPage.offloadform"), key);
                }
                case "offloadform1" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("customsrejectPage.offloadform1"), key);
                }
                case "entrynumber" -> {
                    // nclWebActions.scrollDown1("EditOffloadForm.entrynumber");
                    flag = nclWebActions.setValue(value, getObjMap("EditOffloadForm.entrynumber"), key);
                }
                case "sendtocustoms" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("EditOffloadForm.maxbutton"), key);

                    try {
                        Thread.sleep(5000);
                        flag = nclWebActions.clickValue(value, getObjMap("EditOffloadForm.sendtocustoms"), key);
                    } catch (Exception ex) {
                    }
                }
                case "selectfile" -> {    flag = nclWebActions.setValue(value, getObjMap("OffloadEventDocumentPage.selectfile"), key);}
                case "selectfile2" -> {    flag = nclWebActions.setValue(value, getObjMap("FileEventDocumentPage.selectfile2"), key);}
                case "CE1302draft" -> {
                    try {
                        Thread.sleep(5000);
                        flag = nclWebActions.clickValue(value, getObjMap("ExportDraftPage.CE1302draft"), key);
                        Thread.sleep(5000);
                    }catch (Exception ex) {
                    }
                }
                case "offloadformpdf1" -> {
                    //        flag = nclWebActions.clickValue(value, getObjMap("ExportOfflaodFormPdf.offloadformpdf"), key);
                    try {
                        Thread.sleep(5000);
                        flag = nclWebActions.clickValue(value, getObjMap("pdfExportOffloadPage.offloadformpdf1"), key);
                        Thread.sleep(6000);
                    } catch (Exception ex) {
                    }
                }
                case "offloadformpdf" -> {
                    try {
                        Thread.sleep(5000);
                        flag = nclWebActions.clickValue(value, getObjMap("ExportOfflaodFormPdf.offloadformpdf"), key);
                        Thread.sleep(5000);

                    } catch (Exception ex) {
                    }
                }
                case "customsformpdf" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CustomsExportFormPdf.customsformpdf"), key);
                    // System.out.println("hai");
                    try {
                        Thread.sleep(5000);
                    } catch (Exception ex) {
                    }
                }
                case "offloadformxls" -> {
                    //nclWebActions.webDriver.findElement(By.xpath("//li[@title='Export Offload Form in Excel format')]"));
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadExportFormXl.offloadformxls"), key);
                    if (flag)
                        try {
                            Thread.sleep(5000);
                            flag = nclWebActions.clickValue(value, getObjMap("pdfExportOffloadPage.offloadformpdf1"), key);
                            Thread.sleep(5000);
                        } catch (Exception ex) {
                        }
                }
                case "customsformxls" -> {
                    try{
                        Thread.sleep(50000);
                        //nclWebActions.webDriver.findElement(By.xpath("//li[@title='Export Offload Form in Excel format')]"));
                        flag = nclWebActions.clickValue(value, getObjMap("ExportCustomsFormXl.customsformxls"), key);
                        Thread.sleep(5000);
                    } catch (Exception ex) {
                    }
                }

                case "Finalrejection" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("customsrejectPage.Finalrejection"), key);
                }
                default -> {
                    throw new RuntimeException("Field " + key + " is not defined in page " + sheetName + " class");
                }
            }
            if (!flag) throw new RuntimeException("Failed at " + key + " in page " + sheetName + " class");

        }
    }
}
