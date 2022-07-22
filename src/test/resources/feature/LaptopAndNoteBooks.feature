@LaptopAndNoteBooks
Feature: Laptop & NoteBooks 

Background:
Given User is on Retail website 
When User click on Laptop &NoteBook tab 
And User click on Show all Laptop &NoteBook option 

@ProductComparison
Scenario: Product Comparison 
And User click on product comparison icon on ‘MacBook’ 
And User click on product comparison icon on ‘MacBook Air 
Then User should see a message 'Success: You have added MacBook Air to your product comparison!' 
And User click on Product comparison link 
Then User should see Product Comparison Chart 

@AddingItemToWhishList
Scenario: Adding an item to Wish list 
And User click on heart icon to add 'Sony VaIO' laptop to wish list 
Then User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’ 

@ValidatePrice
Scenario: Validate the price of MacBook Pro is '2000' 
And User click on ‘MacBook Pro’ item 
Then User should see '$2,000.00' price tag is present on UI. 


