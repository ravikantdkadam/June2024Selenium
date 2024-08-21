Feature: FreeCRM application Test 

Scenario: Create Contact page Test

Given user is on login page 
When user enter the username and password 
|rvkadam25@gmail.com|Ravikant@25|

And Click on login button 
Then user should on the homepage 
When user move and click on the contact tab 
Then user is on contact page 
Then Click on Create button 
Then Enter the following details and click on save Butto 
|Rivansh|Ravikant|kadam|riva235@gmail.com|



