Feature: Contacts page
@wip
  Scenario:Default page number
    Given the user is on the login page
    And the user enters the driver information
    When the user navigates to "Customers" "Contacts"
   Then default page number should be 1
