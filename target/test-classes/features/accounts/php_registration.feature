Feature: Registration

  Scenario:Registration with valid data
    Given I navigate to PHP Travels Sing up page
    And  I enter valid details to below fields
      | First Name | Last Name | Mobile Number | Email              | Password | Confirm Password |
      | Test3       | User3     | 9898989898    | ambi3@gmail.com | Test1234 | Test1234         |
    When I click Sign UP button
    Then new account must be created
    And User must be navigated to newly created account page



