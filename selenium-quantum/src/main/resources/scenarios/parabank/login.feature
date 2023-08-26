@parabank
Feature: Login to Parabank

  @login
  Scenario: Customer Login
    Given user opens the Parabank web login page
    When user enters the username
    And user enters the password
    And user clicks on login
    Then the user is logged in successfully
    And the accounts overview page is displayed
    Then user logs out of the application
