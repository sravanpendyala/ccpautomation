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
public class UsportPage extends NCLEnvData {
    private static final Logger LOGGER = LoggerFactory.getLogger(UsportPage.class);

    private static final String sheetName = "UsportPage";
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
                case "Vesselsoffloads" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.Vesselsoffloads"), key);
                }
                case "vesseloffload" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("ExportOfflaodFormPdf.Offloadform"), key);
                }
                case "vesseloffload8" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("EditOffloadForm.vesseloffload8"), key);
                }
                case "Offloadresponse" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.Offloadresponse"), key);
                }
                case "oedrpages" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.Searchdatavalue"), key);
                }
                case "Searchdatavalues" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("UsportPage.Searchdatavalue"), key);
                }
                case "Editoffload" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.Editoffload"), key);
                }
                case "Numberofoffloads" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.Numberofoffloads"), key);
                }
                case "Offloaddata" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("UsportPage.offloaddatav"), key);
                }

                case "Offloadupdate" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.Offloadupdates"), key);
                    //  nclWebActions.waitForElementClose("UsportPage.Offloadupdates");
                }
                case "Qty" -> {
                    String a = "Yes (2)";
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.qty", a), key);
                }
                case "Offloadforms" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.Offloadform"), key);
                }
                case "offloadform" -> {
                    try{
                        flag = nclWebActions.clickValue(value, getObjMap("EmailOffloadForm.offloadform"), key);
                    }
                    catch (Exception e) {
                    }


                }
                case "offloadform1" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("OffloadstatuscustomsrejectPage.offloadform1"), key);
                }

                case "Offloadform2" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.Offloadform2"), key);
                }
                case "Offloadforms3" -> {
                    flag = nclWebActions.setValue(value, getObjMap("ExportOfflaodFormPdf.Offloadforms3"), key);
                }
                case "Offloadforms4" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CustomsExportFormPdf.Offloadforms4"), key);
                }
                case "Offloadforms5" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("EditOffloadForm.Offloadforms5"), key);
                }


                case "CreateNewOffloadforms" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.CreateNewOffloadform"), key);
                }
                case "Offloadeventdropdowns" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.Offloadeventdropdown"), key);
                }
                case "Offloadeventdropdownval" -> {
                    String[] a = value.split("\\|");
                    try {
                        flag = nclWebActions.clickValue(a[1], getObjMap("UsportPage.Offloadeventdropdownsingle",a[0]), key);
                    }
                    catch (Exception e) {
                    }
                }
                case "Offloadeventdropdownvaluee2e" -> {
                    value = NCLHooks.getRuntimeData(value);
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("UsportPage.Offloadeventdropdowne2e"), key);

                }
                case "offloadpuropsedropdownclick" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.offloadpuropsedropdown"), key);
                }
                case "offloadpuropsedropdown" -> {
                    String[] b = value.split("\\|");
                    try {
                        flag = nclWebActions.clickValue(b[1], getObjMap("UsportPage.Offloadpuropse",b[0]), key);
                    }
                    catch (Exception e) {
                    }
                }
                case "offloadpurposedropdown" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.offloadpurposedropdown"), key);
                }
                case "offloadpurposevalue" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("UsportPage.offloadpurposevalue"), key);
                    if (flag)
                        flag = nclWebActions.clickValue(value, getObjMap("UsportPage.maximizeicon"), key);
                }
                case "saveOffloadForm" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.saveOffloadForm"), key);
                    //nclWebActions.scrollByElement("UsportPage.destinationAddress");
                    nclWebActions.scrollDown();
                }

                case "destinationAddress" -> {
                    // nclWebActions.waitForElement("UsportPage.destinationAddress");
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.destinationAddress"), key);

                }

                case "companynameval"-> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("UsportPage.companyname"), key);
                }

                case "Address1val"-> {
                    flag = nclWebActions.setValue(value, getObjMap("UsportPage.Address1"), key);
                }
                case "ZipCodeVal" -> {
                    flag = nclWebActions.setValue(value, getObjMap("UsportPage.ZipCode"), key);
                }
                case "cityVal" -> {
                    flag = nclWebActions.setValue(value, getObjMap("UsportPage.city"), key);
                }

                case "countryVal" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.country"), key);
                }

                case "countryValEdit" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("UsportPage.countrySearchEdit"), key);
                    //nclWebActions.waitForElement("UsportPage.state");
                }

                case "stateVal" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.state"), key);
                    //nclWebActions.waitForElement("UsportPage.stateSearchEdit");
                }

                case "stateValEdit" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("UsportPage.stateSearchEdit"), key);
                }

                case "save" ,"saveNewItem" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.saveNewDestAddress"), key);
                }

                case "validateAddressVal" -> {
                    String address = "Final Destination";
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.validateAddress",address), key);
                }

                case "itemsTabClick" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.itemsTab"), key);
                }
                case "addItemClick" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.Additem"), key);
                }

                case "description" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("UsportPage.itemDescripption"), key);
                }

                case "useOfItemval" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("UsportPage.useOfItem"), key);
                }
                case "CompositeOfMaterialVal" -> {
                    flag = nclWebActions.setValue(value, getObjMap("UsportPage.CompositeOfMaterial"), key);
                }

                case "PackageTypeClick" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.PackageType"), key);
                }

                case "PackageTypeVal" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("UsportPage.PackageTypeEdit"), key);
                }
                case "itemQtyVal" -> {
                    flag = nclWebActions.setValue(value, getObjMap("UsportPage.itemQty"), key);
                }
                case "WeightPerEachUOM" -> {
                    flag = nclWebActions.setValue(value, getObjMap("UsportPage.WeightPerEachUOM"), key);
                }

                case "WeightPerEachUOMval" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.WeightPerEachUOMval"), key);
                }

                case "WeightPerEachUOMvalEdit" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("UsportPage.WeightPerEachUOMvalEdit"), key);
                }

                case "CountryOfOriginClick" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.CountryOfOrigin"), key);
                }

                case "CountryOfOriginVal" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("UsportPage.CountryOfOriginEdit"), key);
                }

                case "ValuationTypeClick" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.ValuationType"), key);
                }

                case "ValuationTypeEditVal" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("UsportPage.ValuationTypeEdit"), key);
                }
                case "AcquisitionPurchaseOrderNumVal" -> {
                    flag = nclWebActions.setValue(value, getObjMap("UsportPage.AcquisitionPurchaseOrderNum"), key);
                }

                case "AcquisitionDateVal" -> {
                    flag = nclWebActions.setValue(value, getObjMap("UsportPage.AcquisitionDate"), key);
                }

                case "AcquisitionUnitCostVal" -> {
                    flag = nclWebActions.setValue(value, getObjMap("UsportPage.AcquisitionUnitCost"), key);
                }

                case "notesTabClick" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.NotesTab"), key);
                }

                case "addNoteClick" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.AddNoteCLick"), key);
                    // nclWebActions.waitForElement("UsportPage.AddNoteText");
                }

                case "addNoteText" -> {
                    //nclWebActions.webDriver.switchTo().frame(nclWebActions.webDriver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
                    flag = nclWebActions.switchFrames("//iframe[@class='cke_wysiwyg_frame cke_reset']");
                    if (flag) {
                        //nclWebActions.webDriver.switchTo().frame(nclWebActions.webDriver.findElement(By.xpath("//html[@dir='ltr']")));
                        // flag = nclWebActions.setValue(value, getObjMap("EditOffloadForm.NotesFields"), key);
                        flag = nclWebActions.setValue(value, getObjMap("UsportPage.AddNoteText"), key);
                        nclWebActions.webDriver.switchTo().defaultContent();
                    }
                }
                case "clickOK" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.OK"), key);
                }

                case "newNoteVal" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.newNote"), key);
                }

                case "AttachedFilesTabClick" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.AttachedFilesTab"), key);
                }

                case "SelectFileClick" -> {
                    flag = nclWebActions.setValue(value, getObjMap("UsportPage.SelectFile"), key);

                }

                case "SubmitClick" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("UsportPage.Submit"), key);
                }
                case "offloadevent" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("pdfExportOffloadPage.offloadevent"), key);
                }
                case "Clickonoffloadform" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("EditOffloadForm.Clickonoffloadform"), key);
                }


                default -> {
                    throw new RuntimeException("Field " + key + " is not defined in page " + sheetName + " class");
                }
            }
            if (!flag) throw new RuntimeException("Failed at " + key + " in page " + sheetName + " class");
        }
    }
}
