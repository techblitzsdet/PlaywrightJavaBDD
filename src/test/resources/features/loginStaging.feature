@staging
Feature: Login Feature of staging
  In order to perform successful login
  As a user
  I have to enter correct username and password

  Background:
    Given user navigates to the Facebook website of staging
    When user validates the homepage title

  Scenario: Login to Facebook website of staging
    Then user enters "valid" username
    And user enters "valid" password
    And user clicks on the signin button

  Scenario: Login to Google website
    Then user enters "Bhabani" username of Demo
    And user enters "Shankar" password of Demo