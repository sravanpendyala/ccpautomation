package com.ncl.ccp.stepdef.ccpapp;


import com.ncl.ccp.pages.ccp.AmendEditOffloadFormPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class AmendEditOffloadForm {

    @Autowired
    AmendEditOffloadFormPage amendEditOffloadPage;

    @When("click on the {string} in the offload form page")
    public void clickOnTheInTheOffloadFormPage(String data) {
        amendEditOffloadPage.performActions(data);
    }
    @Then("Enter already existing {string} offload event")
    public void enterAlreadyExistingOffloadEvent(String data) { amendEditOffloadPage.performActions(data); }
    @And("Click on {string} in the offload form.")
    public void clickOnInTheOffloadForm(String data) {
        amendEditOffloadPage.performActions(data);
    }
    @When("Click on {string} in the offload")
    public void clickOnInTheOffload(String data) {
        amendEditOffloadPage.performActions(data);
    }
    @Then("fill the {string} in the amend window")
    public void fillTheInTheAmendWindow(String data) {
        amendEditOffloadPage.performActions(data);
    }
    @And("fill the {string} in the amend")
    public void fillTheInTheAmend(String data) {
        amendEditOffloadPage.performActions(data);
    }
    @And("click on {string} in amend window")
    public void clickOnInAmendWindow(String data) {
        amendEditOffloadPage.performActions(data);
    }
    @When("enter existing {string} in Search box")
    public void enterExistingInSearchBox(String data) {
        amendEditOffloadPage.performActions(data);
    }
    @When("enter value in {string} and search")
    public void enterValueInAndSearch(String data) {
        amendEditOffloadPage.performActions(data);
    }
    @And("Click on {string} in the offload event.")
    public void clickOnInTheOffloadEvent(String data) {
        amendEditOffloadPage.performActions(data);
    }
}





