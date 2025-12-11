Feature: Login to application feature

  Scenario:S1-login with valid creadiential

    Given user is on login page
    When User Enter valid Username
    And User Enter Valid Password
    And User click on Login Button
    Then Home page should be visible

    Scenario:S2-Login with invalid creadential

      Given user is on login page
      When User Enter Invalid Username
      And User Enter Invalid Password
      And User click on Login Button
      Then Wrong page should be visible
