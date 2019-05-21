Feature:Logout

  Scenario:Logout
  Given I am logged into PHP Travels site
  When I click Logout button
  Then I expect user must be logged out
  And User must be redirected to login Page


