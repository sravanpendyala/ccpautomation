@TCS
Feature: Verify Export customs Form PDF
  Background: Login to application using purser role
    Given navigate to nclccp application
    When enter username, password and click on "AdminLogin" button
    Then homepage should be displayed "DashboardPg"

  @TC_036
  Scenario:  Export customs Form PDF
    When click on "vesseloffload" option
    Then click on "offloadform" option
    #Then offload event page should be displayed "oedrpage"
    And enter value in "searchbar1" and search
    And click on the "edit1" for the offload event created previously
    And click on "exportform1" drpdwn in offload form
    And click "customsformpdf" option for exportform button
    #And "save" pdf file

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
