Feature: Login

  @login
  Scenario: Valid Login
    Given I navigate to PHP Travels Login page
    And enter valid email id
    And enter valid password
    When I click Login button
    Then I should be navigated to my account page