Feature: Gantt

  Scenario: Adding tasks on gantt
    Given I am on project page
    When I click Gantt Button
    And I click on add task button
    Then new task must be added
    And added tasks must be saved when we will save button
