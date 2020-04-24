Feature: Login feature

@SanityTest
Scenario Outline: Test Invalid Login 
Given I am on Login Page
When title of login page contains Welcome
Then I will enter invalid "<uName>" and "<pwd>"
Then I Click on Login Button
Then I am on login page

Examples:
| uName | pwd |
| abcd |  |
|  | abcd |
|  |  |
| mercuryabcd | mercuryabcd |

@RegressionTest
Scenario Outline: Test Valid Login
Given I am on Login Page
When title of login page contains Welcome
Then I will enter valid "<userName>" and "<passWord>"
Then I Click on Login Button
Then I am on home page

Examples:
| userName | passWord |
| mercury | mercury |