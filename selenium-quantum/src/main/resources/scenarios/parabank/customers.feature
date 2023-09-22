@parabank @customers
Feature: Parabank Customers

  Background:
    Given user opens the Parabank web login page
    When user enters the username
    And user enters the password
    And user clicks on login
    Then the user is logged in successfully

  @getCustomer
  Scenario: Get Customer Details
    When user clicks on the "Update Contact Info" link
    Then the "Update Profile" page is displayed
    And the following customer details are displayed
      | customer.firstName       |
      | customer.lastName        |
      | customer.address.street  |
      | customer.address.city    |
      | customer.address.state   |
      | customer.address.zipCode |
      | customer.phoneNumber     |

  @updateCustomer
  Scenario: Update Customer Details
    When user clicks on the "Update Contact Info" link
    Then the "Update Profile" page is displayed
    When the user updates the following customer details
      | customer.firstName       |
      | customer.lastName        |
      | customer.address.street  |
      | customer.address.city    |
      | customer.address.state   |
      | customer.address.zipCode |
      | customer.phoneNumber     |
    And user clicks on "UPDATE PROFILE" button
    Then customer profile is updated successfully