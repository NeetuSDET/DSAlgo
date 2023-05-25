@SignIn
Feature: validating signin page

  Scenario: user logins with correct credentials
    Given User is in homepage
    Then user clicks signin and redirects to signin page
    When The user enters a valid username and password
    And user clicks login button and redirects to home page
