package com.ncl.ccp.stepdef.ccpapp;

import com.ncl.ccp.pages.ccp.ItineraryForUsPortPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class ItineraryForUsPort {

    @Autowired
    ItineraryForUsPortPage itineraryForUsPortPage;

    @When("navigate to {string} option from itineraries")
    public void navigateToOptionFromItineraries(String data) {
        itineraryForUsPortPage.performActions(data);
    }

    @Then("offload company vessel code itinerary day should be displayed {string}")
    public void offloadCompanyVesselCodeItineraryDayShouldBeDisplayed(String data) throws InterruptedException {
        itineraryForUsPortPage.performActions(data);
    }

    @Then("click on the {string} in the settings")
    public void clickOnTheInTheSettings(String data) throws InterruptedException {
        itineraryForUsPortPage.performActions(data);
    }

    @And("click on {string} option")
    public void clickOnOption(String data) {
        itineraryForUsPortPage.performActions(data);
    }

    @When("click on {string} button")
    public void clickOnButton(String data) {
        itineraryForUsPortPage.performActions(data);
    }

    @Then("click on {string} select value in new vessel itinerary")
    public void clickOnSelectValueInNewVesselItinerary(String data) {
        itineraryForUsPortPage.performActions(data);
    }

    @And("click {string} select value in the window")
    public void clickSelectValueInTheWindow(String data) throws InterruptedException {
        itineraryForUsPortPage.performActions(data);
    }

    @Then("enter {string}")
    public void enter(String data) throws InterruptedException {
        itineraryForUsPortPage.performActions(data);
    }

    @When("click on {string} select value")
    public void clickOnSelectValue(String data) throws InterruptedException {
        itineraryForUsPortPage.performActions(data);
    }

    @And("enter {string} in the window")
    public void enterInTheWindow(String data) throws InterruptedException {
        itineraryForUsPortPage.performActions(data);
    }

    @When("click on {string} change  data")
    public void clickOnChangeData(String data) throws InterruptedException {
        itineraryForUsPortPage.performActions(data);
    }

    @Then("enter data into {string} dropdown")
    public void enterDataIntoDropdown(String data) throws InterruptedException {
        itineraryForUsPortPage.performActions(data);
    }

    @When("click in to {string} button")
    public void clickInToButton(String data) throws InterruptedException {
        itineraryForUsPortPage.performActions(data);
    }

    @When("click in to {string}")
    public void clickInTo(String data) {
        itineraryForUsPortPage.performActions(data);
    }

    @And("enter data {string} dropdown")
    public void enterDataDropdown(String data) {
        itineraryForUsPortPage.performActions(data);
    }

    @Then("enter data {string}")
    public void enterData(String data) { itineraryForUsPortPage.performActions(data); }

    @Then("enter data into {string}")
    public void enterDataInto(String data) {
        itineraryForUsPortPage.performActions(data);
    }

    @And("click on {string} option link")
    public void clickOnOptionLink(String data) { itineraryForUsPortPage.performActions(data); }
}




