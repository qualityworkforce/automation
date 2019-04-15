Feature: Login/Logout

  Scenario: Login with valid details
    Given I navigate to Salesforce login page
    And I enter valid Username
    And I enter valid Password
    When I click Login button
    Then user must be logged in
    And user must see Salesforce home screen

  Scenario: Logout
    Given I navigate to Salesforce login page
    And I enter valid Username
    And I enter valid Password
    And I click Login button
    And  user is logged in successfully
    When I click logout link
    Then user must be logged out
