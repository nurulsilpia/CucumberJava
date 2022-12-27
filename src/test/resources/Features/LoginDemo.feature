Feature: test login functionality demo

  Scenario Outline: Check login is successful with valid credential
    Given browser is open
    And user is on login page
    When user enter <username> and <password>
    And user click on login button
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | Piarus   |    12345 |
      | wyne     |    12345 |
