Feature: Gantt

  Scenario: Opening Gantt
    Given I am logged into Salesforce account
    And I click on Project tab
    When I click on Gantt tab
    Then Gantt page should be opened
