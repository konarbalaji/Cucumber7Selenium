@datatable
Feature: Login Feature - Production
  In order to perform successful login
  As a user
  I have to enter correct username and password

  Scenario: Login to facebook website as a user on production
    Given User navigates to the facebook website
    When user navigates the homepage title
    Then user enters "valid" username
    And user enters "valid" password
    And user validates captcha image
    And user enters firstname and lastname
      | Rahul | Arora |
      | Cory  | Paul  |
    And user clicks on signon button