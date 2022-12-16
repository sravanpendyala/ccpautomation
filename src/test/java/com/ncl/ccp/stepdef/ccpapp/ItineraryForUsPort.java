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
    public void offloadCompanyVesselCodeItineraryDayShouldBeDisplayed(String data) { itineraryForUsPortPage.performActions(data);
    }
    @Then("click on {string} select value in new vessel itinerary")
    public void clickOnSelectValueInNewVesselItinerary(String data) {
        itineraryForUsPortPage.performActions(data);
    }
    @And("click {string} select value in the window")
    public void clickSelectValueInTheWindow(String data) { itineraryForUsPortPage.performActions(data);
    }
    @Then("enter {string}")
    public void enter(String data) { itineraryForUsPortPage.performActions(data); }
    @When("click on {string} select value")
    public void clickOnSelectValue(String data) { itineraryForUsPortPage.performActions(data); }
    @And("enter {string} in the window")
    public void enterInTheWindow(String data) { itineraryForUsPortPage.performActions(data); }
    @And("enter data {string} dropdown")
    public void enterDataDropdown(String data) {
        itineraryForUsPortPage.performActions(data);
    }
    @Then("enter data {string}")
    public void enterData(String data) { itineraryForUsPortPage.performActions(data); }
    @Then("enter data into {string}")
    public void enterDataInto(String data) { itineraryForUsPortPage.performActions(data); }
    @And("click on {string} button option")
    public void clickOnButtonOption(String data) { itineraryForUsPortPage.performActions(data); }

    @And("click on {string} in new vessel itinerary form")
    public void clickOnInNewVesselItineraryForm(String data) { itineraryForUsPortPage.performActions(data); }

    @When("click on {string} change data")
    public void clickOnChangeData(String data) { itineraryForUsPortPage.performActions(data); }

    @And("click on {string} checkbox")
    public void clickOnCheckbox(String data) { itineraryForUsPortPage.performActions(data); }

    @Then("{string} itineraries page should be displayed")
    public void itinerariesPageShouldBeDisplayed(String data) { itineraryForUsPortPage.performActions(data); }

    @When("enter {string} in itineraries from date")
    public void enterInItinerariesFromDate(String data) { itineraryForUsPortPage.performActions(data); }
}




