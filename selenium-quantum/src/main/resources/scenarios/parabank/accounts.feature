@parabank @accounts
Feature: Parabank Customer Accounts

  @findAccounts
  Scenario: Get Customer Accounts
    Given user opens the Parabank web login page
    When user enters the username
    And user enters the password
    And user clicks on login
    Then the accounts overview page is displayed

  @getAccountById
  Scenario: Get Account By Id
    Given user opens the Parabank web login page

  @depositFunds
  Scenario: Deposit Funds
    Given user opens the Parabank web login page

  @transferFunds
  Scenario: Transfer Funds
    Given user opens the Parabank web login page

  @withdrawFunds
  Scenario: Withdraw Funds
    Given user opens the Parabank web login page

  @payBill
  Scenario: Pay Bill
    Given user opens the Parabank web login page

  @loanApproved
  Scenario: Loan Approved
    Given user opens the Parabank web login page

  @loanRejected
  Scenario: Loan Rejected
    Given user opens the Parabank web login page

  @createAccount
  Scenario: Create a New Account
    Given user opens the Parabank web login page
