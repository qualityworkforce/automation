Feature: Login

  @login
  Scenario: Valid Login
    Given I navigate to PHP Travels Login page
    And enter valid email id
    And enter valid password
    When I click Login button
    Then I should be navigated to my account page

   Scenario: Invalid Login
     Given I navigate to PHP Travels Login page
     And enter invalid email id
     And enter valid password
     When I click Login button
     Then I should get a error message as Invalid Email or Password


  Scenario: Invalid Password
    Given I navigate to PHP Travels Login page
    And enter valid email id
    And enter invalid password
    When I click Login button
    Then I should get a error message as Invalid Email or Password


  Scenario: Invalid Login and Password
    Given I navigate to PHP Travels Login page
    And enter invalid email id
    And enter invalid password
    When I click Login button
    Then I should get a error message as Invalid Email or Password
