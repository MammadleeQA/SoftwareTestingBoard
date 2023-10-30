Feature: Compare

  Background:
    Given Go to "https://magento.softwaretestingboard.com/" page
    When Sign in with "japeti2335@wiemei.com" e-mail and "Parol-123" password default credentials

  Scenario: Filling up the Compare Product List
    Given Adding items to compare list and seeing if the list is filled
    Given My compare product items are visible