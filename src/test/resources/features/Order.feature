Feature: Order
  Background:
    Given Goo to "https://magento.softwaretestingboard.com/" page
    When Sign in with "japeti2335@wiemei.com" e-mail and "Parol-123" password default credentials

    Scenario Outline: Try add to card item with invalid "<credentials>"
      Given I am in maestro page
      When Click men button
      Then Click men's tops button
      And Scroll 1250
      And Click first picture
      And Scroll
      And Select "<size>" size
      And Click to button add to cart
      And 3 seconds wait
      Then Check the "This is a required field." should be displayed

      Examples:
        | credentials         | size |
        | when size is xs     |   XS |
        | when size is s      |   S  |
        | when size is m      |   M  |
        | when size is l      |   L  |
        | when size is xl     |   XL |


