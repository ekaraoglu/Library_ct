Feature: Borrowing Books table
  As a user, I should able to see my borrowing books.

  @Borrowingbookstable
  Scenario: Borrowing books table columns names

    Given the user on the homepage
    When the user click Borrowing Books module
    Then the user should see the following column names:

      | Action              |
      | Book Name           |
      | Borrowed Date       |
      | Planned Return Date |
      | Return Date         |
      | Is Returned ?       |
