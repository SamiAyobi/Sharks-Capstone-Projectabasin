@Laptop&NoteBooks
Feature: Laptop & NoteBooks 

Background: 
Given User is on Retail website one
When User click on Laptop &NoteBook tab
And User click on Show all Laptop & NoteBook option

@AddRemove
Scenario: Add and Remove a Mac book from Cart
Given User click on MacBook item
And User click add to Cart button
Then User should see a message one "Success: You have added MacBook to your shopping cart!"
And User should see "1 tem(s)-602.00" showed to the cart
And User click on cart option
And user click on red X button to remove the item from car
Then item should be removed and cart should show "0 item(s)"