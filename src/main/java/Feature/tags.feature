Feature: Login feature

@SmokeTest
Scenario: Check Valid login
Given Valid Login

@RegressionTest
Scenario: Check Invalid login
Given Invalid Login

@SanityTest
Scenario: User Registration
Given New User

@RegressionTest @SanityTest
Scenario: Edit User
Given Edit User

@SmokeTest @SanityTest
Scenario: Delete User
Given Deleting User

@End2EndTest
Scenario: Add Employee
Given New Employee

@SmokeTest
Scenario: Edit Employee
Given Editing Employee

@RegressionTest @End2EndTest
Scenario: Delete Employee
Given Deleting Employee

@RegressionTest
Scenario: Add Department
Given New Department

@SanityTest
Scenario: Edit Department
Given Editing Department

@End2EndTest
Scenario: Delete Department
Given Deleting Department

@RegressionTest
Scenario: Add Account
Given Adding Account 

@SanityTest
Scenario: Edit Account
Given Editing Account

@SmokeTest
Scenario: Delete Account
Given Deleting Account
