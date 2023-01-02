Feature: check login functionality hooks

  Scenario: 
    Given user is on login page hooks
    When user enter valid username and password
    And user click login button
    Then user is navigated to the home page

  Scenario: 
    Given user is on login page hooks
    When user enter valid username and password
    And user click login button
    Then user is navigated to the home page
