package com.ncl.ccp.stepdef.ccpapp;
import com.ncl.ccp.pages.ccp.AdministrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class Administration {

    @Autowired
    AdministrationPage administrationPage;

    @Then("{string} page should be displayed in usermanagement page")
    public void pageShouldBeDisplayedInUsermanagementPage(String data) { administrationPage.performActions(data); }
    @When("click on {string} in users page")
    public void clickOnInUsersPage(String data) { administrationPage.performActions(data); }
    @When("click on {string} field in users page")
    public void clickOnFieldInUsersPage(String data) { administrationPage.performActions(data); }
    @And("enter data into {string} in users page")
    public void enterDataIntoInUsersPage(String data) { administrationPage.performActions(data); }
    @And("click on {string} in new users page")
    public void clickOnInNewUsersPage(String data) { administrationPage.performActions(data); }
    @And("enter data into {string} in new users page")
    public void enterDataIntoInNewUsersPage(String data) { administrationPage.performActions(data); }
    @And("select {string} option in new users page")
    public void selectOptionInNewUsersPage(String data) { administrationPage.performActions(data); }

    @And("click on {string} in new user page")
    public void clickOnInNewUserPage(String data) { administrationPage.performActions(data); }

}


