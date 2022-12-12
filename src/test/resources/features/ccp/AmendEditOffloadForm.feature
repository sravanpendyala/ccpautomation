@TCS
  Feature: Verify Offload Form Status AmendInitiated
    Background: Login to application using purser role
      Given navigate to nclccp application
      When enter Username, password and click on "CustomsLogin" button
      #Then homepage should be displayed "DashboardPg"
  @TC_034
  Scenario: offload form status AmendInitiated
    When navigate to "offloadform" option from vessels offload option
    Then offload event department response page should be displayed "oedrpage"
    #When click on the "searchbox" in the offload form page
   # When  enter existing "Searchdatavalue" in Search box
    When enter value in "searchbar1" and search
    And Click on "Edit" in the offload event.
    #And click on "searchbar"
    When Click on "Amendbutton" in the offload
    Then fill the "Amendreason" in the amend window
    #And fill the "NotesFields" in the amend
    And click on "CreateAmend" in amend window
