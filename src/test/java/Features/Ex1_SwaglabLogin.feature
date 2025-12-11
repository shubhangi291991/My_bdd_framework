Feature: swag lab login with valid creadential
  
  Scenario: S1-Swaglab website Login with valid credential
    
    Given user is on swagLablogin page
    When User Enter valid Swaglab Username as "Username"
    And wait for 1 second
    And user enter valid swaglab password  as "Password"
    And wait for 1 second
    And user click on swaglab login button
    And wait for 1 second
    Then swaglab page should be visible with test "Swag Labs"


  Scenario: S2-Swaglab website Login with Invalid credential

    Given user is on swagLablogin page
    When User Enter valid Swaglab Username as "Username"
    And wait for 1 second
    And user enter invalid swaglab password  as "Invalidpassword"
    And wait for 1 second
    And user click on swaglab login button
    And wait for 1 second
    Then login failed error message
