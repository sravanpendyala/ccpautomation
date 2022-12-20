package com.ncl.ccp.stepdef.ccpapp;

import com.ncl.ccp.pages.ccp.EditOffloadFormPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class EditOffloadForm {


    @Autowired
    EditOffloadFormPage editOffloadFormPage;

    @And("click on {string}")
    public void clickOn(String data) {
        editOffloadFormPage.performActions(data);

    }

    @And("fill the {string} in the recall window")
    public void fillTheInTheRecallWindow(String data) {
        editOffloadFormPage.performActions(data);
    }

    @And("click on {string} in recall window")
    public void clickOnInRecallWindow(String data) {

        editOffloadFormPage.performActions(data);
    }

    @Then("click on dropdown {string} in recall window")
    public void clickOnDropdownInRecallWindow(String data) {
        editOffloadFormPage.performActions(data);
    }

    @And("fill the {string} in the window")
    public void fillTheInTheWindow(String data) {
        editOffloadFormPage.performActions(data);
    }

    @When("click on the {string} for the existing offload event")
    public void clickOnTheForTheExistingOffloadEvent(String data) {
        editOffloadFormPage.performActions(data);

    }

    @When("navigate to {string} option")
    public void navigateToOption(String data) {
        editOffloadFormPage.performActions(data);

    }

    @Then("offload event page should be displayed {string}")
    public void offloadEventPageShouldBeDisplayed(String data) {
        editOffloadFormPage.performActions(data);

    }

    @When("click on the {string} for the offload event created previously")
    public void clickOnTheForTheOffloadEventCreatedPreviously(String data) {
        editOffloadFormPage.performActions(data);

    }

    @And("click {string} option for oofload form")
    public void clickOptionForOofloadForm(String data) {
        editOffloadFormPage.performActions(data);
    }

    @And("{string} pdf file")
    public void pdfFile(String data) {
        editOffloadFormPage.performActions(data);
    }


    @And("click {string} option for offload form")
    public void clickOptionForOffloadForm(String data) {editOffloadFormPage.performActions(data);

    }

    @And("click {string} option for exportform button")
    public void clickOptionForExportformButton(String data) { editOffloadFormPage.performActions(data);

    }
    @And("click on {string}in window")
    public void clickOnInWindow(String data) { editOffloadFormPage.performActions(data);
    }

    @And("click {string} option for email")
    public void clickOptionForEmail(String data) {editOffloadFormPage .performActions(data);
    }

    @And("click {string} option for email button")
    public void clickOptionForEmailButton(String data) {editOffloadFormPage.performActions(data);
    }

    @And("Enter {string} option for email button")
    public void enterOptionForEmailButton(String data) {editOffloadFormPage.performActions(data);
    }

    @And("click on {string} drpdwn in offload form")
    public void clickOnDrpdwnInOffloadForm(String data) {editOffloadFormPage.performActions(data);
    }
    @And("select {string} option")
    public void selectOption(String data) {editOffloadFormPage.performActions(data);
    }
    @And("click {string} option")
    public void clickOption(String data) {editOffloadFormPage.performActions(data);
    }
}


