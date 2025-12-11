
Feature: Login to app using Hooks


  Scenario: s11-login to app with valid credential
    When User Enter valid Username
    And User Enter Valid Password
    And User click on Login Button
    Then Home page should be visible


  Scenario: :s12-login to app with invalid credential
    When User Enter Invalid Username
    And User Enter Invalid Password
    And User click on Login Button
    Then Wrong page should be visible
