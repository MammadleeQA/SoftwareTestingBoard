Feature: Order
  Background:
    Given Goo to "https://magento.softwaretestingboard.com/" page

    Scenario: First item to card
      Given I am in maestro page
      When Click men button
      Then 3 seconds wait

