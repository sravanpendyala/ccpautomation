package com.ncl.ccp.stepdef.ccpapp;

import com.ncl.ccp.pages.ccp.UsportPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class Usport {

 @Autowired
 UsportPage usportPage;

 @And("click on {string} response option")
 public void clickOnResponseOption(String data) { usportPage.performActions(data); }
 @When("navigate to {string} option from vessels offload option")
 public void navigateToOptionFromVesselsOffloadOption(String data) {
  usportPage.performActions(data);
 }
 @Then("offload event department response page should be displayed {string}")
 public void offloadEventDepartmentResponsePageShouldBeDisplayed(String data) {
  usportPage.performActions(data);
 }
 @And("update number of {string} forms field dropdown")
 public void updateNumberOfFormsFieldDropdown(String data) {
  usportPage.performActions(data);
 }
 @Then("updated offload event department response page should be displayed {string}")
 public void updatedOffloadEventDepartmentResponsePageShouldBeDisplayed(String data) {
  usportPage.performActions(data); }
 @And("click on the {string} option for the offload event created previously")
 public void clickOnTheOptionForTheOffloadEventCreatedPreviously(String data) { usportPage.performActions(data); }
 // @When("click on {string} offload option")
 // public void clickOnOffloadOption(String data) { usportPage.performActions(data); }
 @When("enter {string} and click on search button")
 public void enterAndClickOnSearchButton(String data) {
  usportPage.performActions(data);
 }

 //mamatha//
 @When("click to {string} offload option")
 public void clickToOffloadOption (String data) { usportPage.performActions(data); }

 @When("click on {string} offload option")
 public void clickOnOffloadOption(String data) { usportPage.performActions(data); }


 @And("click on {string} option")
 public void clickOnOption(String data) { usportPage.performActions(data); }

 @Then("in new offload form page Select {string}")
 public void inNewOffloadFormPageSelect(String data) { usportPage.performActions(data); }

 @When("click on {string} dropdownarrow")
 public void clickOnDropdownarrow(String data) { usportPage.performActions(data); }

 @When("select {string} from the offload purpose dropdown")
 public void selectFromTheOffloadPurposeDropdown(String data) { usportPage.performActions(data); }

 @And("click on {string} button in new offload from page")
 public void clickOnButtonInNewOffloadFromPage(String data) { usportPage.performActions(data); }

 @And("enter values in {string} CompanyName,Address,Zipcode,city,country,state and click on save button")
 public void enterValuesInCompanyNameAddressZipcodeCityCountryStateAndClickOnSaveButton(String data) { usportPage.performActions(data); }

 @Then("destination address should be displayed {string}")
 public void destinationAddressShouldBeDisplayed(String data) { usportPage.performActions(data); }

 @When("click on {string} tab and then click on AddItem")
 public void clickOnTabAndThenClickOnAddItem(String data) { usportPage.performActions(data); }

 @And("enter Item details in {string} description,Use of Item and composite of material")
 public void enterItemDetailsInDescriptionUseOfItemAndCompositeOfMaterial(String data) { usportPage.performActions(data); }

 @And("enter Item measurement details in {string} package type,quantity,weight per each and weight per each UOM")
 public void enterItemMeasurementDetailsInPackageTypeQuantityWeightPerEachAndWeightPerEachUOM(String data) { usportPage.performActions(data); }

 @And("enter Item manufacturer details in {string} country of origin")
 public void enterItemManufacturerDetailsInCountryOfOrigin(String data) { usportPage.performActions(data); }

 @And("enter Item valuation details in {string} valuation type,AcquisitionPurchaseOrderNumber,AcquisitionDate,AcquisitionUnitCost and click on save")
 public void enterItemValuationDetailsInValuationTypeAcquisitionPurchaseOrderNumberAcquisitionDateAcquisitionUnitCostAndClickOnSave(String data) { usportPage.performActions(data); }

 @When("click on {string} tab and click on Add Note")
 public void clickOnTabAndClickOnAddNote(String data) { usportPage.performActions(data); }

 @Then("enter {string} in text box and click on OK")
 public void enterInTextBoxAndClickOnOK(String data) { usportPage.performActions(data); }

 @And("added notes should get displayed {string}")
 public void addedNotesShouldGetDisplayed(String data) { usportPage.performActions(data); }

 @When("click on {string} tab and then click on Select File")
 public void clickOnTabAndThenClickOnSelectFile(String data) { usportPage.performActions(data); }

 @And("click on {string} button in edit offload form page")
 public void clickOnButtonInEditOffloadFormPage(String data) { usportPage.performActions(data); }

 @Then("enter {string} and click on enter")
 public void enterAndClickOnEnter(String data) { usportPage.performActions(data); }

 @And("click on {string} in edit off load form page")
 public void clickOnInEditOffLoadFormPage(String data) { usportPage.performActions(data); }

 @And("enter Item valuation details in {string} valuation type,AcquisitionUnitCost and click on save")
 public void enterItemValuationDetailsInValuationTypeAcquisitionUnitCostAndClickOnSave(String data) { usportPage.performActions(data); }

 @And("click on {string} button in offload")
 public void clickOnButtonInOffload(String data) { usportPage.performActions(data); }

 @And("click on {string} option in dashboard page")
 public void clickOnOptionInDashboardPage(String data) { usportPage.performActions(data); }

 @And("click on {string} button in offloadforms page")
 public void clickOnButtonInOffloadformsPage(String data) { usportPage.performActions(data); }
}
