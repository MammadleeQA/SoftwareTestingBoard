Feature: User Registration
  Background:
    Given Go to "https://magento.softwaretestingboard.com/" page

  Scenario: Successful registration with valid credentials
    Given the user is on the registration page
    When the user enters valid registration details
    And submits the registration form
    Then go to index page


  Scenario: Registration with mismatched passwords
    Given the user is on the registration page
    When the user enters registration details with mismatched passwords
    And submits the registration form
    Then the user should see an error message regarding password mismatch


  Scenario: Registration with an existing email
    Given the user is on the registration page
    When the user enters registration details with an already registered email
    And submits the registration form
    Then the user should see an error message indicating the email is already registered


  Scenario: Registration with missing required fields
    Given the user is on the registration page
    When the user submits the registration form with missing required fields
    Then the user should see error messages for the missing fields


  Scenario: Registration with an invalid email format
    Given the user is on the registration page
    When the user enters an invalid email format in the registration form
    And submits the registration form
    Then the user should see an error message indicating an invalid email format


