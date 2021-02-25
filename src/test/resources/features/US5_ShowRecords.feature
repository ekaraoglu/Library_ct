Feature: Show records functionality
  Agile Story: As a librarian, I should be able to see book records on Users page

  @scenario_wip
  Scenario: Verify that the default values displayed on Users page
    Given User is on the login page
    And User logs in as a librarian
    When User clicks on "Users" link
    Then show records default value should be 10
    And show records should have the following <count> options:
  | 5     |
  | 10    |
  | 15    |
  | 50    |
  | 100   |
  | 200   |
  | 500   |


