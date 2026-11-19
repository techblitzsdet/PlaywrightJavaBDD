@login
Feature: Login Feature
  In order to perform successful login
  As a user
  I have to enter correct username and password

  Scenario: Login to Facebook website
    Given user navigates to the Facebook website
    When user validates the homepage title
    Then user enters "valid" username
    And user enters "valid" password
    And user clicks on the signin button

  Scenario: Login to Google website
    Given user navigates to the Demo website
    When user validates the homepage title of Demo website
    Then user enters "valid" username of Demo
    And user enters "valid" password of Demo