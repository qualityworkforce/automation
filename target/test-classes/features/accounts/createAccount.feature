Feature: Creating a account

  Description: In this test we will create a new account and test all positive and negative scenarios


  Scenario: Creating account only with mandatory fields
    Given I navigate to Accounts tab
    And click new button
    And I enter account name
    When I click the save button
    Then the new account must be created
    And user should be navigated to newly created account page

  Scenario: Creating account without mandatory fields
    Given I navigate to Accounts tab
    And I click the New button
    And I don't enter account name
    When I click the save button
    Then user should get a error message
    But when user click cancel user should be navigated to account tab

  @smoke
  Scenario:Creating an account with fields users wants
    Given I navigate to Accounts tab
    And click new button
    And I enter the following details on new accounts page
      | Account Name   | QAQA              |
      | Account Number | 9876023           |
      | Rating         | Hot               |
      | Description    | This is test data |
    When I click the save button
    Then the new account must be created
    And user should be navigated to newly created account page

  @smoke
  Scenario:Creating an account with fields users wants
    Given I navigate to Accounts tab
    And click new button
    And I enter the following details on new accounts page
      | Field Name     | Value             |
      | Account Name   | QAQA              |
      | Account Number | 9876023           |
      | Rating         | Hot               |
      | Description    | This is test data |
    When I click the save button
    Then the new account must be created
    And user should be navigated to newly created account page

  Scenario: Creating an account with fields special characters
    Given I navigate to Accounts tab
    And click new button
    And I enter the following details on new accounts page
      | Field Name     |  | Value       |
      | Account Name   |  | !@£$$%^&%$£ |
      | Account Number |  | !@£$%^&*(   |
      | Rating         |  | £$%^%^&     |
    When I click the save button
    Then the new account must be created

