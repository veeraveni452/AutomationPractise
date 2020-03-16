$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/main/resources/feature/Testcase.feature");
formatter.feature({
  "line": 2,
  "name": "Test Practice Website",
  "description": "",
  "id": "test-practice-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TestPractice"
    }
  ]
});
formatter.scenario({
  "line": 56,
  "name": "",
  "description": "",
  "id": "test-practice-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 55,
      "name": "@TC06_TestPractice"
    }
  ]
});
formatter.step({
  "line": 57,
  "name": "the user1 launches chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 58,
  "name": "the user1 opens TestPractice Home Page",
  "keyword": "When "
});
formatter.step({
  "line": 59,
  "name": "the user1 open My Account Page",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "the user1 try to login using username and without password",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "click on the login button1",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "application will show an error msg",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "close the browser5",
  "keyword": "Then "
});
formatter.match({
  "location": "WithoutPasswordTest.the_user1_launches_chrome_application()"
});
formatter.result({
  "duration": 6578934102,
  "status": "passed"
});
formatter.match({
  "location": "WithoutPasswordTest.the_user1_opens_TestPractice_Home_Page()"
});
formatter.result({
  "duration": 8164427890,
  "status": "passed"
});
formatter.match({
  "location": "WithoutPasswordTest.the_user1_open_My_Account_Page()"
});
formatter.result({
  "duration": 2789052056,
  "status": "passed"
});
formatter.match({
  "location": "WithoutPasswordTest.the_user1_try_to_login_using_username_and_without_password()"
});
formatter.result({
  "duration": 895753332,
  "status": "passed"
});
formatter.match({
  "location": "WithoutPasswordTest.click_on_the_login_button1()"
});
formatter.result({
  "duration": 2212546708,
  "status": "passed"
});
formatter.match({
  "location": "WithoutPasswordTest.application_will_show_an_error_msg()"
});
formatter.result({
  "duration": 1365126251,
  "status": "passed"
});
formatter.match({
  "location": "WithoutPasswordTest.close_the_browser5()"
});
formatter.result({
  "duration": 2101596635,
  "status": "passed"
});
});