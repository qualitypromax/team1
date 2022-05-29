#Author: your.email@your.domain.com
@tag
Feature: Login to the SwagLabs Ecommerce Website

  @Functional
  Scenario: Login and Logout of the SawgLabs
    Given I go to SwagLabs website
    When I enter the username and password
    And I click the Login button
    Then I should be redirected to the Homepage
    When I click the Sauce Labs Backpack
    Then I should see its product image displayed
    Then I Validate the price of the product       
