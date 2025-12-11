Feature: Login to App using Background keyword feature

  Background:
      Given user is on login page
      When User Enter valid Username

      Scenario: s4-Login to App using valid credential
        And User Enter Valid Password
        And User click on Login Button
        Then Home page should be visible

        Scenario: s5-Login to APP using Invalid credential
          And User Enter Invalid Password
          And user click on Login button
          Then Wrong page should be visible
