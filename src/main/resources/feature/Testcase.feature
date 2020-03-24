@TestPractice
Feature: Test Practice Website
@TC01_TestPractice
Scenario Outline:
LoginAndLogout_Test
Given the user launch the chrome application
When the user open the TestPractice Home Page
Then the user open the My Account Page
Then the user login using <username> and <password>
Then click on the login button user navigate to next page
Then click on the logout button
Then closing the browser
Examples:
|username||password|
|vmcube1@gmail.com||REyansh123$|
|vmcube2@gmail.com||REyansh123$$|
@TC02_TestPractice
Scenario:
Login_Test
Given the user1 launch the chrome application
When the user1 open the TestPractice Home Page
Then the user1 open the My Account Page
Then the user1 login using username and password
Then click on the login button user1 navigate to next page
Then closes the browser1
@TC03_TestPractice
Scenario:
Shop_android
Given the user1 has to launch the chrome application
When the user1 opens the TestPractice Home Page
Then the user1 opens the My Account Page
Then the user1 logins using username and password
Then click on the login button then user1 navigate to next page
Then the user1 open the Shop page
Then the user1 click on the android
Then the user1 click on the android mobile
Then the user1 check stock is available or not
Then it will close the browser2
@TC04_TestPractice
Scenario:
shop HTML
Given first user1 has to launch the chrome application
When the user1 opened the TestPractice Home Page
Then the user1 opened the My Account Page
Then the user1 logined using username and password
Then click on the login button user1 navigates to next page
Then the user1 click the Shop page
Then the user1 click on the HTML and Add to Basket
Then browser should be closed
@TC05_TestPractice
Scenario:
Incorrect Password
Given the user1 launches the chrome application
When the user1 open TestPractice Home Page
Then the user1 opens My Account Page
Then the user1 try to login using incorrect username and password
Then click on the login button 
Then application shows an error msg
Then chrome browser should be closed.
@TC06_TestPractice
Scenario:
Without Password
Given the user1 launches chrome application
When the user1 opens TestPractice Home Page
Then the user1 open My Account Page
Then the user1 try to login using username and without password
Then click on the login button1         
Then application will show an error msg
Then the opened chrome browser will be closed
@TC07_TestPractice
Scenario:
Empty username
Given the user launches chrome application
When the user opens TestPractice Home Page
Then the user open My Account Page
Then the user try to login using valid password and empty username
Then click on the login button2 
Then application will show an error message
Then closed the browser6
@TC08_TestPractice
Scenario:
Coupon code
Given the user first launches chrome application
When the user first opens TestPractice Home Page
Then the user opens My Account Page
Then the user tries to login using valid password and username
Then click on the login button3
Then goto shop page
Then click on the javascript
Then select functional JS and click on add to basket
Then click on view basket
Then add coupon code
Then click on apply coupon code
Then close the exsisting browser7
@TC09_TestPractice
Scenario:
Rating and Review
Given the user first launched the chrome application
When the user first opened TestPractice Home Page
Then click on the Selenium WebDriver Recepies in Ruby
Then click on the reviews
Then click on rating
Then enter your review
Then close the opened browser8
@TC10_TestPractice
Scenario:
Availability Check
Given the user first launch the chrome application
When the user then open TestPractice Home Page
Then click on the Thinking in HTML
Then check the availability of stock
Then close this browser9
@TC11_TestPractice
Scenario:
Sort low to high
Given the 1stuser first launch the chrome application
When the 1stuser then open TestPractice Home Page
Then clicks on the shop page
Then sort the products from low to high
Then close the chrome browser
@TC12_TestPractice
Scenario:
Subscription
Given launch the chrome browser
When TestPractice Home Page is opened
Then enter the email in subscription
Then click on subscribe
Then close the chrome application
@TC13_TestPractice
Scenario:
Register_Invalid_Email
Given launch chrome browser
When Home Page is opened
Then go to myaccount page
Then enter mail id
Then enter password
Then click register
Then close chrome application
@TC14_TestPractice
Scenario:
Register_WithoutEmail
Given launching chrome browser
When Home Page should open
Then go to myaccount
Then leave mail id
Then enter the pass
Then click on register
Then close chrome app




