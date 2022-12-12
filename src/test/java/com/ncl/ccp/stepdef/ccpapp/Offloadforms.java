package com.ncl.ccp.stepdef.ccpapp;

import com.ncl.ccp.pages.ccp.OffloadeventsPage;
import com.ncl.ccp.pages.ccp.OffloadformsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class Offloadforms {
       @Autowired
       OffloadformsPage offloadformsPage;

       @Then("{string} should be displayed")
    public void shouldBeDisplayed(String data) { offloadformsPage.performActions(data);}
    @When("search and edit the {string}")
    public void searchAndEditThe(String data) { offloadformsPage.performActions(data);}
    @When("click on {string} in offload forms tab")
    public void clickOnInOffloadFormsTab(String data) { offloadformsPage.performActions(data);}

    @And("enter data in to rejectreason, notes and click on {string}")
    public void enterDataInToRejectreasonNotesAndClickOn(String data) { offloadformsPage.performActions(data);}

}


