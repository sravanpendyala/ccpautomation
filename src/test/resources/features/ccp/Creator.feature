@TCS
Feature: Validate creator role testcases

    Background: Login to application using creator role
        #Given navigate to nclccp application
        Given navigate to nclccp_shoreside application
        When enter username, password and click on "CreatorLogin" button
        Then homepage should be displayed "DashboardPg"


#    @TC_008
#    Scenario: Update department response
#        When click on "Vesselsoffloads" offload option
#        And click on "Offloadresponse" offload option
#        Then "offloadresponsepg" page should be displayed
#        When search and edit the "updatedeptresponse"
#        And update number of "offloadsvalue" forms field dropdown
#        And click on "update" button in offload
#        Then updated offload event department response page should be displayed "quantity"



    @TC_013
    Scenario: offload form status RecallInitiated
        When click on "Vesselsoffloads" offload option
        And click on "offloadformsLnk" option link
        When search and edit the "searchrecallinit"
        When Click on "Recallbutton" in the offload
        Then fill the "RecallReason" in the window
        And fill the "NotesFields" in the amend
        And click on "DesiredNextStatus"in window
        And click on "Returnoffloadformbacktome"
