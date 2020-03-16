@TestPractice
Feature: Test Practice Website
@TC01_TestPractice
Scenario Outline:
login and logout into TestPractice
Given the user launch the chrome application
When the user open the TestPractice Home Page
Then the user open the My Account Page
Then the user login using <username> and <password>
Then click on the login button user navigate to next page
Then click on the logout button
Then close the browser
Examples:
|username||password|
|vmcube1@gmail.com||REyansh123$|
|vmcube2@gmail.com||REyansh123$$|
@TC02_TestPractice
Scenario:
login to TestPractice
Given the user1 launch the chrome application
When the user1 open the TestPractice Home Page
Then the user1 open the My Account Page
Then the user1 login using username and password
Then click on the login button user1 navigate to next page
Then close the browser1
@TC03_TestPractice
Scenario:
shop android
Given the user1 has to launch the chrome application
When the user1 opens the TestPractice Home Page
Then the user1 opens the My Account Page
Then the user1 logins using username and password
Then click on the login button then user1 navigate to next page
Then the user1 open the Shop page
Then the user1 click on the android
Then the user1 click on the android mobile
Then the user1 check stock is available or not
Then close the browser2
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
Then close the browser3
@TC05_TestPractice
Scenario:
Given the user1 launches the chrome application
When the user1 open TestPractice Home Page
Then the user1 opens My Account Page
Then the user1 try to login using incorrect username and password
Then click on the login button 
Then application shows an error msg
Then close the browser4
@TC06_TestPractice
Scenario:
Given the user1 launches chrome application
When the user1 opens TestPractice Home Page
Then the user1 open My Account Page
Then the user1 try to login using username and without password
Then click on the login button1         
Then application will show an error msg
Then close the browser5
@TC07_TestPractice
Scenario:
Given the user launches chrome application
When the user opens TestPractice Home Page
Then the user open My Account Page
Then the user try to login using valid password and empty username
Then click on the login button2 
Then application will show an error message
Then close the browser6




