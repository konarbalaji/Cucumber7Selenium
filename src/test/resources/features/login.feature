@prod
Feature: Login Feature
  In order to perform successful login
  As a user
  I have to entre correct username and password

  Scenario Outline: Login to the Facebook website as a Valid user
    Given User navigates to the facebook website
    When user navigates the homepage title
    Then user enters "<username>" username
    And user enters "<password>" password
    And user clicks on signon button

Examples:
  | username | password |
  | valid    | valid    |
  | invalid  | invalid  |
  | valid    | invalid  |
  | valid    | invalid  |