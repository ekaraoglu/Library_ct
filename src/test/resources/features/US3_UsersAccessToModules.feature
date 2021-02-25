Feature:

  #As a user, I should be able to see several modules once I login.

  @student
  Scenario: Students should have access to 2 modules
    Given the student is on the home page
    Then the user should see following modules
      | Books           |
      | Borrowing Books |
    
  @librarian
  Scenario: Librarians should have access to 3 modules
    Given the librarian is on the homepage
    Then the user should see following modules
      | Dashboard |
      | Users     |
      | Books     |