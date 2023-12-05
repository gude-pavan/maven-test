#Author: Pavan kumar
#Version : V 1.0
#Features testing: Products page sorting test
@smokefeature @productssort_check @Swaglabs
Feature: Feature to test products sort by filter

  Background: 
    Given Open the chrome browser
    And User is on login Page
    When User enters standard_user and secret_sauce
    And Clicks on Login button
    Then Browser navigates to login home page

  @productssort_success
  Scenario Outline: Check products login by filter
    When provides the Sort value <sortvalue>
    #		Then Validate the products and prices
    Then Validate the first product and price <first_product_name>  and <first_product_price>
    And Validate the last product and price <last_product_name> and <last_product_price>

    Examples: 
      | sortvalue           | first_product_name                | first_product_price | last_product_name                 | last_product_price |
      | Name (A to Z)       | Sauce Labs Backpack               | $29.99              | Test.allTheThings() T-Shirt (Red) | $15.99             |
      | Name (Z to A)       | Test.allTheThings() T-Shirt (Red) | $15.99              | Sauce Labs Backpack               | $29.99             |
      | Price (low to high) | Sauce Labs Onesie                 | $7.99               | Sauce Labs Fleece Jacket          | $49.99             |
      | Price (high to low) | Sauce Labs Fleece Jacket          | $49.99              | Sauce Labs Onesie                 | $7.99              |
