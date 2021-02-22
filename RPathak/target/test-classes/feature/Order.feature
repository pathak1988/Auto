Feature: To Order T-shirt and verify in Order History(Website- Automation Practice)
 
Background:
Given user is on homepage
And user take screenshot
When user clicks on sign-in and navigates to Login page

Scenario Outline: User logs-in  as an authenticated user(already registered) and then user orders a t-shirt navigates through payment flow and validates orders
And user enters "<username>" and "<password>" and click login button
Then user can see the full "<Name>"
And user click T-Shirt link
And user hover on t-shirt and click add to basket
Then user clicks on Proceed to Checkout pop-up link
Then user clicks on proceed to checkout on order summary page
Then user checks deliver and billing add on address page and clicks proceed to checkout
And user clicks terms&conditions on shipping page and proceed checkout
Then user chooses "<Payment Type>" on payments page and clicks confirm order button
Then user should see order confirmation message "Your order on My Store is complete." on screen
Then user clicks on the account header and clicks on Order history
And user validates the order with order reference number
And user take screenshot
Then user logs out of the application



 Examples: 
    | username | password     | Name| Payment Type |
    | ravi.pathak0803@gmail.com | Automation@1234  | Ravi Pathak | bankwire |