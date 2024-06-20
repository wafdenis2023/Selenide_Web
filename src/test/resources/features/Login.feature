# Created by denis.wafula at 19/06/2024
Feature: Login Functionality

  @login
  Scenario: Successful login
    When user enters username "standard_user" and password "secret_sauce"
    Then user should be redirected to "https://www.saucedemo.com/inventory.html"

  @login
  Scenario: Login with invalid credentials
    When user enters username "invalid_user" and password "invalid_password"
    Then error message "Epic sadface: Username and password do not match any user in this service" should be displayed

  @login
  Scenario: Login without password
    When user enters username "standard_user" and password ""
    Then error message "Epic sadface: Password is required" should be displayed

  @login
  Scenario: Login without username
    When user enters username "" and password "secret_sauce"
    Then error message "Epic sadface: Username is required" should be displayed
