@parabank @transactions
Feature: Parabank Account Transactions

  @getTransactionsByAmount
  Scenario: Find Transactions by Amount
    When user clicks on "Find Transactions" link
    Then the "Find Transactions" page is displayed
    When user selects an account number
#      | 12345 |
    And user enters a search criteria
#      | criteria.amount | 100 |
    And user clicks on "FIND TRANSACTIONS" button
#      | criteria.searchType = "AMOUNT" |
    Then the "Transaction Results" page is displayed
    And the following transaction details are displayed
      | Date        |
      | Transaction |
      | Debit       |
      | Credit      |

  @getTransactionsForDateRange
  Scenario: Find Transactions for Date range
    When user clicks on "Find Transactions" link
    Then the "Find Transactions" page is displayed
    When user selects an account number
#      | 12345 |
    And user enters a search criteria
#      | criteria.fromDate | 01-01-2022 |
#      | criteria.toDate   | 12-31-2023 |
    And user clicks on "FIND TRANSACTIONS" button
#      | criteria.searchType = "DATE_RANGE" |
    Then the "Transaction Results" page is displayed
    And the following transaction details are displayed
      | Date        |
      | Transaction |
      | Debit       |
      | Credit      |

  @getTransactionsByDate
  Scenario: Find Transactions for a specific Date
    When user clicks on "Find Transactions" link
    Then the "Find Transactions" page is displayed
    When user selects an account number
#      | 12345 |
    And user enters a search criteria
      | criteria.onDate | currentDate |
    And user clicks on "FIND TRANSACTIONS" button
#      | criteria.searchType = "DATE" |
    Then the "Transaction Results" page is displayed
    And the following transaction details are displayed
      | Date        |
      | Transaction |
      | Debit       |
      | Credit      |

  @getTransactionsById
  Scenario: Get details of Transaction by Id
    When user clicks on "Find Transactions" link
    Then the "Find Transactions" page is displayed
    When user selects an account number
#      | 12345 |
    And user enters a search criteria
#      | criteria.transactionId | 12145 |
    And user clicks on "FIND TRANSACTIONS" button
#      | criteria.searchType = "ID" |
    Then the "Transaction Results" page is displayed
    And the following transaction details are displayed
      | Date        |
      | Transaction |
      | Debit       |
      | Credit      |