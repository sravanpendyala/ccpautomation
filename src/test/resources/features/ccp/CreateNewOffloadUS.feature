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
  #@TC_007
  #Scenario: Create new Offload Event for US port

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
    And click on "Offloadforms" option in dashboard page
    And click on "CreateNewOffloadform" button in offloadforms page
    Then in new offload form page Select "Offloadeventdropdown"
    Then enter "Offloadeventdropdownvaluee2e" and click on enter
    When click on "offloadpurposedropdown" dropdownarrow
    And select "offloadpurposevalue" from the offload purpose dropdown
    And click on "saveOffloadForm" button in new offload from page
    And click on "destinationAddress" button in new offload from page
    And enter values in "destinationAddressFields" CompanyName,Address,Zipcode,city,country,state and click on save button
    Then destination address should be displayed "validateAddress"
    When click on "itemsTab" tab and then click on AddItem
    And enter Item details in "NewItem_Item" description,Use of Item and composite of material
    And enter Item measurement details in "NewItem_Measurements" package type,quantity,weight per each and weight per each UOM
    And enter Item manufacturer details in "NewItem_Manufacturer" country of origin
    And enter Item valuation details in "NewItem_Valuation" valuation type,AcquisitionPurchaseOrderNumber,AcquisitionDate,AcquisitionUnitCost and click on save
    When click on "notes" tab and click on Add Note
    Then enter "noteText" in text box and click on OK
    And added notes should get displayed "newNote"
    When click on "attachedFiles" tab and then click on Select File
    And click on "saveOffloadForm" button in new offload from page
    And click on "submit" in edit off load form page


#@TCS
#Feature: verify non US port functionality
#
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
#  #@TC_006
#  #Scenario: Create new Offload Event for US port
#
#    When click on "Vesselsoffloads" offload option
#    And click on "offloadeventsLnk" option link
#    Then "offloadeventspg" page should be displayed
#    When Click on "newoffloadeventsbtn" button
#    And Select "vesselitinerarydrpdwn" from vessel itinenary
#    And Select "vesselitinerarydrpdwntxtusport" from vessel itinenary
#    And enter data into "portagentemailtxt" new offload events page
#    And enter data into "portagentcompanytxt" new offload events page
#    And Click on "savebutton" button
#    Then "offloadeventspg" page should be displayed
#    When click on "userprofile" in dashboard page
#    And click on "logoutbutton" in dashboard page
#
##  @TC_010
##  Scenario: Create new offload form for non US port
#    Given navigate to nclccp application
#    When enter username, password and click on "CreatorLogin" button
#    Then homepage should be displayed "DashboardPg"
#    When click on "Vesselsoffloads" offload option
#    And click on "Offloadforms" option in dashboard page
#    And click on "CreateNewOffloadform" button in offloadforms page
#    Then in new offload form page Select "Offloadeventdropdown"
#    Then enter "Offloadeventdropdownvaluee2e" and click on enter
#    When click on "offloadpurposedropdown" dropdownarrow
#    And select "offloadpurposevalue" from the offload purpose dropdown
#    And click on "saveOffloadForm" button in new offload from page
#    And click on "destinationAddress" button in new offload from page
#    And enter values in "destinationAddressFields" CompanyName,Address,Zipcode,city,country,state and click on save button
#    Then destination address should be displayed "validateAddress"
#    When click on "itemsTab" tab and then click on AddItem
#    And enter Item details in "NewItem_Item" description,Use of Item and composite of material
#    And enter Item measurement details in "NewItem_Measurements" package type,quantity,weight per each and weight per each UOM
#    And enter Item manufacturer details in "NewItem_Manufacturer" country of origin
#    And enter Item valuation details in "NewItem_Valuation" valuation type,AcquisitionPurchaseOrderNumber,AcquisitionDate,AcquisitionUnitCost and click on save
#    When click on "notes" tab and click on Add Note
#    Then enter "noteText" in text box and click on OK
#    And added notes should get displayed "newNote"
#    When click on "attachedFiles" tab and then click on Select File
#    And click on "saveOffloadForm" button in new offload from page
#    And click on "submit" in edit off load form page
#
#

  #***************end***************



#
#    @TC_011
#    Scenario: Create new offload form for US port and save as Draft
#        Given navigate to nclccp application
#        When enter Username, password and click on "Login" button
#        Then homepage should be displayed "UserProfile"
#        When click on "vessels" offload option
#        And click on "Offloadforms" option
#        And click on "CreateNewOffloadform" button
#        Then in new offload form page Select "Offloadeventdropdown"
#        Then enter "Offloadeventdropdownvalue" and click on enter
#        When click on "Offloadpuropsedropdown" dropdownarrow
#        And select "Offloadpuropse" from the offload purpose dropdown
#        And click on "saveOffloadForm" button in new offload from page
#        And click on "destinationAddress" button
#        And enter values in "destinationAddressFields" CompanyName,Address,Zipcode,city,country,state and click on save button
#        Then destination address should be displayed "validateAddress"
#        When click on "itemsTab" tab and then click on AddItem
#        And enter Item details in "NewItem_Item" description,Use of Item and composite of material
#        And enter Item measurement details in "NewItem_Measurements" package type,quantity,weight per each and weight per each UOM
#        And enter Item manufacturer details in "NewItem_Manufacturer" country of origin
#        And enter Item valuation details in "NewItem_Valuation" valuation type,AcquisitionPurchaseOrderNumber,AcquisitionDate,AcquisitionUnitCost and click on save
#        When click on "notes" tab and click on Add Note
#        Then enter "noteText" in text box and click on OK
#        And added notes should get displayed "newNote"
#        When click on "attachedFiles" tab and then click on Select File
#        And click on "saveOffloadForm" button in edit offload form page

#
#    @TC_012
#    Scenario: Create new offload form for Non US port and save as Draft
#        Given navigate to nclccp application
#        When enter Username, password and click on "Login" button
#        Then homepage should be displayed "UserProfile"
#        When click on "vessels" offload option
#        And click on "OffloadformsLnk" option
#        And click on "CreateNewOffloadform" button
#        Then in new offload form page Select "Offloadeventdropdown"
#        Then enter "Offloadeventdropdownvalue" and click on enter
#        When click on "Offloadpuropsedropdown" dropdownarrow
#        And select "Offloadpuropse" from the offload purpose dropdown
#        And click on "saveOffloadForm" button in new offload from page
#        And click on "destinationAddress" button
#        And enter values in "destinationAddressFields" CompanyName,Address,Zipcode,city,country,state and click on save button
#        Then destination address should be displayed "validateAddress"
#        When click on "itemsTab" tab and then click on AddItem
#        And enter Item details in "NewItem_Item" description,Use of Item and composite of material
#        And enter Item measurement details in "NewItem_Measurements" package type,quantity,weight per each and weight per each UOM
#        And enter Item manufacturer details in "NewItem_Manufacturer" country of origin
#        And enter Item valuation details in "Valuation" valuation type,AcquisitionUnitCost and click on save
#        When click on "notes" tab and click on Add Note
#        Then enter "noteText" in text box and click on OK
#        And added notes should get displayed "newNote"
#        When click on "attachedFiles" tab and then click on Select File
#        And click on "saveOffloadForm" button in edit offload form page

