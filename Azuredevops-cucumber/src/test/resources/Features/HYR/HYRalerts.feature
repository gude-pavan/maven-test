#Author: Pavan kumar
#Version : V 1.0
#Features testing: Test HYR tutorial's alert page behaviour
@Iframe @HYR_Iframe_page @HYR_test
Feature: Feature to Test HYR tutorial's alert page behaviour

  Background: 
    Given Open the chrome browser

  Scenario Outline: Test the Test HYR tutorials alert page behaviour
    When Navigate to HYR tutorials alert page
    And click on click me button and do provided action <box name> and <action>
    Then validate the text in popup box output <Action output text>

    Examples: 
      | box name   | action | Action output text                           |
      | alertBox   | Accept | You selected alert popup                     |
      | confirmBox | Accept | You pressed OK in confirmation popup         |
      | confirmBox | Reject | You pressed Cancel in confirmation popup     |
      | promptBox  | Accept | You entered text Pavan Kumar in propmt popup |
      | promptBox  | Reject | You pressed Cancel in prompt popup.          |
