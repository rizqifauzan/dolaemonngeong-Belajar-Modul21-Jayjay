@login
Feature: Login

  @valid-login
  Scenario: Login using valid username and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    #Then user will be on homepage

  @invalid-login
  Scenario: Login using valid username and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user is on login page
    #And user see error message "Epic sadface: Username and password do not match any user in this service"

