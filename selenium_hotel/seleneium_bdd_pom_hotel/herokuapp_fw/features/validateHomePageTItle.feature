Feature: test the label change of the red button

  Scenario: Verify the lable
    Given application is loaded
    And firstname field lable is displayed
    And surname field lable is displayed
    And price field lable is displayed
    And deposit field lable is displayed
    And Checkin field lable is displayed
    Then Checkout field lable is displayed

