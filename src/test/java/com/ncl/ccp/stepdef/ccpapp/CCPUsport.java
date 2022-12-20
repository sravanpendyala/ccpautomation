package com.ncl.ccp.stepdef.ccpapp;

import com.ncl.ccp.pages.ccp.CCPUsportPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class CCPUsport {

    @Autowired
    CCPUsportPage CCPUsportPage;

//    @When("click to {string} offload option")
//    public void clickToOffloadOption (String data) { CCPUsportPage.performActions(data); }

    @When("click on {string} offload options")
    public void clickOnOffloadOptions(String data) { CCPUsportPage.performActions(data); }

//
//    @And("click on {string} option")
//    public void clickOnOption(String data) { CCPUsportPage.performActions(data); }

    @And("click on {string} buttons")
    public void clickOnButtons(String data) { CCPUsportPage.performActions(data); }

    @Then("in new offloadform page Select {string}")
    public void inNewOffloadFormPageSelect(String data) { CCPUsportPage.performActions(data); }

    @When("click on {string} dropdownarrow")
    public void clickOnDropdownarrow(String data) { CCPUsportPage.performActions(data); }

    @When("select {string} option from the offload purpose dropdown")
    public void selectOptionFromTheOffloadPurposeDropdown(String data) { CCPUsportPage.performActions(data); }

    @And("click on {string} button in new offload form page")
    public void clickOnButtonInNewOffloadFormPage(String data) { CCPUsportPage.performActions(data); }

    @And("enter values in {string} CompanyName,Address,Zipcode,city,country,state and click on save button")
    public void enterValuesInCompanyNameAddressZipcodeCityCountryStateAndClickOnSaveButton(String data) { CCPUsportPage.performActions(data); }

    @Then("destination address should be displayed {string}")
    public void destinationAddressShouldBeDisplayed(String data) { CCPUsportPage.performActions(data); }

    @When("click on {string} tab and then click on AddItem")
    public void clickOnTabAndThenClickOnAddItem(String data) { CCPUsportPage.performActions(data); }

    @And("enter Item details in {string} description,Use of Item and composite of material")
    public void enterItemDetailsInDescriptionUseOfItemAndCompositeOfMaterial(String data) { CCPUsportPage.performActions(data); }

    @And("enter Item measurement details in {string} package type,quantity,weight per each and weight per each UOM")
    public void enterItemMeasurementDetailsInPackageTypeQuantityWeightPerEachAndWeightPerEachUOM(String data) { CCPUsportPage.performActions(data); }

    @And("enter Item manufacturer details in {string} country of origin")
    public void enterItemManufacturerDetailsInCountryOfOrigin(String data) { CCPUsportPage.performActions(data); }

    @And("enter Item valuation details in {string} valuationtype,AcquisitionPurchaseOrderNumber,AcquisitionDate,AcquisitionUnitCost and click on save")
    public void enterItemValuationDetailsInValuationTypeAcquisitionPurchaseOrderNumberAcquisitionDateAcquisitionUnitCostAndClickOnSave(String data) { CCPUsportPage.performActions(data); }

    @When("click on {string} tab and click on Add Note")
    public void clickOnTabAndClickOnAddNote(String data) { CCPUsportPage.performActions(data); }

    @Then("enter {string} in text box and click on OK button")
    public void enterInTextBoxAndClickOnOKButton(String data) { CCPUsportPage.performActions(data); }

    @And("added notes should get displayed {string}")
    public void addedNotesShouldGetDisplayed(String data) { CCPUsportPage.performActions(data); }

    @When("click on {string} tab and then click on SelectFile")
    public void clickOnTabAndThenClickOnSelectFile(String data) { CCPUsportPage.performActions(data); }
    @And("click on {string} button in edit offload form page")
    public void clickOnButtonInEditOffloadFormPage(String data) { CCPUsportPage.performActions(data); }

    @Then("enter {string} and click on enter")
    public void enterAndClickOnEnter(String data) { CCPUsportPage.performActions(data); }

    @And("click on {string} in edit off load form page")
    public void clickOnInEditOffLoadFormPage(String data) { CCPUsportPage.performActions(data); }

    @And("enter Item valuation details in {string} valuationtype,AcquisitionUnitCost and click on save")
    public void enterItemValuationDetailsInValuationtypeAcquisitionUnitCostAndClickOnSave(String data) { CCPUsportPage.performActions(data); }

    @When("enter offloadform in warehouse approval requested status in {string}")
    public void enterOffloadformInWarehouseApprovalRequestedStatusIn(String data) { CCPUsportPage.performActions(data); }

    @And("select the offload form and click on {string}")
    public void selectTheOffloadFormAndClickOn(String data) { CCPUsportPage.performActions(data); }

    @And("click on {string} button to do warehouse approve")
    public void clcikOnButtomToDoWarehouseApprove(String data) { CCPUsportPage.performActions(data); }

    @Then("Verify status after warehouse approve {string}")
    public void verify_status_after_warehouse_approve(String data) {
        CCPUsportPage.performActions(data);
    }

//    @And("click on {string} button to do warehouse Reject")
//    public void clcikOnButtonToDoWarehouseReject(String data) { usportPage.performActions(data); }

    @And("click on {string} button and enter reject reason and note and click on save")
    public void clickOnButtonAndEnterRejectReasonAndNoteAndClickOnSave(String data) {
        CCPUsportPage.performActions(data);
    }

    @Then("Verify status is as WareHouse Approve Requested {string}")
    public void verifyStatusIsAsWareHouseApproveRequested(String data) { CCPUsportPage.performActions(data);    }

    @When("enter offloadform in {string} and check the status")
    public void enterOffloadformInAndCheckTheStatus(String data) { CCPUsportPage.performActions(data);    }

    @Then("Verify status {string}")
    public void verifyStatus(String data) { CCPUsportPage.performActions(data);    }

    @And("delete offload form {string}")
    public void deleteOffloadForm(String data) { CCPUsportPage.performActions(data);    }

    @And("click on {string} button to close")
    public void clickOnButtonToClose(String data) { CCPUsportPage.performActions(data);    }

    @And("click on {string} button so the status will change to Purser_GSAM_Released")
    public void clickOnButtonSoTheStatusWillChangeToPurser_GSAM_Released(String data) { CCPUsportPage.performActions(data);    }

    @When("click on {string} tab and then click on editItem")
    public void clickOnTabAndThenClickOnEditItem(String data) { CCPUsportPage.performActions(data);    }

    @And("enter broker details {string} and click on update")
    public void enterBrokerDetailsAndClickOnUpdate(String data) { CCPUsportPage.performActions(data);    }

    @And("click on {string} button so the staus changed to Pre_EntryReviewCompleted")
    public void clickOnButtonSoTheStausChangedToPre_EntryReviewCompleted(String data) { CCPUsportPage.performActions(data);    }

    @When("click on {string} tab")
    public void clickOnTab(String data) { CCPUsportPage.performActions(data);    }

    @And("enter reject reason and note and click on save for {string}")
    public void enterRejectReasonAndNoteAndClickOnSaveFor(String data) { CCPUsportPage.performActions(data);    }

    @When("enter offloadform in PurserGSAMReleased status in {string}")
    public void enterOffloadformInPurserGSAMReleasedStatusIn(String data) { CCPUsportPage.performActions(data);    }

}

