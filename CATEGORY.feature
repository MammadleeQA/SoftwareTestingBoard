Feature: CATEGORY

  Background:
    Given Go to "https://magento.softwaretestingboard.com/" page
    When Sign in with "japeti2335@wiemei.com" e-mail and "Parol-123" password default credentials

  Scenario: Checking if categories are available in women tops
    Given Scrolling through the tops categories
    Given Assuring the presence of all 4 categories

  Scenario: Checking if categories are available in women bottoms
    Given Scrolling through the bottoms categories
    Given Assuring the presence of all 2 categories
