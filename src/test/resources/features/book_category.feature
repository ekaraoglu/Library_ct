
Feature: Library App
  Provide Highly scalable library management system
  Can be adapted to suit any library, of any size, worldwide
  Libraries manage, circulate, and catalog different materials


  Background: Login as student
    Given student logins and lands on books page
Scenario: As a student, I should be able to search books with different categories.(US-7)

Then Student can choose from the list all the category dropdown
| ALL                     |
| Action and Adventure    |
| Anthology               |
| Classic                 |
| Comic and Graphic Novel |
| Crime and Detective     |
| Drama                   |
| Fable                   |
| Fairy Tale              |
| Fan-Fiction             |
| Fantasy                 |
| Historical Fiction      |
| Horror                  |
| Science Fiction         |
| Biography/Autobiography |
| Humor                   |
| Romance                 |
| Short Story             |
| Essay                   |
| Memoir                  |
| Poetry                  |