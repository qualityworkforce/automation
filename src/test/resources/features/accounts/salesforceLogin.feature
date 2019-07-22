Feature: Login

  Scenario:Login
#    Given I navigate to salesforce login page
    And enter valid user name
    And enter a valid password
    When I click on login
   Then you must be logged in to saleforce site

