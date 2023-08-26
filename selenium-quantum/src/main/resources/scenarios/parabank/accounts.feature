@parabank @accounts
Feature: Parabank Customer Accounts

  Background:
    Given user opens the Parabank web login page
    When user enters the username
    And user enters the password
    And user clicks on login
    Then the user is logged in successfully

  @findAccounts
  Scenario: Get Customer Accounts

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
    Given user logs out of the application
    When the user clicks on register link
    And enter the required customer information
      | field                        | value |
      | customer.firstName           | ""    |
      | customer.lastName            | ""    |
      | customer.address.street      | ""    |
      | customer.address.city        | ""    |
      | customer.address.state       | ""    |
      | customer.address.zipCode     | ""    |
      | customer.address.phoneNumber | ""    |
      | customer.ssn                 | ""    |
      | customer.username            | ""    |
      | customer.password            | ""    |
      | repeatedPassword             | ""    |
    And user clicks on register button
    Then the user is created successfully