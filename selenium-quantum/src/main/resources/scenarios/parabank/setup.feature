@parabank @setup
Feature: Setup Parabank

  @cleanDB
  Scenario: Clean the Database
    Given user opens the Parabank web login page
    When user navigates to the admin page
    And user clicks on clean button
    Then the database is cleaned successfully

  @initializeDB
  Scenario: Initialize the Database
    Given user opens the Parabank web login page
    When user navigates to the admin page
    And user clicks on initialize
    Then the database initialized successfully