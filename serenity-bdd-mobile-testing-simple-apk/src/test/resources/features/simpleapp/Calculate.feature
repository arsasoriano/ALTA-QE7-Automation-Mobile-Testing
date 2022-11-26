@simple-app @android
Feature: Calculator Numbers Feature
  Background:
    Given User is on login page
    When User input username "admin"
    And User input password "admin"
    And User click button sign in
    Then User successfully log in

  Scenario: Adding two numbers
    Given user input number1
    And user input number2
    When user add number1 and number2
    Then the result should be 3

  Scenario: Minus two numbers
    Given user input number1
    And user input number2
    And user choose minus equation
    When user minus number1 and number2
    Then the result should be 1

  Scenario: Divide two numbers
    Given user input number1
    And user input number2
    And user choose divide equation
    When user divide number1 and number2
    Then the result should be 2

  Scenario: Multiple two numbers
    Given user input number1
    And user input number2
    And user choose multiple equation
    When user multiple number1 and number2
    Then the result should be 2