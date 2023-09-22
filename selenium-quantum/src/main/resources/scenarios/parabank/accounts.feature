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
    When user clicks on "Accounts Overview" link
    Then the "Accounts Overview" page is displayed
    And the following account information is displayed
      | Account          |
      | Balance          |
      | Available Amount |
      | Total            |

  @getAccountById
  Scenario: Get Account By Id
    When user clicks on "Accounts Overview" link
    Then the "Accounts Overview" page is displayed
    When user clicks on an account number
    Then the "Account Details" page is displayed
    And the following account activity details are displayed
      | Date        |
      | Transaction |
      | Debit       |
      | Credit      |

  @getAccountActivityByPeriod
  Scenario Outline: Get Account Activity By Period
    When user clicks on "Accounts Overview" link
    Then the "Accounts Overview" page is displayed
    When user clicks on an account number
    Then the "Account Details" page is displayed
    When user selects a <period> value from dropdown
    And user clicks on "GO" button
    Then the following account activity details are displayed
      | Date        |
      | Transaction |
      | Debit       |
      | Credit      |

    Examples:
      | period       |
      | All          |
      | currentMonth |

  @getAccountActivityByPeriod
  Scenario Outline: Get Account Activity By Period - No Activity
    When user clicks on "Accounts Overview" link
    Then the "Accounts Overview" page is displayed
    When user clicks on an account number
    Then the "Account Details" page is displayed
    When user selects a <period> value from dropdown
    And user clicks on "GO" button
    Then "No transactions found." message is displayed

    Examples:
      | period    |
      | nextMonth |

  @getAccountActivityByType
  Scenario Outline: Get Account Activity By Type
    When user clicks on "Accounts Overview" link
    Then the "Accounts Overview" page is displayed
    When user clicks on an account number
    Then the "Account Details" page is displayed
    When user selects a <type> value from dropdown
    And user clicks on "GO" button
    Then "No transactions found." message is displayed

    Examples:
      | type   |
      | Credit |
      | Debit  |

  @transferFunds
  Scenario: Transfer Funds
    When user clicks on "Transfer Funds" link
    Then the "Transfer Funds" page is displayed
    When user enters the transfer details
      | fromAccount | toAccount | transferAmount |
      | 12345       | 12456     | $100.00        |
    And user clicks on "TRANSFER" button
    Then "Transfer Complete!" message is displayed
    When user clicks on "Accounts Overview" link
    Then the "Accounts Overview" page is displayed
    When user clicks on an account number
      | 12345 |
    Then the "Account Details" page is displayed
    When user clicks on "Funds Transfer Sent" link
    Then the "Transaction Details" page is displayed
    And the transaction details are displayed
      | Transaction ID |
      | Date           |
      | Description    |
      | Type           |
      | Amount         |

  @payBill
  Scenario: Pay Bill
    When user clicks on "Bill Pay" link
    Then the "Bill Payment Service" page is displayed
    When user enters the payee details
      | payee.name                |
      | payee.address.street      |
      | payee.address.city        |
      | payee.address.state       |
      | payee.address.zipCode     |
      | payee.address.phoneNumber |
      | payee.accountNumber       |
      | verifyAccount             |
      | amount                    |
    And user selects an account
      | 12456 |
    And user clicks on "SEND PAYMENT" button
    Then "Bill Payment Complete" message is displayed
    And the transaction details are displayed
    When user clicks on "Accounts Overview" link
    Then the "Accounts Overview" page is displayed
    When user clicks on an account number
      | 12345 |
    Then the "Account Details" page is displayed
    When user clicks on "Bill Payment to" link
    Then the "Transaction Details" page is displayed
    And the transaction details are displayed
      | Transaction ID |
      | Date           |
      | Description    |
      | Type           |
      | Amount         |

  @loanApproved
  Scenario: Loan Approved
    When user clicks on "Request Loan" link
    Then the "Apply for a Loan" page is displayed
    When the user enters the loan information
      | loanRequest.amount      | $1000 |
      | loanRequest.downPayment | $100  |
    And user selects an account
      | 12456 |
    And user clicks on "APPLY NOW" button
    Then "Loan Request Processed" message is displayed
    And the loan details are displayed
      | Loan Provider |
      | Date          |
      | Status        |
    And the status is displayed as "Approved"
    And "Congratulations, your loan has been approved." message is displayed
    When user clicks on the new account created
    Then the "Account Details" page is displayed
    And the account type is displayed as LOAN

  @loanRejected
  Scenario: Loan Rejected
    When user clicks on "Request Loan" link
    Then the "Apply for a Loan" page is displayed
    When the user enters the loan information
      | loanRequest.amount      | $10000000 |
      | loanRequest.downPayment | $10       |
    And user selects an account
      | 12456 |
    And user clicks on "APPLY NOW" button
    Then "Loan Request Processed" message is displayed
    And the loan details are displayed
      | Loan Provider |
      | Date          |
      | Status        |
    And the status is displayed as "Denied"
    And "We cannot grant a loan in that amount with your available funds." is displayed

  @createAccount
  Scenario: Create a New Account
    Given user logs out of the application
    When user clicks on "Register" link
    And enter the required customer information
      | customer.firstName       |
      | customer.lastName        |
      | customer.address.street  |
      | customer.address.city    |
      | customer.address.state   |
      | customer.address.zipCode |
      | customer.phoneNumber     |
      | customer.ssn             |
      | customer.username        |
      | customer.password        |
      | repeatedPassword         |
    And user clicks on "REGISTER" button
    Then the user is created successfully