#Author: Pavan kumar
#Version : V 1.0
#Features testing: Test HYR tutorials Iframes behaviour
@Alert_handling @HYR_alert_page @HYR_test
Feature: Feature to Test HYR tutorials Iframes behaviour

  Background: 
    Given Open the chrome browser

  Scenario: Test the Test HYR tutorials Iframes behaviour
    When Navigate to HYR tutorials Iframes page
    And Select home page in Frame1 and validate it
    And Select Contact page in Frame2 and validate it
    And Select home page and Contact page in Frame3 and validate it
