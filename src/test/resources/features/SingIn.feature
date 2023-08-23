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
    Then the user should see error messages for both email and password fields

