@simple-app @android
Feature: Action List Feature
  Background:
    Given User is on login page
    When User input username "admin"
    And User input password "admin"
    And User click button sign in
    Then User successfully log in

  Scenario: Scroll with pointer
    Given user already login
    When user go to list page
    And user doing swipe on list page
    Then user successfully swipe the screen

  Scenario: Long press on the list
    Given user already login
    When user go to list page
    Then user doing long press in the list

  Scenario: Multiple tap on the list
    Given user already login
    When user go to list page
    Then user doing multiple press in the list 5 times
