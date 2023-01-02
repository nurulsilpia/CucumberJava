Feature: Check home page funcitonality background

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And user click on login button
    Then user is navigated to the homepage

  Scenario: check logout link
    When user click on sidebar
    Then log out feature is displayed

  Scenario: verify product is present
    When when user click on one product
    Then product detail is displayed
