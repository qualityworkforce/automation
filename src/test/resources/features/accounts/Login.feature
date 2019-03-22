Feature: Login

  Scenario: Login with valid details
    Given I navigate to Salesforce login page
    And I enter valid Username and Password
    When I click Login button
    Then user must be logged in
    And user must see Salesforce home screen
