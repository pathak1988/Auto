Feature: Update Personal Information 
 
Background:
Given user is on homepage
And user take screenshot
When user clicks on sign-in and navigates to Login page

Scenario Outline: Login as an authenticated user and navigates to Personal Information/MyAccount and updates the First name and confirms password and saves the record
And user enters "<username>" and "<password>" and click login button
#Then user can see the full "<Name>"
Then user clicks on My Personal Info link
Then user updates "<FirstName>" and confirms pass "<password>" and save the record
Then user should see sucess message "Your personal information has been successfully updated."
And user take screenshot
Then user logs out of the application

  
  
 Examples: 
    | username | password     | Name| FirstName |
    | ravi.pathak0803@gmail.com | Automation@1234  | Ravik Pathak | Ravi |