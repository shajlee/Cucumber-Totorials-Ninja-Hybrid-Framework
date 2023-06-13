@LoginTutorialsNinja
Feature: Login Functionality of Tutorials Ninja

  Scenario: Login to TutorialsNinja with Valid Credentials
    Given user navigates to the login page
    And user enters valid email "chowdhurygs@gmail.com" in email field
    And user enters valid password "Shajlee1234" in password field
    When user clicks on login button
    Then user gets successfully logged in

  Scenario: Login to TutorialsNinja with Invalid Credentials
    Given user navigates to the login page
    And user enters invalid email in email field
    And user enters invalid password "Shajlee12345" in password field
    When user clicks on login button
    Then user gets credentials mismatch warning message

  Scenario: Login to TutorialsNinja with Valid Email and Invalid Password
    Given user navigates to the login page
    And user enters valid email "chowdhurygs@gmail.com" in email field
    And user enters invalid password "Shajlee12345" in password field
    When user clicks on login button
    Then user gets credentials mismatch warning message

  Scenario: Login to TutorialsNinja with Invalid Email andnvalid Password
    Given user navigates to the login page
    And user enters invalid email in email field
    And user enters valid password "Shajlee1234" in password field
    When user clicks on login button
    Then user gets credentials mismatch warning message

  Scenario: Login to TutorialsNinja without Credentials
    Given user navigates to the login page
    And user keeps email field blank
    And user keeps password field blank
    When user clicks on login button
    Then user gets credentials mismatch warning message
