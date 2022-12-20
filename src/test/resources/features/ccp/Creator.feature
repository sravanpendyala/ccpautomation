@TCS
Feature: Validate creator role testcases

    Background: Login to application using creator role
        Given navigate to nclccp application
        When enter username, password and click on "CreatorLogin" button
        Then homepage should be displayed "DashboardPg"


    @TC_008
    Scenario: Update department response
        When click on "Vesselsoffloads" offload option
        And click on "offloadformsLnk" link option
        Then "offloadformspg" should be displayed
        When enter "datavalue" and click on search button
        And click on the "edit" option for the offload event created previously
        And update number of "offloads" forms field dropdown
        And click on "update" button in offload
        Then updated offload event department response page should be displayed "quantity"


#    Feature: Verify Offload Form Status RecallInitiated
##custombroker.feature
#    @TC_013
#    Scenario: offload form status RecallInitiated
#        Given navigate to nclccp application
#        When enter username, password and click on "Login" button
#        Then homepage should be displayed "UserProfile"
#        When navigate to "offloadform" option from vessels offload option
#        Then offload event department response page should be displayed "oedrpage"
#        When click on the "Editbutton" for the existing offload event
#        And click on "Recallbutton"
#        And fill the "Recallreason" in the recall window
#    #And fill the "Notesfields" in the recall window
#        Then click on dropdown "DesiredNextStatus" in recall window
#        And click on "Returnoffloadformbacktome" in recall window

#    @TC_013
#    Scenario: offload form status RecallInitiated
#        When navigate to "offloadform" option from vessels offload option
#        Then offload event department response page should be displayed "oedrpage"
#    #When click on the "searchbox" in the offload form page
#   # When  enter existing "Searchdatavalue" in Search box
#        When enter value in "searchbox" and search
#        And Click on "Edit" in the offload event.
#    #And click on "searchbar"
#        When Click on "Recallbutton" in the offload
#        Then fill the "RecallReason" in the window
#    #And fill the "NotesFields" in the amend
#        And click on "DesiredNextStatus"in window
#    #And click on "Returnoffloadformbacktome"