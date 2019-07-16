Feature: Adding Tasks
  Background:User Logged in and User on Gantt Page
    Given I am logged into Salesforce account
    And I click on Project tab
    When I click on Gantt tab
    Then Gantt page should be opened

    Scenario:
      Given I click on add task button for 10 times
      When I click save
      Then all the 10 tasks much be saved

