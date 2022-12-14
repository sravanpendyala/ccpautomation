@TCS
Feature: verify custom broker functionality

  Background: Login to application using purser role
    Given navigate to nclccp_shoreside application
    When enter username, password and click on "CustomsLogin" button
    Then homepage should be displayed "DashboardPg"

  @TC_034
  Scenario: offload form status AmendInitiated
    When click on "Vesselsoffloads" offload option
    And click on "offloadformsLnk" link option
    Then "offloadformspg" should be displayed
  # Then "editoffloadform" should be displayed
    When enter value in "AmendInitiatedsearchbar" and search
    And Click on "editicon" in the offload event.
    #And click on "searchbar"
    When Click on "Amendbutton" in the offload
    Then fill the "Amendreason" in the amend window
    #And fill the "NotesFields" in the amend
    And click on "CreateAmend" in amend window
