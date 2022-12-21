@TCS
Feature: verify US port functionality

  @TC_004
  Scenario: Itinerary for US port
    Given navigate to nclccp application
    When enter username, password and click on "PurserLogin" button
    Then homepage should be displayed "DashboardPg"
    When click on "settingsbutton" in dashboard page
    Then click on the "itineraries" in the settings
    And click on "vesselitinerary" option link
    When click on "newvesselitinerary" button
    Then enter data into "companyname" dropdown
    And enter data into "companynametxt" dropdown
    And enter data into "vessel" dropdown
    And enter data into "vesseltxt" dropdown
    Then enter data into "itineraryday"
    When click on "port" select value
    And click on "portusvalue" select value
    Then enter "sequence"
    And enter "description" in the window
    When click on "offloadingallowed" change data
    And click on "offloadingallowedvalue" change data
    When Click on "applychanges" button
    And click on "closewindow" in new vessel itinerary form
    Then "itinerariespg" itineraries page should be displayed
 # @TC_007
 # Scenario: Create new Offload Event for US port

    When click on "Vesselsoffloads" offload option
    And click on "offloadeventsLnk" option link
    Then "offloadeventspg" page should be displayed
    When Click on "newoffloadeventsbtn" button
    And Select "vesselitinerarydrpdwn" from vessel itinenary
    And Select "vesselitinerarydrpdwntxtusport" from vessel itinenary
    And Click on "savebutton" button
    Then "offloadeventspg" page should be displayed
    When click on "userprofile" in dashboard page
    And click on "logoutbutton" in dashboard page

#@TCS
#  @TC_009
#  Scenario: Create new offload form for US port
    Given navigate to nclccp application
    When enter username, password and click on "CreatorLogin" button
    Then homepage should be displayed "DashboardPg"
    When click on "Vesselsoffloads" offload option
    And click on "offloadformsLnk" option link
    #And click on "Offloadforms" option in dashboard page
    And click on "CreateNewOffloadform" button in offloadforms page
    Then in new offload form page Select "Offloadeventdropdown"
    Then enter "Offloadeventdropdownvaluee2e" and click on enter button
    When click on "offloadpurposedropdown" dropdown
    And select "offloadpurposevalue" from the offload purpose dropdown
    And click on "saveOffloadForm" button in new offloadform page
    And click on "destinationAddress" button in new offloadform page
    And enter values in "destinationAddressFields" CompanyName,Address,Zipcode,city,country,state and clickon save button
    Then destination address should get displayed "validateAddress"
    When click on "itemsTab" tab and then click on AddItem button
    And enter Item details in "NewItem_Item" description,Use ofItem and composite of material
    And enter Item measurement details in "NewItem_Measurements" package type,quantity,weight pereach and weight per each UOM
    And enter Item manufacturer details in "NewItem_Manufacturer" countryoforigin
    And enter Item valuation details in "NewItem_Valuation" valuation type,AcquisitionPurchaseOrderNumber,AcquisitionDate,AcquisitionUnitCost and click on save
    When click on "notes" tab and click on Add Note button
    Then enter "noteText" in text box and click on OK button
    And added notes should get displayed "newNote"
    When click on "attachedFiles" tab and then click on Select File
    And click on "saveOffloadForm" button in new offloadform page
    And click on "submit" button in edit offloadform page
    When search and edit the "vesselitinerarydrpdwntxtusport" value
    #When enter in "vesselitinerarydrpdwntxtusport" and check the status
    Then Verify status "verifyStatusOffloadForm"
    When click on "userprofile" in dashboard page
    And click on "logoutbutton" in dashboard page
############################### END #################################