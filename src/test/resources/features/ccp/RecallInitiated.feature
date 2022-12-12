@TCS
  Feature: Verify Offload Form Status RecallInitiated
    Background: Login to application using purser role
      Given navigate to nclccp application
      When enter Username, password and click on "Login" button
      Then homepage should be displayed "DashboardPg"
  @TC_013
  Scenario: offload form status RecallInitiated
    When navigate to "offloadform" option from vessels offload option
    Then offload event department response page should be displayed "oedrpage"
    #When click on the "searchbox" in the offload form page
   # When  enter existing "Searchdatavalue" in Search box
    When enter value in "searchbox" and search
    And Click on "Edit" in the offload event.
    #And click on "searchbar"
    When Click on "Recallbutton" in the offload
    Then fill the "RecallReason" in the window
    #And fill the "NotesFields" in the amend
    And click on "DesiredNextStatus"in window
    #And click on "Returnoffloadformbacktome"

