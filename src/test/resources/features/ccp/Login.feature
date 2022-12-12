@TCS
Feature: Verify user login with valid credentials
  @TC_001
  Scenario: Update department response
    Given navigate to nclccp application
    When enter username, password and click on "Login" button
    Then homepage should be displayed "UserProfile"
