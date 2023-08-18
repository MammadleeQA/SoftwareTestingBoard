Feature: Order
  Background:
    Given Goo to "https://magento.softwaretestingboard.com/" page
    When Sign in with "japeti2335@wiemei.com" e-mail and "Parol-123" password default credentials

    Scenario: Try
#    Scenario Outline: Try add to card item with invalid "<credentials>"
      Given I am in maestro page
      When Click men button
      Then Click men's tops button
      And Scroll 1250
      And Click first picture
      And Scroll
      And Select size S
      Then 3 seconds wait

