Feature: Order
  Background:
    Given Goo to "https://magento.softwaretestingboard.com/" page

    Scenario: First item to card
      Given I am in maestro page
      When Click men button
      When Click men's tops button
      When Scroll
      When Click first picture
      When Scroll 
      Then 3 seconds wait

