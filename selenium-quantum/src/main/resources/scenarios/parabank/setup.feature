@parabank @setup
Feature: Setup Parabank

  Background:
    Given user opens the Parabank web login page
    When user navigates to the admin page

  @stopListener
  Scenario: Stop JMS Listener
    When user clicks on "SHUTDOWN" button
    Then the JMS service is "Stopped"

  @startListener
  Scenario: Start JMS Listener
    When user clicks on "STARTUP" button
    Then the JMS service is "Running"

  @cleanDB
  Scenario: Clean the Database
    When user clicks on "CLEAN" button
    Then "Database Cleaned" message is displayed

  @initializeDB
  Scenario: Initialize the Database
    When user clicks on "INITIALIZE" button
    Then "Database Initialized" message is displayed