#Author: Pavan kumar
#Version : V 1.0
#Features testing: login Feature BDD testing

@smokefeature @login_check @Swaglabs
Feature: Feature to test Login functionality
Background: 
    Given Open the chrome browser
    And User is on login Page

  @login_check_success
  Scenario Outline: Check login is successfull with Valid Credentials
    When User enters <username> and <password>
    And Clicks on Login button
    Then Browser navigates to login home page

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | visual_user             | secret_sauce2 |

  @login_check_failure
  Scenario Outline: Check login is successfull with invalid Credentials
    When User enters <username> and <password>
    And Clicks on Login button
    Then Browser displays error message

    Examples: 
      | username                 | password      |
      | standard_user            | secret_sauce2 |
      | performance_glitch_user2 | secret_sauce  |
      
      
  @login_check_locked_user
  Scenario Outline: Check login is successfull with locked user Credentials
    When User enters <username> and <password>
    And Clicks on Login button
    Then Browser displays locked user error message
    Examples: 
      | username                 | password      |
      | locked_out_user          | secret_sauce  |
      
    
    
      
      