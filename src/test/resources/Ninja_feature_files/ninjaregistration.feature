@RegisterTutorialNinja
Feature: Registration Functionality of TutorialsNinja

Scenario: I Create An Account With Mandotory Fields
Given I navigate to the Register Page
When I enter the details into below fields
|firstname            |Golam Shajlee Adeeb   |
|lastname             |Chowdhury             |
|email                |chowdhurygs@gmail.com |
|telephone            |5405756079            |
|password             |Shajlee1234           |
|passwordConfirmation |Shajlee1234           |
And I click the Privacy Policy checkbox
When I click the Continue button
Then I get a succssfull account creation message

Scenario: I Create An Account With All The Fields
Given I navigate to the Register Page
When I enter the details into below fields
|firstname            |Golam Shajlee Adeeb   |
|lastname             |Chowdhury             |
|telephone            |5405756079            |
|password             |Shajlee1234           |
|passwordConfirmation |Shajlee1234           |
And I select Yes for Newsletter
And I click the Privacy Policy checkbox
When I click the Continue button
Then I get a succssfull account creation message

Scenario: I Create A Duplicate Account
Given I navigate to the Register Page
When I enter the details into below fields with duplicate email
|firstname            |Golam Shajlee Adeeb   |
|lastname             |Chowdhury             |
|email                |chowdhurygs@gmail.com |
|telephone            |5405756079            |
|password             |Shajlee1234           |
|passwordConfirmation |Shajlee1234           |
And I select Yes for Newsletter
And I click the Privacy Policy checkbox
When I click the Continue button
Then I get a duplicated account warning message

Scenario: I Create An Account Without Filling Any Fields
Given I navigate to the Register Page
When I do not enter any field
And I click on the continue button
Then I get warning message for each field

