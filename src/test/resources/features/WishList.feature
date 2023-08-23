Feature: MWL

  Background:
    Given Go to "https://magento.softwaretestingboard.com/" page
    When Sign in with "japeti2335@wiemei.com" e-mail and "Parol-123" password default credentials

  Scenario: Filling up the Wish List
    Given Adding items to wish list and seeing if the list is filled
    Given My wishlist is visible