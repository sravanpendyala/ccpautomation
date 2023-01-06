@TCS
Feature: verify admin roles functionality
  Background: Login to application using purser role
    Given navigate to nclccp_shoreside application
    #Given navigate to nclccp application
    When enter username, password and click on "AdminLogin" button
    Then homepage should be displayed "DashboardPg"

#  @TC_001
#    Scenario:  Create new Port
#    When click on "settingsbutton" in dashboard page
#    And click on the "portlink" in the settings
#    Then "portpage" page should be displayed in portpage
#    When click on "newportbutton" in portpage
#    When enter data into "portcodetxt" in newport page
#    And enter data into "portnametxt" in newport page
#    And enter data into "portnamewodiacriticstxt" in newport page
#    And click on "countrydrpdwn" in newport page
#    And click on "countrydrpdwntxt" in newport page
#    And enter data into "portcodetxt" in newport page
#    And click on "newportsavebtn" button in newport page
#    Then "portpage" page should be displayed in portpage
 #   When search and edit the "searchportcode" in portpage




#  @TC_002
#  Scenario:  Create new user in the system with Creator role
#    When click on "administrationlnk" in dashboard page
#    And click on "usermanagementlnk" in dashboard page
#    Then "userspage" page should be displayed in usermanagement page
#    When click on "newuserbutton" in users page
#    And click on "companydrpdwn" in new users page
#    And enter data into "companydrpdwntxt" in new users page
#    And click on "sitedrpdwn" in new users page
#    And enter data into "sitedrpdwntxt" in new users page
#    And click on "departmentdrpdwn" in new users page
#    And enter data into "departmentdrpdwntxt" in new users page
#    And select "siterdbtn" option in new users page
#    And enter data into "usernametxt" in new users page
#    And enter data into "displaynametxt" in new users page
#    And enter data into "emailtxt" in new users page
#    And enter data into "passwordtxt" in new users page
#    And enter data into "confirmpasswordtxt" in new users page
#    And enter data into "roletxt" in new users page
#    And enter data into "roletxtvalue" in new users page
#    And click on "savebutton" in new user page
#    Then "userspage" page should be displayed in usermanagement page
#   When search and edit the "searchnewcreator" in portpage



#  @TC_003
#  Scenario:  Create new user in the system for Purser role
#    When click on "administrationlnk" in dashboard page
#    And click on "usermanagementlnk" in dashboard page
#    Then "userspage" page should be displayed in usermanagement page
#    When click on "newuserbutton" in users page
#    And click on "companydrpdwn" in new users page
#    And enter data into "companydrpdwntxt" in new users page
#    And click on "sitedrpdwn" in new users page
#    And enter data into "sitedrpdwntxt" in new users page
#    And select "siterdbtn" option in new users page
#    And enter data into "usernametxt" in new users page
#    And enter data into "displaynametxt" in new users page
#    And enter data into "emailtxt" in new users page
#    And enter data into "passwordtxt" in new users page
#    And enter data into "confirmpasswordtxt" in new users page
#    And enter data into "roletxt" in new users page
#    And enter data into "rolepurser" in new users page
#    And click on "savebutton" in new user page
#    Then "userspage" page should be displayed in usermanagement page
#    When search and edit the "searchnewpurser" in portpage



#  @TC_035
#  Scenario:  Export Offload Form PDF
#    ####################"offload form created before - data should be given to searchbar1
#    When click on "Vesselsoffloads" option
#    When click on "Offloadforms3" option
#    When enter value in "searchbar1" and search
#    When click on the "edit4" for the offload event created previously
#    And click on "exportform1" button
#    And click "offloadformpdf" option for exportform button

#  @TC_036
#  Scenario:  Export customs form PDF
#    ###########"offload form created before - data should be given to searchbar1
#    And click on "Vesselsoffloads" option
#    When click on "Offloadforms3" option
#    When enter value in "searchbar1" and search
#    When click on the "edit4" for the offload event created previously
#    And click on "exportform1" button
#   And click "customsformpdf" option for exportform button
##



#  @TC_037
#  Scenario:  Export offloadformxls
#    ############"offload form created before - data should be given to searchbar1
#    When click on "Vesselsoffloads" option
#    When click on "Offloadforms3" option
#    When enter value in "searchbar1" and search
#    When click on the "edit4" for the offload event created previously
#    And click on "exportform1" button
#    And click "offloadformxls" option for exportform button

#  @TC_038
#  Scenario:  Export customsformxls
#    #################"offload form created before - data should be given to searchbar1
#    When click on "Vesselsoffloads" option
#    When click on "Offloadforms3" option
#    When enter value in "searchbar1" and search
#    When click on the "edit4" for the offload event created previously
#    And click on "exportform1" button
#    And click "customsformxls" option for exportform button

#
# @TC_039
#  Scenario:  Send offload form by email
#  ############"offload form created before - data should be given to searchbar1
#    ############ to address srpedyala@ncl.com
#    ######### message would be something like ex: TEST
#    And click on "Vesselsoffloads" option
#    When click on "Offloadforms3" option
#    When enter value in "searchbar1" and search
#    When click on the "edit4" for the offload event created previously
#    And click on "email" button
#    And click "offloadformpdf5" option for email
#    And Enter "to" option for email button
#    And Enter "Message" option for email button
#   And click on "send" button


#  @TC_040
#  Scenario:  Export offload forms in pdf
#  ##############"Select any Offload Event Created Before with offload forms in proccessed statused"
#  ############"(Purser_GSAM_Released/CustomsApproved/AdminAccepted/BrokerSubmittedToCustoms)" .
#    When click on "Vesselsoffloads" option
#    When click on "offloadevent" option
#    When search and edit the "searchbar3"
#    And click on "attachedoffloadforms" button
#    And click "exportform1" option
#   And click "offloadformpdf" option
###
##
#  @TC_041
#  Scenario:  Export offload forms in pdf
#  ##############"Select any Offload Event Created Before with offload forms in proccessed statused"
#  ############"(Purser_GSAM_Released/CustomsApproved/AdminAccepted/BrokerSubmittedToCustoms)" .
#    When click on "Vesselsoffloads" option
#    When click on "offloadevent" option
#    When search and edit the "searchbar3"
#    And click on "attachedoffloadforms" button
#    And click "exportform1" option
#    And select "offloadformxls" option
##
#
#  @TC_044
#  Scenario:  Export offload forms draft
#  ############"Select any Offload Event Created Before with offload forms in proccessed statused"
#  ############"(Purser_GSAM_Released/CustomsApproved/AdminAccepted/BrokerSubmittedToCustoms)" .
#    When click on "Vesselsoffloads" option
#    And click on "offloadevent" option
#    And search and edit the "searchbar4"
#    #And click on "attachedoffloadforms" button
#    #And click "exportform1" option
#   And select "CE1302draft" option