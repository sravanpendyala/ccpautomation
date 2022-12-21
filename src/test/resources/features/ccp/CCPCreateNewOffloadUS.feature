#@TCS
#Feature: Create new offload form for US port
#    @TC_009
#    Scenario: Create new offload form for US port
#      ### Offloadeventdropdownvalue, destinationAddressFields fields need to be changed
#        Given navigate to nclccp application
#        When enter username, password and click on "CreatorLogin" button
#        Then homepage should be displayed "DashboardPg"
#        When click on "vessels" offload options
#        And click on "Offloadforms" offload options
#        And click on "CreateNewOffloadform" buttons
#        Then in new offloadform page Select "Offloadeventdropdown"
#        Then enter "Offloadeventdropdownvalue" and click on enter
#        When click on "Offloadpuropsedropdown" dropdownarrow
#        And select "Offloadpuropse" option from the offload purpose dropdown
#        And click on "saveOffloadForm" button in new offload form page
#        And click on "destinationAddress" buttons
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
#        When click on "attachedFiles" tab and then click on SelectFile
#        And click on "saveOffloadForm" button in edit offload form page
#        And click on "submit" button in edit offload form page
#        When enter offloadform in "searchbar1" and check the status
#        Then Verify status "verifyStatusOffloadForm"
#        When click on "userprofile" in dashboard page
#        And click on "logoutbutton" in dashboard page

#    @TC_010
#    Scenario: Create new offload form for Non US port
#      ##Offloadeventdropdownvalue_NonUS, destinationAddressFields_NonUS fields need to be changed
#        Given navigate to nclccp application
#        When enter username, password and click on "Login" button
#        Then homepage should be displayed "DashboardPg"
#        When click on "vessels" offload options
#        And click on "Offloadforms" offload options
#        And click on "CreateNewOffloadform" buttons
#        Then in new offloadform page Select "Offloadeventdropdown"
#        Then enter "Offloadeventdropdownvalue_NonUS" and click on enter
#        When click on "Offloadpuropsedropdown" dropdownarrow
#        And select "Offloadpuropse" option from the offload purpose dropdown
#        And click on "saveOffloadForm" button in new offload form page
#        And click on "destinationAddress" buttons
#        And enter values in "destinationAddressFields_NonUS" CompanyName,Address,Zipcode,city,country,state and click on save button
#        Then destination address should be displayed "validateAddress"
#        When click on "itemsTab" tab and then click on AddItem
#        And enter Item details in "NewItem_Item" description,Use of Item and composite of material
#        And enter Item measurement details in "NewItem_Measurements" package type,quantity,weight per each and weight per each UOM
#        And enter Item manufacturer details in "NewItem_Manufacturer_NonUS" country of origin
#        And enter Item valuation details in "NewItem_Valuation_NonUS" valuation type,AcquisitionUnitCost and click on save
#        When click on "notes" tab and click on Add Note
#        Then enter "noteText" in text box and click on OK
#        And added notes should get displayed "newNote"
#        When click on "attachedFiles" tab and then click on SelectFile
#        And click on "saveOffloadForm" button in edit offload form page
#        And click on "submit" button in edit offload form page
#         When enter offloadform in "searchbar1" and check the status
#        Then Verify status "verifyStatusOffloadForm"

#    @TC_011
#    Scenario: Create new offload form for US port and save as Draft
#         ###Offloadeventdropdownvalue, destinationAddressFields fields need to be changed
#        Given navigate to nclccp application
#        When enter username, password and click on "Login" button
#        Then homepage should be displayed "DashboardPg"
#        When click on "vessels" offload options
#        And click on "Offloadforms" offload options
#        And click on "CreateNewOffloadform" buttons
#        Then in new offloadform page Select "Offloadeventdropdown"
#        Then enter "Offloadeventdropdownvalue" and click on enter
#        When click on "Offloadpuropsedropdown" dropdownarrow
#        And select "Offloadpuropse" option from the offload purpose dropdown
#        And click on "saveOffloadForm" button in new offload form page
#        And click on "destinationAddress" buttons
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
#        When click on "attachedFiles" tab and then click on SelectFile
#        And click on "saveOffloadForm" button in edit offload form page
#        And click on "CloseWindow" button to close
#        When enter offloadform in "searchbar1" and check the status
#        Then Verify status "verifyStatusOffloadFormDraft"

#
#
#    @TC_012
#    Scenario: Create new offload form for Non US port and save as Draft
#          # Offloadeventdropdownvalue_NonUS, destinationAddressFields_NonUS fields need to be changed
#        Given navigate to nclccp application
#        When enter username, password and click on "Login" button
#        Then homepage should be displayed "DashboardPg"
#        When click on "vessels" offload options
#        And click on "Offloadforms" offload options
#        And click on "CreateNewOffloadform" buttons
#        Then in new offloadform page Select "Offloadeventdropdown"
#        Then enter "Offloadeventdropdownvalue_NonUS" and click on enter
#        When click on "Offloadpuropsedropdown" dropdownarrow
#        And select "Offloadpuropse" option from the offload purpose dropdown
#        And click on "saveOffloadForm" button in new offload form page
#        And click on "destinationAddress" buttons
#        And enter values in "destinationAddressFields_NonUS" CompanyName,Address,Zipcode,city,country,state and click on save button
#        Then destination address should be displayed "validateAddress"
#        When click on "itemsTab" tab and then click on AddItem
#        And enter Item details in "NewItem_Item" description,Use of Item and composite of material
#        And enter Item measurement details in "NewItem_Measurements" package type,quantity,weight per each and weight per each UOM
#        And enter Item manufacturer details in "NewItem_Manufacturer_NonUS" country of origin
#        And enter Item valuation details in "NewItem_Valuation_NonUS" valuation type,AcquisitionUnitCost and click on save
#        When click on "notes" tab and click on Add Note
#        Then enter "noteText" in text box and click on OK
#        And added notes should get displayed "newNote"
#        When click on "attachedFiles" tab and then click on SelectFile
#        And click on "saveOffloadForm" button in edit offload form page
#        And click on "CloseWindow" button to close
#        When enter offloadform in "searchbar1" and check the status
#        Then Verify status "verifyStatusOffloadFormDraft"
#  @TC_014
#    Scenario: Create new offload form for US port and status should warehouse StorageRequest
#         # Offloadeventdropdownvalue, destinationAddressFields fields need to be changed
#        Given navigate to nclccp application
#        When enter username, password and click on "Login" button
#        Then homepage should be displayed "DashboardPg"
#        When click on "vessels" offload options
#        And click on "Offloadforms" offload options
#        And click on "CreateNewOffloadform" buttons
#        Then in new offloadform page Select "Offloadeventdropdown"
#        Then enter "Offloadeventdropdownvalue" and click on enter
#        When click on "Offloadpuropsedropdown" dropdownarrow
#        And select "OffloadpuropseWhseApproveReq" option from the offload purpose dropdown
#        And click on "saveOffloadForm" button in new offload form page
#        And click on "destinationAddress" buttons
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
#        When click on "attachedFiles" tab and then click on SelectFile
#        And click on "saveOffloadForm" button in edit offload form page
#        And click on "submit" button in edit offload form page
#        When enter offloadform in warehouse approval requested status in "searchWithOffload"
#        Then Verify status is as WareHouse Approve Requested "verifyStatusOffloadFormWhseApproveReq"

