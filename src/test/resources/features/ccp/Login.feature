@TCS
Feature: Verify user login with valid credentials

  @TC_050
  Scenario: Login to ship application
    Given navigate to nclccp application
    When enter username, password and click on "Login" button
    Then homepage should be displayed "DashboardPg"
    When click on "userprofile" in dashboard page
    And click on "logoutbutton" in dashboard page

  @TC_051
  Scenario: Login to shore application
    Given navigate to nclccp_shoreside application
    When enter username, password and click on "CustomsLogin" button
    Then homepage should be displayed "DashboardPg"
    When click on "userprofile" in dashboard page
    And click on "logoutbutton" in dashboard page