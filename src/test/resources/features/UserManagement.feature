Feature: User group category features

  @userGroup
  Scenario: verify user categories

    Given the user (Librarian) on the homepage
    When the user click users module
    And the user click User Group dropdown
    Then the user should see the following options:
      | ALL       |
      | Librarian |
      | Students  |
