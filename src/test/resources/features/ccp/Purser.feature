@TCS
Feature: Verify Offload Event

  Background: Login to application using purser role
    Given navigate to nclccp application
    When enter username, password and click on "PurserLogin" button
    Then homepage should be displayed "DashboardPg"

  #@TC_020

     # Prerequisite: step-6 vesselitinerarydrpdwntxtusport or vesselitinerarydrpdwntxtnonusport should be changed to for US Port & non US ports
#  Scenario: Create new Offload Event
#    When click on "vessels" offload option
#    And click on "offloadeventsLnk" option
#    Then "offloadeventspg" page should be displayed
#    When Click on "newoffloadeventsbtn" button
#    And Select "vesselitinerarydrpdwn" from vessel itinenary
#    And Select "vesselitinerarydrpdwntxtusport" from vessel itinenary
#    And Click on "savebutton" button
#    Then "offloadeventspg" page should be displayed

#  @TC_007 #change
#  Scenario: Create new Offload Event
#    When click on "vessels" offload option
#    And click on "offloadeventsLnk" option
#    Then "offloadeventspg" page should be displayed
#    When Click on "newoffloadeventsbtn" button
#    And Select "vesselitinerarydrpdwn" from vessel itinenary
#    And Select "vesselitinerarydrpdwntxtnonusport" from vessel itinenary
#    And Click on "savebutton" button
#    Then "offloadeventspg" page should be displayed

#  @TC_016
#  Scenario: Delete Offload Event
#    When click on "vessels" offload option
#    And click on "offloadeventsLnk" option
#    Then "offloadeventspg" page should be displayed
#    When search and edit the "existingoffloadevent" searchbox
#    And click on "deletebutton" in Offload Event tab
#    And click on "Yesbutton" in confirm window
#    Then "offloadeventspg" page should be displayed
#    When click on "displayinactiverecords" button in offload events page
#    Then "deletedoffloadevent" should be displayed

#  @TC_017
#  Scenario: Undelete Offload Event

#    When click on "vessels" offload option
#    And click on "offloadeventsLnk" option
#    Then "offloadeventspg" page should be displayed
#    When click on "displayinactiverecords" button in offload events page
#    Then "deletedoffloadevent" should be displayed
#    When search and edit the "existingoffloadevent"
#    And click on "undeletebutton" in Offload Event tab
#    And click on "Yesbutton" in confirm window
#    Then "offloadeventspg" page should be displayed

#  @TC_018
  ####Vessel Reference no- submitted status should be given in testdata sheet as it is unique#####
#  Scenario: Offload Form with Status as PurserGSAMReleased

#    When click on "vessels" offload option
#    And click on "offloadformsLnk" link option
#    Then "offloadformspg" should be displayed
#    When search and edit the "existingsubmittedoffloadform"
#    Then "editoffloadform" should be displayed
#    When click on "releasebutton" in offload forms tab
 #   Then "purserupdatedstatus" should be displayed

   # @TC_019
#  Scenario: Offload Form with Status as PurserGSAMOnhold

#    When click on "vessels" offload option
#    And click on "offloadformsLnk" link option
#    Then "offloadformspg" should be displayed
#    When search and edit the "existingsubmittedoffloadform"
#    Then "editoffloadform" should be displayed
#    When click on "onholdbutton" in offload forms tab
 #   Then "purserupdatedstatus" should be displayed

  @TC_020
  Scenario: Offload Form with Status as Purser GSAM Rejected

    When click on "vessels" offload option
    And click on "offloadformsLnk" link option
    Then "offloadformspg" should be displayed
    When search and edit the "existingsubmittedoffloadform"
    Then "editoffloadform" should be displayed
    When click on "rejectbutton" in offload forms tab
    And enter data in to rejectreason, notes and click on "savebtn"
    Then "purserupdatedstatus" should be displayed

#  @TC_004
#  Scenario: Itinerary for Us port
#    When click in to "settingsbutton"
#    Then  click on the "itineraries" in the settings
#    And  click on "vesselitinerary" option link
#    When click on "newvesselitinerary" button
#    Then enter data into "companyname" dropdown
#    #And enter data into "companynametxt" dropdown
#    #And enter data into "vessel" dropdown
#    #And enter data into "vesseltxt" dropdown
#    Then enter data into "itineraryday"
#    When click on "port" select value
#    Then enter "sequence"
#    And enter "description" in the window
#    When click on "offloadingallowed" change  data
#    And click on "savebutton"