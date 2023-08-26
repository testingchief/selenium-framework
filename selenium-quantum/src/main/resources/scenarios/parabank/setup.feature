@parabank @setup
Feature: Setup Parabank

  Background:
    Given user opens the Parabank web login page
    When user navigates to the admin page

  @stopListener
  Scenario: Stop JMS Listener
    When user clicks on shutdown button
    Then the JMS service is "Stopped"

  @startListener
  Scenario: Start JMS Listener
    When user clicks on startup button
    Then the JMS service is "Running"

  @cleanDB
  Scenario: Clean the Database
    When user clicks on clean button
    Then the database is cleaned successfully

  @initializeDB
  Scenario: Initialize the Database
    When user clicks on initialize
    Then the database initialized successfully