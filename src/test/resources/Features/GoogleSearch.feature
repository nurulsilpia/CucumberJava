Feature: feature to test Google search functionality

  Scenario: Validate google search is working
    Given browser is open
    And user is on google search page
    When user enter the text in search box
    And hits enter
    Then user navigated to search result
