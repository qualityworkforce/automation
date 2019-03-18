Feature: Data Tables


#  Scenario:Data Tables
#    Given As a user I want to use data tables
#    When I enter below data
#      | First Name |  | Last Name | Place of Birth |
#      | Ambi       |  | Chaliki   | Kakinada       |
#      | Sahasra    |  | Chaliki   | Chennai        |
#      | Nirmala    |  | Dharmaraj | kakinada       |
#      | Veerendra  |  | Chaliki   | Kakinada       |
#    Then it should be displayed on the screen

  Scenario:Creating Contact only with mandatory fields

    Given I am on Contact tab
    And I click New button
    And I enter
      | Last Name | Contact Currency | Is Resource Active | Is Resource |
      | Chaliki   | USD              | True               | True        |
    When I click Save
    Then new Contact should be created
    And User must be navigated to newly created contact page