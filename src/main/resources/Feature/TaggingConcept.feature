Feature: Free CRM Test

// Tagging to each scenario
 
@SmokeTest   
Scenario: User login with valid credentials 
Given user login Test with valid credentials 

@RegressionTest
Scenario: User login with invalid credentials 
Given user login Test with invalid credentials 


@SmokeTest @RegressionTest
Scenario: User create contact Test 
Given user create contact

@End2End
Scenario: User create Deals Test 
Given user create Deals

@SmokeTest
Scenario: User create Task Test 
Given user create Task 

@End2End @RegressionTest
Scenario: User create Case Test 
Given user create Case 

@End2End
Scenario: User create Document Test 
Given user create Document 

@RegressionTest
Scenario: User create Companies Test 
Given user create Companies  
 