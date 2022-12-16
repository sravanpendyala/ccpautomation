package com.ncl.ccp.stepdef.ccpapp;

import com.codoid.products.exception.FilloException;
import com.ncl.ccp.pages.ccp.OffloadeventsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.IOException;

public class Offloadevents {
       @Autowired
       OffloadeventsPage offloadeventsPage;

    @And("click on {string} in Offload Event tab")
    public void clickOnInOffloadEventTab(String data) { offloadeventsPage.performActions(data);}
    @And("click on {string} in confirm window")
    public void clickOnInConfirmWindow(String data) { offloadeventsPage.performActions(data);}
    @When("click on {string} button in offload events page")
    public void clickOnButtonInOffloadEventsPage(String data) { offloadeventsPage.performActions(data);}
    @When("Select {string} from vessel itinenary")
    public void selectFromVesselItinenary(String data) { offloadeventsPage.performActions(data);}
    @When("Click on {string} button")
    public void clickOnButton(String data) { offloadeventsPage.performActions(data);}
    @And("enter data into {string} text field")
    public void enterDataIntoTextField(String data) { offloadeventsPage.performActions(data);}
    @Then("{string} page should be displayed")
    public void pageShouldBeDisplayed(String data) { offloadeventsPage.performActions(data);}
    @When("search and edit the {string} searchbox")
    public void searchAndEditTheSearchbox(String data) { offloadeventsPage.performActions(data);}

    @And("enter data into {string} new offload events page")
    public void enterDataIntoNewOffloadEventsPage(String data) { offloadeventsPage.performActions(data);}
}
    

