@simple-app @android
Feature: Login

  @positive
  Scenario: Verify user successfully login when input valid user data
    Given User is on login page
    When User input username "admin"
    And User input password "admin"
    And User click button sign in
    Then User successfully log in

  @negative
  Scenario: Verify user failed to login when input invalid user data
    Given User is on login page
    When User input username "invalid"
    And User input password "invalid"
    And User click button sign in
