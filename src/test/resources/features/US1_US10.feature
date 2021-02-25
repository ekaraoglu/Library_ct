@LibraryCT
Feature: LibraryCt verification


  Scenario Outline: As a user, I should be able to login to the library app verify both Students and librarians login
    Given the user login as a "<role>"
    Then the user on "<page>"
    Examples:
      | role      | page      |
      | student   | books     |
      | librarian | dashboard |


  Scenario: Verify user status
    Given the user login as a "librarian"
    When the user click users module
    And the user click Status dropdown
    Then the user should see the following options:
      | ACTIVE   |
      | INACTIVE |



  Scenario: user management table columns names
    Given the user login as a "librarian"
    When the user click users module
    Then the user should see the following column names:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |