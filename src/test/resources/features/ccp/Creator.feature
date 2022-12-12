@TCS
Feature: Validate creator role testcases

    Background: Login to application using creator role
        Given navigate to nclccp application
        When enter username, password and click on "CreatorLogin" button
        Then homepage should be displayed "UserProfile"


    @TC_008
    Scenario: Update department response
        When click on "vessels" offload option
        And click on "offload" response option
        Then offload event department response page should be displayed "oedrpage"
        When enter "datavalue" and click on search button
        And click on the "edit" option for the offload event created previously
        And update number of "offloads" forms field dropdown
        And click on "update" button in offload
        Then updated offload event department response page should be displayed "quantity"

#Feature: Create new offload form for US port
#    @TC_009
#    Scenario: Create new offload form for US port
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
#        And click on "submit" in edit off load form page

#    @TC_010
#    Scenario: Create new offload form for Non US port
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
#        And enter Item valuation details in "Valuation" valuation type,AcquisitionUnitCost and click on save
#        When click on "notes" tab and click on Add Note
#        Then enter "noteText" in text box and click on OK
#        And added notes should get displayed "newNote"
#        When click on "attachedFiles" tab and then click on Select File
#        And click on "saveOffloadForm" button in edit offload form page
#        And click on "submit" in edit off load form page
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
#        And enter Item valuation details in "Valuation" valuation type,AcquisitionUnitCost and click on save
#        When click on "notes" tab and click on Add Note
#        Then enter "noteText" in text box and click on OK
#        And added notes should get displayed "newNote"
#        When click on "attachedFiles" tab and then click on Select File
#        And click on "saveOffloadForm" button in edit offload form page

#    Feature: Verify Offload Form Status RecallInitiated
##custombroker.feature
#    @TC_013
#    Scenario: offload form status RecallInitiated
#        Given navigate to nclccp application
#        When enter Username, password and click on "Login" button
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