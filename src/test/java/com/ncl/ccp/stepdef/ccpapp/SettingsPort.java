package com.ncl.ccp.stepdef.ccpapp;
import com.ncl.ccp.pages.ccp.SettingsPortPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class SettingsPort {

    @Autowired
    SettingsPortPage settingsPortPage;

    @Then("{string} page should be displayed in portpage")
    public void pageShouldBeDisplayedInPortpage(String data) { settingsPortPage.performActions(data); }
    @And("click on {string} button in newport page")
    public void clickOnButtonInNewportPage(String data) { settingsPortPage.performActions(data); }
    @When("enter data into {string} in newport page")
    public void enterDataIntoInNewportPage(String data) { settingsPortPage.performActions(data); }
    @When("click on {string} in portpage")
    public void clickOnInPortpage(String data) { settingsPortPage.performActions(data); }
    @And("click on {string} in newport page")
    public void clickOnInNewportPage(String data) { settingsPortPage.performActions(data); }
    @When("search and edit the {string} in portpage")
    public void searchAndEditTheInPortpage(String data) { settingsPortPage.performActions(data); }
}


