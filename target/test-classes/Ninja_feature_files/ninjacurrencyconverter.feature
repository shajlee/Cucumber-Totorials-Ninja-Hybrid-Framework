@TutorialNinjaCurrencyConverter
Feature: Functionality of Tutorials Ninja Currency Converter

Scenario: Currency Converter Functionality of Tutorials Ninja
Given I open the designated webpage
When I click the currency tab
And I click the Euro button
Then I see the Euro sign
Given I click the currency tab
When I click the Pound Sterling button
Then I see the Pound Sterling Sign
Given I click the currency tab
When I click the US Dollar button
Then I see the US Dollar sign
