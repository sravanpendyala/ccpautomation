package com.ncl.ccp.stepdef.ccpapp;

import com.codoid.products.exception.FilloException;
import com.ncl.ccp.pages.ccp.DashboardPage;
import com.ncl.ccp.pages.ccp.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class Dashboard {

    @Autowired
    DashboardPage dashboardpage;

    @And("click on {string} link option")
    public void clickOnLinkOption(String data) { dashboardpage.performActions(data); }

    @When("click on {string} in dashboard page")
    public void clickOnInDashboardPage(String data) { dashboardpage.performActions(data); }
    @Then("click on the {string} in the settings")
    public void clickOnTheInTheSettings(String data) { dashboardpage.performActions(data);
    }
    @And("click on {string} option link")
    public void clickOnOptionLink(String data) { dashboardpage.performActions(data); }
    @When("click on {string} button")
    public void clickOnButton(String data) { dashboardpage.performActions(data); }
    @Then("enter data into {string} dropdown")
    public void enterDataIntoDropdown(String data) { dashboardpage.performActions(data); }
    @When("click in to {string} button")
    public void clickInToButton(String data) { dashboardpage.performActions(data); }
}


