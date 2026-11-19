@prod
Feature: Login Feature of Prod
  In order to perform successful login
  As a user
  I have to enter correct username and password

  Scenario Outline: Login to Facebook website of Prod
    Given user navigates to the Facebook website
    When user validates the homepage title
    Then user enters "<username>" username
    And user enters "<password>" password
    And I validate captcha image
    And user clicks on the signin button

    Examples:
      |username|password|
      |Valid   |Valid   |
      |Valid   |Invalid |
      |Invalid |Invalid |
      |Invalid |Valid   |