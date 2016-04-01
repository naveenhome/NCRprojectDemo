Feature: Checkout
In order to calculate price of groceries
As a Store Staff
I should be able to calculate price for groceries during checkout

Scenario: Checkout a banana
Given The price of a "Banana" is $5
When I checkout 1 "Banana"
Then the total price should be $5

Scenario: Checkout a banana and a apple
Given The price of a "Banana" is $5
And The price for a "Apple" is $2
When I checkout 1 "Banana"
And Also 1 "Apple"
Then the total price should be $7
