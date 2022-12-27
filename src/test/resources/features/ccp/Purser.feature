@TCS
Feature: verify purser role functionality

  Background: Login to application using purser role
    Given navigate to nclccp application
    When enter username, password and click on "PurserLogin" button
    Then homepage should be displayed "DashboardPg"



#  @TC_004
#  Scenario: Itinerary for US port
#    When click on "settingsbutton" in dashboard page
#    Then click on the "itineraries" in the settings
#    And click on "vesselitinerary" option link
#    When click on "newvesselitinerary" button
#    Then enter data into "companyname" dropdown
#    And enter data into "companynametxt" dropdown
#    And enter data into "vessel" dropdown
#    And enter data into "vesseltxt" dropdown
#    Then enter data into "itineraryday"
#    When click on "port" select value
#    And click on "portusvalue" select value
#    Then enter "sequence"
#    And enter "description" in the window
#    When click on "offloadingallowed" change data
#    And click on "offloadingallowedvalue" change data
#    When Click on "applychanges" button
#    And click on "closewindow" in new vessel itinerary form
#    Then "itinerariespg" itineraries page should be displayed



#  @TC_005
#  Scenario: Itinerary for US port
#    Given navigate to nclccp application
#    When enter username, password and click on "PurserLogin" button
#    Then homepage should be displayed "DashboardPg"
#    When click on "settingsbutton" in dashboard page
#    Then click on the "itineraries" in the settings
#    And click on "vesselitinerary" option link
#    When click on "newvesselitinerary" button
#    Then enter data into "companyname" dropdown
#    And enter data into "companynametxt" dropdown
#    And enter data into "vessel" dropdown
#    And enter data into "vesseltxt" dropdown
#    Then enter data into "itineraryday"
#    When click on "port" select value
#    And click on "portnonusvalue" select value
#    Then enter "sequence"
#    And enter "description" in the window
#    When click on "offloadingallowed" change data
#    And click on "offloadingallowedvalue" change data
#    When Click on "applychanges" button
#    And click on "closewindow" in new vessel itinerary form
#    Then "itinerariespg" itineraries page should be displayed



#@TC_006
#Scenario: Create new Offload Event for non US port
#    When click on "Vesselsoffloads" offload option
#    And click on "offloadeventsLnk" option link
#    Then "offloadeventspg" page should be displayed
#    When Click on "newoffloadeventsbtn" button
#    And Select "vesselitinerarydrpdwn" from vessel itinenary
#    And Select "vesselitinerarydrpdwntxtnonusportsingle" from vessel itinenary
#    And enter data into "portagentemailtxt" new offload events page
#    And enter data into "portagentcompanytxt" new offload events page
#    And Click on "savebutton" button
#    Then "offloadeventspg" page should be displayed
#    When click on "userprofile" in dashboard page
#    And click on "logoutbutton" in dashboard page




#  @TC_007
#  Scenario: Create new Offload Event for US port
#    When click on "Vesselsoffloads" offload option
#    And click on "offloadeventsLnk" option link
 #   Then "offloadeventspg" page should be displayed
#    When Click on "newoffloadeventsbtn" button
#    And Select "vesselitinerarydrpdwn" from vessel itinenary
#    And Select "vesselitinerarydrpdwntxtusportsingle" from vessel itinenary
#    And Click on "savebutton" button
#    Then "offloadeventspg" page should be displayed
#    When click on "userprofile" in dashboard page
#    And click on "logoutbutton" in dashboard page




#  @TC_016
#  Scenario: Delete Offload Event
#    When click on "Vesselsoffloads" offload option
#    And click on "offloadeventsLnk" option link
#    Then "offloadeventspg" page should be displayed
#    When search and edit the "existingoffloadevent" searchbox
#    And click on "deletebutton" in Offload Event tab
#    And click on "Yesbutton" in confirm window
#    Then "offloadeventspg" page should be displayed
#    When click on "displayinactiverecords" button in offload events page



#  @TC_017
#  Scenario: Undelete Offload Event
#
#    When click on "Vesselsoffloads" offload option
#    And click on "offloadeventsLnk" option link
#    Then "offloadeventspg" page should be displayed
#    When click on "displayinactiverecords" button in offload events page
#    When search and edit the "existingoffloadevent"
#    And click on "undeletebutton" in Offload Event tab
#    And click on "Yesbutton" in confirm window
#    Then "offloadeventspg" page should be displayed




#  @TC_018
##  ###Vessel Reference no- submitted status should be given in testdata sheet as it is unique#####
#  Scenario: Offload Form with Status as PurserGSAMReleased
#    When click on "Vesselsoffloads" offload option
#    And click on "offloadformsLnk" link option
#   Then "offloadformspg" should be displayed
#    When search and edit the "existingreleasedoffloadform"
#    Then "editoffloadform" should be displayed
#    When click on "releasebutton" in offload forms tab
#    Then "purserreleasedstatus" should be displayed
#
#    @TC_019
#      #####Vessel Reference no- submitted status should be given in testdata sheet as it is unique#####
#  Scenario: Offload Form with Status as PurserGSAMOnhold
#
#    When click on "Vesselsoffloads" offload option
#    And click on "offloadformsLnk" link option
#    Then "offloadformspg" should be displayed
#    When search and edit the "existingsubmittedoffloadform"
#    Then "editoffloadform" should be displayed
#    When click on "onholdbutton" in offload forms tab
#    And enter data in to rejectreason, notes and click on "savebtn"
#    Then "purseronholdstatus" should be displayed

#  @TC_020
#  ####Vessel Reference no- submitted status should be given in testdata sheet as it is unique#####
#  Scenario: Offload Form with Status as Purser GSAM Rejected
#
#    When click on "Vesselsoffloads" offload option
#    And click on "offloadformsLnk" link option
#    Then "offloadformspg" should be displayed
#    When search and edit the "existingrejectedoffloadform"
#    Then "editoffloadform" should be displayed
#    When click on "rejectbutton" in offload forms tab
#    And enter data in to rejectreason, notes and click on "savebtn"
#    Then "purserrejectedstatus" should be displayed