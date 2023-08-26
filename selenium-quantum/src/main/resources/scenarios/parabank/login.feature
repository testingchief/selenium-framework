@parabank
Feature: Login to Parabank

  @login
  Scenario: Customer Login
    Given user opens the Parabank web login page
    When user enters the username
    And user enters the password
    And user clicks on login
    Then the accounts overview page is displayed
    And the user is logged in successfully
    Then user logs out of the application
