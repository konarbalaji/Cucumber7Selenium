Feature: Login Feature
  In order to perform successful login
  As a user
  I have to entre correct username and password

  Scenario: Login to the Facebook website
    Given User navigates to the facebook website
    When user navigates the homepage title
    Then user enters username
    And user enters password
    And user clicks on signon button