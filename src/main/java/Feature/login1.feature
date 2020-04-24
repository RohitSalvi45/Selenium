Feature: Login feature

Scenario Outline: Login Test scenario
Given I am on Login Page
When title of login page contains Welcome
Then I will enter "<uName>" and "<pwd>"
Then I Click on Login Button
Then I am on home page

Examples:
| uName | pwd |
| mercury | mercury |
| abcd | abcd |