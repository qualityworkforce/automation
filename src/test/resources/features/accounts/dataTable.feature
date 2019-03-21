Feature: Data Tables

  Scenario:Creating Contact only with mandatory fields
    Given I am on Contact tab
    And I click New button
    And I enter mandatory data
      | Last Name | Contact Currency | Is Resource Active | Is Resource |
      | Chaliki   | USD              | True               | True        |
    When I click Save
    Then new Contact should be created
    And User must be navigated to newly created contact page

  Scenario:Creating Contact with fields user wants
    Given I am on Contact tab
    And I click New button
    And I enter below data
      | First Name | Last Name | Region         | Resource Role | Is Resource Active | Is Resource | Work Calendar |
      | Ambi       | Chaliki   | United Kingdom | Test Analyst  | True               | True        | Global        |
      | Sahasra    | Chaliki   | India          | Trainee       | True               | True        | Global        |
      | Jack       | Jill      | USA            | Developer     | False              | False       | USA           |
    When I click Save
    Then new Contact should be created
    And User must be navigated to newly created contact page
  @smoke
  Scenario: Creating copy with special characters
    Given I am on Contact tab
    And I click New button
    And I enter below data
      | First Name | Last Name | Region         | Resource Role | Is Resource Active | Is Resource | Work Calendar |
      | @£$%%      | )**&^%$   | United Kingdom | Test Analyst  | True               | True        | Global        |
    When I click Save
    Then new Contact should be created
    And User must be navigated to newly created contact page





