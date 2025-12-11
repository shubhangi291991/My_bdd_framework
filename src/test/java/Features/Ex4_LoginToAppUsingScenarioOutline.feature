Feature: Login to app using scenario outline

  Scenario Outline: Login to app using diffrent test data
    When user enter valid username as "<UN>"
    And user enter valid password as "<PSW>"
    And user enter valid pincode as <PIN>
    And user click on Login button
    Then home page should be visible with logo test "abcxyz"

    Examples:
    |UN|PSW|PIN|
    |abc|abc@gmail.com|123|
    |xyz|xyz@gmail.com|456|
    |pqr|Pqr@gmail.com|768|