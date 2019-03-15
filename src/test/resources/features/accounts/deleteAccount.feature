Feature: Deleting already created accounts

  Description :In this test we will delete already created accounts

  Scenario: Delete already created accounts
    Given I navigate to Accounts tab
    And Click on account name link
    When I click on delete button
    Then a popup should open
    And when i click ok on the popup account should be delete
    And I should be navigated to accounts page