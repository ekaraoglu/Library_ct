  Feature:As a students, I should be able to see tables with default info
    @tableColumns
    Scenario: Table columns names
      Given the user is on the homepage
      Then the user should see the following column names:
        | Actions     |
        | ISBN        |
        | Name        |
        | Author      |
        | Category    |
        | Year        |
        | Borrowed By |

