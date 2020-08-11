Feature: Flipkart Application Test

Scenario: Validate User on flipkart Page 

Given user opens the browser
When user enters url 
Then user closes the popup
Then validate user on home page

Scenario: Validate user is on Buy Mobiles Page
Given user search mobile product 
Then validate user is on mobiles page

Scenario: Validate user able to select specified ram
Given user selects specified ram type
Then validate ram selection 

Scenario: Validate user able to select specified brand
Given user selects specified brand type
Then validate brand selection 

Scenario: Validate user able to select specified mobile name
Given user selects specified mobile name
Then validate mobile name selection 

Scenario: Validate user able to select compare product brand 
Given user selects compare brand selection 
Then validate compare brand selection 

Scenario: Validate user able to select compare product mobile name
Given user selects compare mobile name selection 
Then validate compare mobile name selection









