Feature: Teasting of login functionality
@login
Scenario: Verifying the login functionality
Given invoke browser
When navigate into url "https://ops.dev.toucanus.net/#/"
Then verify vether userid and password fields are available 
And enter userid "bharath" and password "Bharath@123"
Then click on login
Then click on search
Then click on id
Then click on logout