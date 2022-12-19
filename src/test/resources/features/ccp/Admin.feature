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
#    And enter data into "portcodetxt" in newport page
#    And click on "newportsavebtn" button in newport page
#    Then "portpage" page should be displayed in portpage

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

#  @TC_003
#  Scenario:  Create new user in the system with Purser role
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
#    And enter data into "rolepurser" in new users page
#    And click on "savebutton" in new user page
#    Then "userspage" page should be displayed in usermanagement page
#
#  @TC_036
#  Scenario:  Export customs Form PDF
#    When click on "vesseloffload" option
#    Then click on "offloadform" option
#    #Then offload event page should be displayed "oedrpage"
#    And enter value in "searchbar1" and search
#    And click on the "edit1" for the offload event created previously
#    And click on "exportform1" drpdwn in offload form
#    And click "customsformpdf" option for exportform button
#    #And "save" pdf file

#  @TC_037
#  Scenario:  Export customs Form PDF
#    When click on "vesseloffload" option
#    Then click on "offloadform" option
#    #Then offload event page should be displayed "oedrpage"
#    And enter value in "searchbar1" and search
#    And click on the "edit1" for the offload event created previously
#    And click on "exportform1" button
#    And click "offloadformxls" option for exportform button
#    #And "save" pdf file


  #  @TC_038
#  Scenario:  Export customs Form PDF
#    When click on "vesseloffload" option
#    Then click on "offloadform" option
#    #Then offload event page should be displayed "oedrpage"
#    And enter value in "searchbar1" and search
#    And click on the "edit1" for the offload event created previously
#    And click on "exportform1" button
#    And click "customsformxls" option for exportform button
#    #And "save" pdf file

#  @TC_039
#  Scenario:  Export Offload Form PDF
#    #Given navigate to nclccp application
#    #When enter Username, password and click on "adminlogin" button
#    #Then homepage should be displayed "dashboardpg1"
#    And click on "vesseloffload" option
#    When click on "offloadform" option
#    #Then offload event page should be displayed "oedrpage"
#    When enter value in "searchbar1" and search
#    When click on the "edit1" for the offload event created previously
#    And click on "email" button
#    And click "offloadformpdf" option for email
#    And Enter "to" option for email button
#    And Enter "Message" option for email button
#    And "send" pdf file

