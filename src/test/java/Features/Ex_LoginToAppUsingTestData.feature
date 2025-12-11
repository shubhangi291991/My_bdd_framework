Feature: Login to app using test data
  Scenario: S3-Login to app using test data

    Given user is on login page
    When user enter username as "shubhangi"
    And user enter password as "abc@123"
    And user enter valid pin as 1234
    And user click on Login button
    Then user should be on home page with display "shubhangi1234"