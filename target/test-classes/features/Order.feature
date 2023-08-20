Feature: Order
  Background:
    Given Goo to "https://magento.softwaretestingboard.com/" page
    When Sign in with "japeti2335@wiemei.com" e-mail and "Parol-123" password default credentials

    Scenario Outline: Trying add to card item with different sizes and without selection of colour "<credentials>"
      Given I am in maestro page
      When Click men button
      Then Click men's tops button
      And Scroll 1250
      And Click first picture
      And Scroll 250
      And Select "<size>" size
      And Click to button add to cart
      And 3 seconds wait
      Then Check the "This is a required field." for size should be displayed
      
      Examples:
        | credentials         | size |
        | when size is xs     |   XS |
        | when size is s      |   S  |
        | when size is m      |   M  |
        | when size is l      |   L  |
        | when size is xl     |   XL |

  Scenario Outline: Trying add to card item with different colours and without selection of size "<credentials>"
    Given I am in maestro page
    When Click men button
    Then Click men's tops button
    And Scroll 1250
    And Click second picture
    And Scroll 250
    And Select "<colour>" colour
    And 1 seconds wait
    And Click to button add to cart
    And 3 seconds wait
    Then Check the "This is a required field." for colour should be displayed
    Examples:
      | credentials          | colour |
      | when colour is red   | red    |
      | when colour is white | white  |
      | when colour is blue  | gray   |


  Scenario Outline: Trying add to card item with selected colour and selected size
    Given I am in maestro page
    When Click women button
    Then Click women's jackets button
    And Scroll <num>
    And Click third picture
    And Scroll <num1>
    And Select "<size>" size
    And Select "<colour>" colour
    And Click to button add to cart
    And <2seconds> seconds wait
    And Check the "You added Juno Jacket to your shopping cart." for success should be displayed
    And Scroll <num2>
    And Click to basket
    And <num3> seconds wait
    And Scroll <num1>
    And Click to view basket
    Then <second> seconds wait

    Examples:
    | num | num1 | colour   | size  | second  | num2 | num3| 2seconds|
    | 350 | 230  | blue     |   M   |    1    | -250 |  1  |     2   |
    | 350 | 230  | green    |   XL  |    1    | -250 |  1  |     2   |
    | 350 | 230  | purple   |   L   |    1    | -250 |  1  |     2   |

  Scenario Outline: Trying update selected item
    Given I am in maestro page
    When Click women button
    Then Click women's tops button
    And Scroll <num>
    And Click fourth picture
    And Scroll <num1>
    And Select "<size>" size
    And Select "<colour>" colour
    And Click to button add to cart
    And <2seconds> seconds wait
    And Check the "You added Nona Fitness Tank to your shopping cart." for success should be displayed
    And Scroll <num2>
    And Click to basket
    And <num3> seconds wait
    And Scroll <num1>
    And Click to view basket
    And Scroll <num4>
    And Click updatefourth button
    And <second> seconds wait
    And Scroll <num1>
    And Select "<size2>" size
    And Select "<colour2>" colour
    And Click update cart button
    And <2seconds> seconds wait
    And Check the "Nona Fitness Tank was updated in your shopping cart." for success should be displayed
    And Click removefourth button
    Then <second> seconds wait

    Examples:
      | num | num1 | colour   | size  | second  | num2 | num3| 2seconds|  size2  |   colour2  |  num4  |
      | 750 | 230  | blue     |   M   |    1    | -250 |  1  |     2   |     L   |    purple  |   100  |
      | 750 | 230  | red      |   XL  |    1    | -250 |  1  |     2   |     S   |    blue    |   300  |
      | 750 | 230  | purple   |   S   |    1    | -250 |  1  |     2   |     M   |    red     |   500  |
