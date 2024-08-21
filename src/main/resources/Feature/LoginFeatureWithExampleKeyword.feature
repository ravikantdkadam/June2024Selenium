Feature:  Amazon application feature Test


Scenario Outline: To validte the login functionality


Given User is alrady on login page 

When Title of page is Amazon Sign In

When Enter the email or mobile phone number "<username>"

And click on continue button 

When Enter the password "<Password>"

And Click on signin button

Then user able to login successful 

And Close the browser 

# Examples keyword always used with Scenario Outline

Examples: 

|username|Password|
|9975674668|Rivansh@2019|
|8329318994|Ravikant@123|
|rvkkadam@gmai|Vishwa@123|








 