#    @TC_015
#    Scenario: Create new offload form for Non US port and Delete
#         # Offloadeventdropdownvalue_NonUS, destinationAddressFields_NonUS fields need to be changed
#        Given navigate to nclccp application
#        When enter username, password and click on "Login" button
#        Then homepage should be displayed "DashboardPg"
#        When click on "vessels" offload options
#        And click on "Offloadforms" offload options
#        And click on "CreateNewOffloadform" buttons
#        Then in new offloadform page Select "Offloadeventdropdown"
#        Then enter "Offloadeventdropdownvalue_NonUS" and click on enter
#        When click on "Offloadpuropsedropdown" dropdownarrow
#        And select "Offloadpuropse" option from the offload purpose dropdown
#        And click on "saveOffloadForm" button in new offload form page
#        And click on "destinationAddress" buttons
#        And enter values in "destinationAddressFields_NonUS" CompanyName,Address,Zipcode,city,country,state and click on save button
#        Then destination address should be displayed "validateAddress"
#        When click on "itemsTab" tab and then click on AddItem
#        And enter Item details in "NewItem_Item" description,Use of Item and composite of material
#        And enter Item measurement details in "NewItem_Measurements" package type,quantity,weight per each and weight per each UOM
#        And enter Item manufacturer details in "NewItem_Manufacturer_NonUS" country of origin
#        And enter Item valuation details in "NewItem_Valuation_NonUS" valuationtype,AcquisitionUnitCost and click on save
#        When click on "notes" tab and click on Add Note
#        Then enter "noteText" in text box and click on OK
#        And added notes should get displayed "newNote"
#        When click on "attachedFiles" tab and then click on SelectFile
#        And click on "saveOffloadForm" button in edit offload form page
#        And click on "CloseWindow" button to close
#        When enter offloadform in "searchbar1" and check the status
#        Then Verify status "verifyStatusOffloadFormDraft"
#        And select the offload form and click on "editOffloadForm"
#        And delete offload form "DeleteOffloadForm"
#        When click on "userprofile" in dashboard page
#        And click on "logoutbutton" in dashboard page
#
#        @TC_018
#        Scenario: Access offload form with Submitted Status and Release and check the status is Purser_GSAM_Released
#          #searchbarSubmittedform(Submitted Vessel Number) data need to be changed everytime and the offload form should have only one Item
#        Given navigate to nclccp_shoreside application
#        When enter username, password and click on "purserLogin" button
#        Then homepage should be displayed "DashboardPg"
#        When click on "vessels" offload options
#        And click on "Offloadforms" offload options
#        When enter offloadform in warehouse approval requested status in "searchbarSubmittedform"
#        And select the offload form and click on "editOffloadForm"
#        And click on "release" button so the status will change to Purser_GSAM_Released
#        Then Verify status after warehouse approve "verifyStatus_Purser_GSAM_Released"
#        When click on "userprofile" in dashboard page
#        And click on "logoutbutton" in dashboard page
#
#    @TC_021
#    Scenario: Access offload form with WarehouseApprovalRequested Status and reject the form
#         #searchbar_whseReject(WarehouseApproveReq status Vessel number) data need to be changed everytime and the offload form should have only one Item
#        Given navigate to nclccp_shoreside application
#        When enter username, password and click on "whseapprover" button
#        Then homepage should be displayed "DashboardPg"
#        When click on "vessels" offload options
#        And click on "Offloadforms" offload options
#        When enter offloadform in warehouse approval requested status in "searchbar_whseReject"
#        And select the offload form and click on "editOffloadForm"
#        And click on "whseReject" button and enter reject reason and note and click on save
#        Then Verify status after warehouse approve "verifyStatusOffloadFormReject"

#    @TC_022
#    Scenario: Access offload form with WarehouseApprovalRequested Status and Approve the form
#        #searchbar_whseApprove(WarehouseApproveReq status Vessel number) data need to be changed everytime and the offload form should have only one Item
#        Given navigate to nclccp_shoreside application
#        When enter username, password and click on "whseapprover" button
#        Then homepage should be displayed "DashboardPg"
#        When click on "vessels" offload options
#        And click on "Offloadforms" offload options
#        When enter offloadform in warehouse approval requested status in "searchbar_whseApprove"
#        And select the offload form and click on "editOffloadForm"
#        And click on "whseApprove" button to do warehouse approve
#        Then Verify status after warehouse approve "verifyStatusOffloadForm"
#
#  @TC_023
#    Scenario: Access offload form with Purser_GSAM_Released Status and change to Pre_EntryReviewCompleted
#        #searchbarPurserGSAMReleased (PurserGSAMReleased status Vessel number) data need to be changed everytime and the offload form should have only one Item
#        #TC_018 can be taked as Pre requisite script
#        Given navigate to nclccp_shoreside application
#        When enter username, password and click on "CustomsLogin" button
#        Then homepage should be displayed "DashboardPg"
#        When click on "vessels" offload options
#        And click on "Offloadforms" offload options
#        When enter offloadform in PurserGSAMReleased status in "searchbarPurserGSAMReleased"
#        And select the offload form and click on "editOffloadForm"
#        When click on "itemsTabedit" tab and then click on editItem
#        And enter broker details "tariffnumber" and click on update
#        And click on "brokerreview" button so the staus changed to Pre_EntryReviewCompleted
#        Then Verify status "verifyStatus_Pre_EntryReviewCompleted"
#        When click on "userprofile" in dashboard page
#        And click on "logoutbutton" in dashboard page
#
#    @TC_024
#    Scenario: Access offload form with Purser_GSAM_Released Status and change to Pre_EntryReviewCompleted
#        #searchbarPurserGSAMReleased (PurserGSAMReleased status Vessel number) data need to be changed everytime and the offload form should have only one Item
#        #TC_018 can be taken as Pre requisite script
#        Given navigate to nclccp_shoreside application
#        When enter username, password and click on "CustomsLogin" button
#        Then homepage should be displayed "DashboardPg"
#        When click on "vessels" offload options
#        And click on "Offloadforms" offload options
#        When enter offloadform in PurserGSAMReleased status in "searchbarPurserGSAMReleased"
#        And select the offload form and click on "editOffloadForm"
#        When click on "exception" tab
#        And enter reject reason and note and click on save for "exceptionreason"
#        Then Verify status "verifyStatus_BrokerException"
#
