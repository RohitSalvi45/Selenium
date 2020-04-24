Feature: Test Invalid and Valid login

Scenario Outline: Test invalid Login
When title of login page is Welcome
Then I will enter invalidone "<uName>" and "<pwd>"
Then I click on Login Button
Then I am in Home Page

Examples:
| uName | pwd |
| abcd |  |
|  | abcd |
|  |  |
| mercuryabcd | mercuryabcd |


Scenario Outline: Test valid Login
When title of login page is Welcome
Then I will enter validone "<userName>" and "<passWord>"
Then I click on Login Button
Then I am in Login Page

Examples:
| userName | passWord |
| mercury | mercury |