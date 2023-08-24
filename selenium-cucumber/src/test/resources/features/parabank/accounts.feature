@parabank @accounts
Feature: Parabank Customer Accounts

  Background:
    Given user opens the Parabank web login page
    When user enters the username
    And user enters the password
    And user clicks on login
    Then the accounts overview page is displayed

  @findAccounts
  Scenario: Get Customer Accounts
    Given user opens the Parabank web login page
    When user enters the username
    And user enters the password
    And user clicks on login
    Then the accounts overview page is displayed

  @getAccountById
  Scenario: Get Account By Id

  @depositFunds
  Scenario: Deposit Funds

  @transferFunds
  Scenario: Transfer Funds

  @withdrawFunds
  Scenario: Withdraw Funds

  @payBill
  Scenario: Pay Bill

  @loanApproved
  Scenario: Loan Approved

  @loanRejected
  Scenario: Loan Rejected

  @createAccount
  Scenario: Create a New Account
