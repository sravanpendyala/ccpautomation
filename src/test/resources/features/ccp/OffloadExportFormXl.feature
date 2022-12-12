@TCS
Feature: Verify Export customs Form PDF
  Background: Login to application using purser role
    Given navigate to nclccp application
    When enter Username, password and click on "AdminLogin" button
    Then homepage should be displayed "DashboardPg"
  @TC_037
  Scenario:  Export customs Form PDF
    When click on "vesseloffload" option
    Then click on "offloadform" option
    #Then offload event page should be displayed "oedrpage"
    And enter value in "searchbar1" and search
    And click on the "edit1" for the offload event created previously
    And click on "exportform1" button
    And click "offloadformxls" option for exportform button
    #And "save" pdf file
