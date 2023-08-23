Feature: User Sign-In
  Background:
    Given Go to "https://magento.softwaretestingboard.com/" page

  Scenario: Successful sign-in
    Given the user is on the sign-in page
    When the user enters valid email and password
    And clicks the Sign In button
    Then the user should be redirected to their account page

  Scenario: Sign-In with invalid credentials
    Given the user is on the sign-in page
    When the user enters invalid email and password
    And clicks the Sign In button
    Then the user should see an error message indicating invalid credentials

  Scenario: Sign-In with blank email and password fields
    Given the user is on the sign-in page
    When the user leaves the email and password fields blank
    And clicks the Sign In button
    Then the user should see error messages for both email and password fields

  Scenario: Sign-In with blank email field
    Given the user is on the sign-in page
    When the user leaves the email field blank
    And enters a valid password
    And clicks the "Sign In" button
    Then the user should see an error message for the email field

  Scenario: Sign-In with blank password field
    Given the user is on the sign-in page
    When the user enters a valid email
    And leaves the password field blank
    And clicks the "Sign In" button
    Then the user should see an error message for the password field

  Scenario: Forgot Password Link
    Given the user is on the sign-in page
    When the user clicks on the "Forgot Your Password?" link
    Then the user should be redirected to the password reset page

  Scenario: Sign-In with unregistered email
    Given the user is on the sign-in page
    When the user enters an email that is not registered
    And enters a valid password
    And clicks the "Sign In" button
    Then the user should see an error message indicating the email is not registered

  Scenario: Sign-In with locked account
    Given the user is on the sign-in page
    When the user enters a locked account's email
    And enters a valid password
    And clicks the "Sign In" button
    Then the user should see an error message indicating the account is locked

  Scenario: Sign-In with expired password
    Given the user is on the sign-in page
    When the user enters an email with an expired password
    And enters the expired password
    And clicks the "Sign In" button
    Then the user should see an error message indicating the password has expired

  Scenario: Sign-In with valid email and invalid password format
    Given the user is on the sign-in page
    When the user enters a valid email
    And enters a password with an invalid format
    And clicks the "Sign In" button
    Then the user should see an error message indicating the password format is invalid
