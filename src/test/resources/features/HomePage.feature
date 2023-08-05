Feature: HomePage

    Scenario: Adding to basket with missing data

        Given Go to "https://magento.softwaretestingboard.com/" page
        When Click on Shop New Yoga Button
        And Scroll Left To Right to 0 , Top To Bottom to 1300
        And Wait 3 seconds
        And Select a product
        And Wait 3 seconds
        And Scroll Left To Right to 0 , Top To Bottom to 300
        And Click to Add to Card button
        And Wait 3 seconds
        Then Check the error Message





        
