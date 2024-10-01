Feature: Launch browser
  I want launch chrome
  And open workjam

  Scenario: Successful login
    Given Launch chrome
    When I enter Workjam 
    Then I should be redirected to Why Workjam

  