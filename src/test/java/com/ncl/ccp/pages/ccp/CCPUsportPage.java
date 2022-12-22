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
import java.util.HashMap;

@Component
public class CCPUsportPage extends NCLEnvData {
    private static final Logger LOGGER = LoggerFactory.getLogger(CCPUsportPage.class);

    private static final String sheetName = "CCPUsportPage";
    @Autowired
    NCLWebActions nclWebActions;
    public HashMap<String,String> strVesselRefNum= new HashMap<String,String>();


    public void performActions(String dataID)  {
        boolean flag = false;

        OrderedHashtable data = readData(sheetName, dataID);

        Enumeration<String> keys = data.enumerateKeys();

        while (keys.hasMoreElements()) {
            flag = false;
            String key = keys.nextElement();
            String value = data.get(key).toString();
            switch (key) {
                case "Vesselsoffloads" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.Vesselsoffloads"), key);
                }
                case "Offloadforms" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.Offloadform"), key);
                }
                case "CreateNewOffloadforms" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.CreateNewOffloadform"), key);
                }
                case "Offloadeventdropdowns" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.Offloadeventdropdown"), key);
                }
                case "Offloadeventdropdownval" -> {
                    String[] a = value.split("\\|");
                    try {
                        flag = nclWebActions.clickValue(a[1], getObjMap("CCPUsportPage.Offloadeventdropdownval",a[0]), key);
                    }
                    catch (Exception e) {
                    }
                    //nclWebActions.waitForElement("CCPUsportPage.Offloadpuropsedropdown");
                }

                case "Offloadpuropsedropdownclick" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.Offloadpuropsedropdown"), key);
                }
                case "DeleteOffloadForm" -> {
                    nclWebActions.waitForElement(getObjMap("CCPUsportPage.DeleteOffloadForm"));
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.DeleteOffloadForm"), key);
                }
                case "ClickYesDelete" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.DeleteOffloadFormYes"), key);
                }
                case "OffloadpuropseValue" -> {
                    String[] b = value.split("\\|");
                    try {
                        flag = nclWebActions.clickValue(b[1], getObjMap("CCPUsportPage.Offloadpuropse",b[0]), key);
                    }
                    catch (Exception e) {
                    }
                }

                case "saveOffloadFormClick" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.saveOffloadForm"), key);
                    //nclWebActions.waitForElement("CCPUsportPage.CloseWindow");
                }
                case "CloseWindow" -> {
                    //nclWebActions.waitForElement(getObjMap("CCPUsportPage.CloseWindow"));
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.CloseWindow"), key);
                }
                case "destinationAddressclick" -> {

                    String strActualVal=nclWebActions.getText(getObjMap("CCPUsportPage.VesselRefNum"));
                    String strVal=strActualVal.substring(19,36);
                    NCLHooks.setRuntimeData("VesselRefNumber",strVal);
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.destinationAddress"), key);
                    //nclWebActions.waitForElement("CCPUsportPage.companyname");
                }

                case "companynameval"-> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("CCPUsportPage.companyname"), key);
                }

                case "Address1val"-> {
                    flag = nclWebActions.setValue(value, getObjMap("CCPUsportPage.Address1"), key);
                }
                case "ZipCodeVal" -> {
                    flag = nclWebActions.setValue(value, getObjMap("CCPUsportPage.ZipCode"), key);
                }
                case "cityVal" -> {
                    flag = nclWebActions.setValue(value, getObjMap("CCPUsportPage.city"), key);
                }

                case "countryVal" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.country"), key);
                }

                case "countryValEdit" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("CCPUsportPage.countrySearchEdit"), key);
                    //nclWebActions.waitForElement("CCPUsportPage.state");
                }

                case "stateVal" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.state"), key);

                }

                case "stateValEdit" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("CCPUsportPage.stateSearchEdit"), key);
                }

                case "save" ,"saveNewItem" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.saveNewDestAddress"), key);
                }

                case "validateAddressVal" -> {
                    String address = "Final Destination";
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.validateAddress",address), key);
                }

                case "itemsTabClick" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.itemsTab"), key);
                }
                case "addItemClick" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.Additem"), key);
                }

                case "description" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("CCPUsportPage.itemDescripption"), key);
                }

                case "useOfItemval" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("CCPUsportPage.useOfItem"), key);
                }
                case "CompositeOfMaterialVal" -> {
                    flag = nclWebActions.setValue(value, getObjMap("CCPUsportPage.CompositeOfMaterial"), key);
                }

                case "PackageTypeClick" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.PackageType"), key);
                }

                case "PackageTypeVal" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("CCPUsportPage.PackageTypeEdit"), key);
                }
                case "itemQtyVal" -> {
                    flag = nclWebActions.setValue(value, getObjMap("CCPUsportPage.itemQty"), key);
                }
                case "WeightPerEachUOM" -> {
                    flag = nclWebActions.setValue(value, getObjMap("CCPUsportPage.WeightPerEachUOM"), key);
                }

                case "WeightPerEachUOMval" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.WeightPerEachUOMval"), key);
                }

                case "WeightPerEachUOMvalEdit" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("CCPUsportPage.WeightPerEachUOMvalEdit"), key);
                }

                case "CountryOfOriginClick" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.CountryOfOrigin"), key);
                }

                case "CountryOfOriginVal" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("CCPUsportPage.CountryOfOriginEdit"), key);
                }

                case "ValuationTypeClick" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.ValuationType"), key);
                }

                case "ValuationTypeEditVal" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("CCPUsportPage.ValuationTypeEdit"), key);
                }
                case "AcquisitionPurchaseOrderNumVal" -> {
                    flag = nclWebActions.setValue(value, getObjMap("CCPUsportPage.AcquisitionPurchaseOrderNum"), key);
                }

                case "AcquisitionDateVal" -> {
                    flag = nclWebActions.setValue(value, getObjMap("CCPUsportPage.AcquisitionDate"), key);
                }

                case "AcquisitionUnitCostVal" -> {
                    flag = nclWebActions.setValue(value, getObjMap("CCPUsportPage.AcquisitionUnitCost"), key);
                }

                case "notesTabClick" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.NotesTab"), key);
                }

                case "addNoteClick" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.AddNoteCLick"), key);
                    //nclWebActions.waitForElement("CCPUsportPage.AddNoteText");
                }

                case "addNoteText" -> {
                    flag = nclWebActions.switchFrames("//iframe[@class='cke_wysiwyg_frame cke_reset']");
                    if (flag) {
                        flag = nclWebActions.setValue(value, getObjMap("CCPUsportPage.AddNoteText"), key);
                        nclWebActions.webDriver.switchTo().defaultContent();
                    }
                }
                case "clickOK" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.OK"), key);
                }

                case "newNoteVal" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.newNote"), key);
                }

                case "AttachedFilesTabClick" -> {
                   // nclWebActions.waitForElement("CCPUsportPage.AttachedFilesTab");
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.AttachedFilesTab"), key);
                }

                case "SelectFileClick" -> {
         //           flag = nclWebActions.setValue(value, getObjMap("CCPUsportPage.SelectFile"), key);
                    flag = nclWebActions.setValue(value, getObjMap("CCPUsportPage.SelectFile"), key);
                    String[] b = value.split("\\|");
                    try {
                        flag = nclWebActions.setValue(b[1], getObjMap("CCPUsportPage.SelectFile",b[0]), key);
                    }
                    catch (Exception e) {
                    }
}
                case "SubmitClick" -> {
                    //nclWebActions.waitForElement("CCPUsportPage.VesselRefNum");
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.Submit"), key);
                    //nclWebActions.waitForElement(getObjMap("CCPUsportPage.searchbar1"));
                }
                case "searchbar1" -> {
                    value =NCLHooks.getRuntimeData(value);
                    flag = nclWebActions.setValue(value, getObjMap("CCPUsportPage.searchbar1"), key);
                }
                case "searchbar_vessel" -> {
//                    value =NCLHooks.getRuntimeData(value);
                    flag = nclWebActions.setValue(value, getObjMap("CCPUsportPage.searchbar1"), key);
                }

                case "brokerreview" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.brokerreview"), key);
                }
                case "exception" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.exception"), key);
                }

                case "editOffloadForm" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.edit1"), key);
                }
                case "update" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.update"), key);
                }
                case "tariffdropdown" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.tariffnumber"), key);
                }

                case "tariffnumber" -> {
                    flag = nclWebActions.setValueAndPressEnterKey(value, getObjMap("CCPUsportPage.tariffval"), key);
                    //nclWebActions.waitForElement("CCPUsportPage.state");
                }

                case "editItem" -> {
                    nclWebActions.waitForElement(getObjMap("CCPUsportPage.editItem"));
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.editItem"), key);
                }
                case "whseApprove" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.whseApprove"), key);
                }

                case "refresh"-> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.refreshOffloadForm"), key);
                }
                case "whseReject" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.whseReject"), key);
                }

                case "release" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.releasebutton"), key);
                }

                case "verifyStatusOffloadForm" -> {
                    nclWebActions.waitForElement(getObjMap("CCPUsportPage.refreshOffloadForm"));
                    String[] a = value.split("\\|");
                    try {
                        flag = nclWebActions.clickValue(a[1], getObjMap("CCPUsportPage.verifyStatusOffloadForm",a[0]), key);
                    }
                    catch (Exception e) {
                    }
                }
                case "RejectReason" -> {
                    flag = nclWebActions.setValue(value, getObjMap("CCPUsportPage.AddRejectReason"), key);
                }
                case "RejectNotes" -> {
                    flag = nclWebActions.switchFrames("//iframe[@class='cke_wysiwyg_frame cke_reset']");
                    if (flag) {
                        flag = nclWebActions.setValue(value, getObjMap("CCPUsportPage.AddRejectNote"), key);
                        nclWebActions.webDriver.switchTo().defaultContent();
                    }
                }
                case "SaveWhsReject" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.SaveWhsReject"), key);
                }
                case "StorageFrom" -> {
                    flag = nclWebActions.setValue(value, getObjMap("CCPUsportPage.WhseStorageFromDt"), key);
                }

                case "StorageTo" -> {
                    flag = nclWebActions.setValue(value, getObjMap("CCPUsportPage.WhseStorageToDt"), key);
                }

                case "StorageReason" -> {
                    flag = nclWebActions.setValue(value, getObjMap("CCPUsportPage.WhseStorageReason"), key);
                }

                case "userprofile" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.userprofile"), key);
                }
                case "logoutbutton" -> {
                    flag = nclWebActions.clickValue(value, getObjMap("CCPUsportPage.logoutbutton"), key);
                }
                default -> {
                    throw new RuntimeException("Field " + key + " is not defined in page " + sheetName + " class");
                }
            }
            if (!flag) throw new RuntimeException("Failed at " + key + " in page " + sheetName + " class");
        }
    }
}

