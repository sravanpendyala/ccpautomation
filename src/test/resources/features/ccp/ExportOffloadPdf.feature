@TCS
  Feature: Verify Export Offload Form PDF
    Background: Login to application using purser role
      Given navigate to nclccp application
      When enter Username, password and click on "AdminLogin" button
      Then homepage should be displayed "DashboardPg"
  @TC_035
  Scenario:  Export Offload Form PDF
    #Given navigate to nclccp application
    #When enter Username, password and click on "adminlogin" button
    #Then homepage should be displayed "dashboardpg1"
    And click on "vesseloffload" option
    When click on "offloadform" option
    #Then offload event page should be displayed "oedrpage"
    When enter value in "searchbar1" and search
    When click on the "edit1" for the offload event created previously
    And click on "exportform1" button
    And click "offloadformpdf" option for exportform button
    #And "save" pdf file
