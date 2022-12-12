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
        // public void performActions(String dataID) {
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
                case "edit1" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("EditOffloadForm.edit1"), key);
                }
                case "Recallbutton" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("EditOffloadForm.Recallbutton"), key);
                }
                case "RecallReason" -> {
                    //String a = "sravan.bar";
                    flag = nclWebActions.setValue(value, getObjMap("EditOffloadForm.RecallReason"), key);
                }
                case "NotesFields" -> {
                    //String b = "test";
//                    nclWebActions.webDriver.switchTo().frame("//iframe[@allowtransparency='true')]");
                    //nclWebActions.webDriver.switchTo().frame(nclWebActions.webDriver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
                    flag = nclWebActions.switchFrames("//iframe[@class='cke_wysiwyg_frame cke_reset']");
                    if (flag)
                        //nclWebActions.webDriver.switchTo().frame(nclWebActions.webDriver.findElement(By.xpath("//html[@dir='ltr']")));
                        flag = nclWebActions.setValue(value, getObjMap("EditOffloadForm.NotesFields"), key);
                    nclWebActions.webDriver.switchTo().defaultContent();
                }
                case "Desirednextstatus" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("EditOffloadForm.Desirednextstatus"), key);
                }
                case "Returnoffloadformbacktome" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("EditOffloadForm.Returnoffloadformbacktome"), key);
                }
                case "offloadformpdf" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("ExportOfflaodFormPdf.offloadformpdf"), key);
                    try {
                        Thread.sleep(5000);
                    } catch (Exception ex) {
                    }
                }
                case "customsformpdf" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CustomsExportFormPdf.customsformpdf2"), key);
                    System.out.println("hai");
                    try {
                        Thread.sleep(5000);
                    } catch (Exception ex) {
                    }
                }
                case "offloadformxls" -> {
                    //nclWebActions.webDriver.findElement(By.xpath("//li[@title='Export Offload Form in Excel format')]"));
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadExportFormXl.offloadformxls"), key);

                    try {
                        Thread.sleep(5000);
                    } catch (Exception ex) {
                    }
                }
                    case "customsformxls" -> {
                        //nclWebActions.webDriver.findElement(By.xpath("//li[@title='Export Offload Form in Excel format')]"));
                        flag = nclWebActions.clickValue(value, getObjMap("OffloadExportFormXl.customsformxls"), key);

                        try {
                            Thread.sleep(5000);
                        } catch (Exception ex) {
                        }
                    }

                        default -> {
                            throw new RuntimeException("Field " + key + " is not defined in page " + sheetName + " class");
                        }
                    }
                if (!flag) throw new RuntimeException("Failed at " + key + " in page " + sheetName + " class");

                }
            }
        }