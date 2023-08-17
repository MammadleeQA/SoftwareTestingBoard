Feature: HomePage

    Background:
        Given Go to "https://magento.softwaretestingboard.com/" page
        When Sign in with "japeti2335@wiemei.com" e-mail and "Parol-123" password default credentials


    Scenario Outline: Fill The Address Form

        And Click to Account Popup
        And Click to My Account
        And Click to Edit Address
        And Add "<Name>" firstname, "<Lastname>" lastname, "<Number>" phone number, "<Street>" street address,"<City>" city, and "<Postal>" postal
        And Click on Save Address Button
        And Check "<ErrorName>" Error Message
        And Wait 3 seconds


        Examples:
            |    Name     |    Lastname     |    Number     |    Street     |    City     |    Postal     |    ErrorName    |
            |             |     Theron      | +994505555555 |   Wall st.    |    Baku     |    AZ1001     |   First Name    |
            |  Charlize   |                 | +994505555555 |   Wall st.    |    Baku     |    AZ1001     |    Last Name    |
            |  Charlize   |     Theron      |               |   Wall st.    |    Baku     |    AZ1001     |   Phone Number  |
            |  Charlize   |     Theron      | +994505555555 |               |    Baku     |    AZ1001     |      Street     |
            |  Charlize   |     Theron      | +994505555555 |   Wall st.    |             |    AZ1001     |       City      |
            |  Charlize   |     Theron      | +994505555555 |   Wall st.    |    Baku     |               |                 |


    Scenario: Adding to basket with missing data

        And Click on Shop New Yoga
        And Scroll Left To Right to 0 , Top To Bottom to 1300
        And Wait 2 seconds
        And Click on Micro Sleeve Top
        And Wait 2 seconds
        And Scroll Left To Right to 0 , Top To Bottom to 300
        And Click Add to Card button
        And Wait 2 seconds
        Then Check the error Message

    Scenario: Adding to basket with data

        And Scroll Left To Right to 0 , Top To Bottom to 700
        And Click on Shop Pants
        And Scroll Left To Right to 0 , Top To Bottom to 700
        And Wait 2 seconds
        And Click on Bardot Capri
        And Wait 2 seconds
        And Scroll Left To Right to 0 , Top To Bottom to 300
        And Click on 28 Size
        And Wait 2 seconds
        And Click on red Color
        And Click Add to Card button
        And  Wait 3 seconds


    Scenario: Compare

        And Click on What's New
        And Scroll Left To Right to 0 , Top To Bottom to 500
        And Click on Tanks
        And Click on Atlas Fitness
        And Scroll Left To Right to 0 , Top To Bottom to 700
        And Add To Compare
        And Click to back button
        And Click to back button
        And Scroll Left To Right to 0 , Top To Bottom to 700
        And Click on Sparta Gym
        And Scroll Left To Right to 0 , Top To Bottom to 700
        And Add To Compare
        Then Go to Compare


    Scenario: Complete order

        And Scroll Left To Right to 0 , Top To Bottom to 700
        And Click on Shop Tees
        And Scroll Left To Right to 0 , Top To Bottom to 700
        And Click on Diva Gym Tee
        And Select 'M' Size of Diva GYM tee
        And Select Yellow Color
        And Scroll Left To Right to 0 , Top To Bottom to 300
        And CLick on Add To Wishlist
        And Click to back button
        And Click to back button
        And Click on Radiant tee
        And Select 'S' Size of Radiant Tee
        And Select Purple color
        And CLick on Add To Wishlist
        And Click to Add All to Cart
        And Go to Basket
        And Go to Checkout
        And Scroll Left To Right to 0 , Top To Bottom to 700
        And Click on Next button
        And Click on Place Order button
        Then Check the Message


        Scenario: Sign out

            And Click to Account Popup
            Then Sign out


