@TCS
Feature: verify custom broker functionality

  Background: Login to application using purser role
    Given navigate to nclccp_shoreside application
    When enter username, password and click on "CustomsLogin" button
    Then homepage should be displayed "DashboardPg"


#  @TC_028
#  Scenario: Status BrokerSubmittedToCustoms
#    ################# Offload Form Created Before and in AdminAccepted Status
#    When click on "Vesselsoffloads" option
#    Then Click to "offloadform" option from vessels offload option
#    When search and edit the "searchbar6"
#   When Enter on "entrynumber" in the offload
#  Then click "sendtocustoms" option



#  @TC_029
#  Scenario:Offload Form Status CustomsApproved
#    ######"offload form created before and it should be in broker submitted to customs status"
#    When click on "Vesselsoffloads" option
#    Then Click to "offloadform" option from vessels offload option
#    When search and edit the "searchbar7"
#    When Click on "customsapprove" in the offload
    #When search and edit the "searchbar7"


#  @TC_030
#  Scenario:Offload Form Status CustomsRejected
############"offload form created before and it should be in broker submitted to customs status"
#    When click on "Vesselsoffloads" option
#    Then Click to "offloadform" option from vessels offload option
#    When search and edit the "searchbar8"
#    When Click on "customsreject" in the offload
   Then fill the "rejectreason" in the amend window
    And fill the "NotesFields2" in the amend
    Then click on dropdown "DesiredNextStatus" in recall window
    And click on "Finalrejection"
#    Then search and edit the "searchbar8"


  @TC_033
  Scenario: offload form status RecallInitiated with custom role
    When click on "Vesselsoffloads" offload option
    And click on "offloadformsLnk" option link
    When search and edit the "searchrecallinit"
    When Click on "Recallbutton" in the offload
    Then fill the "RecallReason" in the window
    And fill the "NotesFields" in the window
    And click on "DesiredNextStatus"in window
    And click on "Returnoffloadformbacktome"

#  @TC_034
#  Scenario: offload form status AmendInitiated
#     ############" Amendsearchvalue should be updated
#    When click on "Vesselsoffloads" option
#    When click to "Offloadform2" option from vessels offload option
    When search and edit the "Amendsearchvalue"
#    When Click on "Amendbutton" in the offload
#    Then fill the "Amendreason" in the amend window
#       ### And fill the "NotesFields" in the amend
#    And click on "CreateAmend" in amend window


#  @TC_042
#  Scenario: offload event document
#      #########"offload event created before it would be in any status"
#       ##############"its going to click and select first set of broker document"
#    When click on "Vesselsoffloads" option
#    When click on "offloadevent" option
#    When enter value in "searchbar5" and search
#    When click on the "edit1" for the offload event created previously
#    And click on "attachedfiles" button
    And click "selectfile" option
#      And click "update" option
#
#  @TC_043
#  Scenario: offload event document
#    #########"offload event created before it would be in any status
#     ########### #" its going to click and select second set of broker document"
#    When click on "Vesselsoffloads" option
#    When click on "offloadevent" option
#    When enter value in "searchbar5" and search
#    When click on the "edit1" for the offload event created previously
#    And click on "attachedfiles" button
#    And click "selectfile2" option
#    And click "update" option


