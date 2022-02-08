
  @login
Feature: User should be able to login

  Background:
    Given the user is on the login page


  @driver   @smoke
  Scenario: Login as a driver
    When the user enters the driver information
    Then the user should be able to login

     @smoke
  Scenario: Login as a sales manager
    Given the user is on the login page
    When the user enters the sales manager information
    Then the user should be able to login

    @store_manager
  Scenario: Login as a store manager
    Given the user is on the login page
    When the user enters the store manager information
    Then the user should be able to login



