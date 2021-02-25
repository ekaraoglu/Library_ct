
@Login
Feature: Library App
  Provide Highly scalable library management system
  Can be adapted to suit any library, of any size, worldwide
  Libraries manage, circulate, and catalog different materials






  Scenario: As a Student , i should be able to log out form the library app
    Given Student logins in
    Then Student is on Books page
    Then Student logs out

