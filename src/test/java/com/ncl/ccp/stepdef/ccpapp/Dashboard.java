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
}


