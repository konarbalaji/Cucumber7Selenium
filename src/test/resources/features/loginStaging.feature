@staging
Feature: Login Feature - staging
  In order to perform successful login
  As a user
  I have to entre correct username and password

  Background:
    Given User navigates to the facebook website
    When user navigates the homepage title

    Scenario: Login to the facebook website as valid user on staging env
      Given User navigates to the facebook website
      When user navigates the homepage title
      Then user enters "valid" username
      And user enters "valid" password
      And user validates captcha image
      And user clicks on signon button

    Scenario: Login to the facebook website as valid user on staging env
      Given User navigates to the facebook website
      When user navigates the homepage title
      Then user enters "valid" username
      And user enters "valid" password
      And user validates captcha image
      And user clicks on signon button