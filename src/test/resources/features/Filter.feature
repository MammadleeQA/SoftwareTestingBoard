Feature: Filter

  Background:
    Given Go to "https://magento.softwaretestingboard.com/gear/bags.html" page
    Then I am Magento Bags page

  Scenario: Default mode is Grid
    Given Grid-mode selected

  Scenario: Select Grid Mode
    Given Click List-Switcher
    When Click Grid-Switcher
    Then Grid-mode selected

  Scenario: Select List Mode
    Given Click List-Switcher
    Then List-mode selected

  Scenario: Default sort is Position
    Given Position Sort selected

  Scenario: Sort by Position
    Given Click sort list
    When Click Product Name Sort
    And Click sort list
    And Click Position Sort
    Then Position Sort selected

  Scenario: Sort by Product Name
    Given Click sort list
    When Click Product Name Sort
    Then Product Name Sort selected

  Scenario: Sort by Price
    Given Click sort list
    When Click Price Sort
    Then Price Sort selected

  Scenario: Default pagination is 1
    Given Current pagination is First

  Scenario: Go to First pagination number
    Given Click second pagination number
    When Click first pagination number
    Then Current pagination is First

  Scenario: Go to Second pagination number
    Given Click second pagination number
    Then Current pagination is Second

  Scenario: Go to Previous page with pagination
    Given Click Next pagination button
    When Click Previous pagination button
    Then Current pagination is First

  Scenario: Go to Next page with pagination
    Given Click Next pagination button
    Then Current pagination is Second

  Scenario: Default Product Count Limiter is 12
    Given Current Limiter Option is 12

  Scenario: Choose Product Count Limiter Option 12
    Given Click Limiter
    When Click Limiter Option 24
    And Click Limiter Option 12
    Then Current Limiter Option is 12

  Scenario: Choose Product Count Limiter Option 24
    Given Click Limiter
    When Click Limiter Option 24
    Then Current Limiter Option is 24

  Scenario: Choose Product Count Limiter Option 36
    Given Click Limiter
    When Click Limiter Option 36
    Then Current Limiter Option is 36


















