package com.ncl.ccp.stepdef.ccpapp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import com.ncl.ccp.pages.ccp.HomePage;

import java.io.IOException;

public class Home {

    @Autowired
    HomePage homePage;

    @Given("navigate to nclccp application")
    public void navigateToNclccpApplication() { homePage.launchApplication(); }
    @Then("homepage should be displayed {string}")
    public void homepageShouldBeDisplayed(String data) { homePage.performActions(data); }
    @When("enter username, password and click on {string} button")
    public void enterUsernamePasswordAndClickOnButton(String data) { homePage.performActions(data); }
    @Given("navigate to nclccp_shoreside application")
    public void navigateToNclccp_shoresideApplication() { homePage.launchShoreSideApplication(); }
}
