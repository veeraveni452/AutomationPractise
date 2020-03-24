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
  "line": 140,
  "name": "",
  "description": "Register_WithoutEmail",
  "id": "test-practice-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 139,
      "name": "@TC14_TestPractice"
    }
  ]
});
formatter.step({
  "line": 142,
  "name": "launching chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 143,
  "name": "Home Page should open",
  "keyword": "When "
});
formatter.step({
  "line": 144,
  "name": "go to myaccount",
  "keyword": "Then "
});
formatter.step({
  "line": 145,
  "name": "leave mail id",
  "keyword": "Then "
});
formatter.step({
  "line": 146,
  "name": "enter the pass",
  "keyword": "Then "
});
formatter.step({
  "line": 147,
  "name": "click on register",
  "keyword": "Then "
});
formatter.step({
  "line": 148,
  "name": "close chrome app",
  "keyword": "Then "
});
formatter.match({
  "location": "Register_WithoutMail.launching_chrome_browser()"
});
formatter.result({
  "duration": 83505433564,
  "status": "passed"
});
formatter.match({
  "location": "Register_WithoutMail.Home_Page_should_opened()"
});
formatter.result({
  "duration": 196768865163,
  "status": "passed"
});
formatter.match({
  "location": "Register_WithoutMail.go_to_myaccount()"
});
formatter.result({
  "duration": 63922008245,
  "status": "passed"
});
formatter.match({
  "location": "Register_WithoutMail.enter_mail_id()"
});
formatter.result({
  "duration": 7032799903,
  "status": "passed"
});
formatter.match({
  "location": "Register_WithoutMail.enter_the_password()"
});
formatter.result({
  "duration": 3778210039,
  "status": "passed"
});
formatter.match({
  "location": "Register_WithoutMail.click_on_register()"
});
formatter.result({
  "duration": 23987331666,
  "status": "passed"
});
formatter.match({
  "location": "Register_WithoutMail.close_chrome_app()"
});
formatter.result({
  "duration": 18820712917,
  "status": "passed"
});
});