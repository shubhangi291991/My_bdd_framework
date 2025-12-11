@regression
Feature: Login to app using tag

  @sanity
  Scenario: s1-login to app with valid credential
    When User Enter valid Username
    And User Enter Valid Password
    And User click on Login Button
    Then Home page should be visible

    @smoke
    Scenario: :s2-login to app with invalid credential
      When User Enter Invalid Username
      And User Enter Invalid Password
      And User click on Login Button
      Then Wrong page should be visible


      @sanity
      Scenario: s3-login to app using test dada
        When user enter username as "dhiraj"
        And user enter password as "dhiraj@123"
        And user enter valid pin as 5678
        And user click on Login button
        Then user should be on home page with display "dhiraj@1234"

        @performane
        Scenario: s3-login to app using test dada
          When user enter username as "dhriti"
          And user enter password as "dhriti@123"
          And user enter valid pin as 2345
          And user click on Login button
          Then user should be on home page with display "dhriti@1234"


