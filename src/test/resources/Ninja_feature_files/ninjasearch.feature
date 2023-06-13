@TutorialsNinjaSearch
Feature: Search Functionality of Turorials Ninja with Valid and Invalid Product

@SearchWithValidProduct
Scenario: Search with a valid product
Given I navigate to the url
Then I enter the valid product name "Macbook" in the search field
When I click the search button
Then I get a valid product displayed

@SearchWithInvalidProduct
Scenario: Search with an invalid product
Given I navigate to the url
Then I enter the invalid product name "Pepsi" in the search field
When I click the search button
Then I get an invalid product message
