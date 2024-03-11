Feature: This feature will allow you to call the calculator operations.

  @Sanity
  Scenario: To add two numbers and validate the results are coming fine
    Given I have two numbers 5 and 6
    When I add those two numbers
    Then I should get the result as 11

  Scenario: To subtract two numbers and validate the results are coming fine
    Given I have two numbers 11 and 6
    When I subtract those two numbers
    Then I should get the result as 5
