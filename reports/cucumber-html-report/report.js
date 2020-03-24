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
  "line": 160,
  "name": "",
  "description": "Register_WithoutPassword",
  "id": "test-practice-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 159,
      "name": "@TC16_TestPractice"
    }
  ]
});
formatter.step({
  "line": 162,
  "name": "launching the chromeBrowser",
  "keyword": "Given "
});
formatter.step({
  "line": 163,
  "name": "open home page",
  "keyword": "When "
});
formatter.step({
  "line": 164,
  "name": "click on myaccountpage",
  "keyword": "Then "
});
formatter.step({
  "line": 165,
  "name": "enter the mailid",
  "keyword": "Then "
});
formatter.step({
  "line": 166,
  "name": "leave the password",
  "keyword": "Then "
});
formatter.step({
  "line": 167,
  "name": "click the register button",
  "keyword": "Then "
});
formatter.step({
  "line": 168,
  "name": "close the chromeApplication",
  "keyword": "Then "
});
formatter.match({
  "location": "Register_WithoutPassword.launching_the_chromeBrowser()"
});
formatter.result({
  "duration": 26536407447,
  "status": "passed"
});
formatter.match({
  "location": "Register_WithoutPassword.open_home_page()"
});
formatter.result({
  "duration": 121478632829,
  "status": "passed"
});
formatter.match({
  "location": "Register_WithoutPassword.click_on_myaccountpage()"
});
formatter.result({
  "duration": 38716679844,
  "status": "passed"
});
formatter.match({
  "location": "Register_WithoutPassword.enter_the_mailid()"
});
formatter.result({
  "duration": 2769766194,
  "status": "passed"
});
formatter.match({
  "location": "Register_WithoutPassword.leave_the_password()"
});
formatter.result({
  "duration": 157829637,
  "status": "passed"
});
formatter.match({
  "location": "Register_WithoutPassword.click_the_register_button()"
});
formatter.result({
  "duration": 12060101638,
  "status": "passed"
});
formatter.match({
  "location": "Register_WithoutPassword.close_the_chromeApplication()"
});
formatter.result({
  "duration": 7474789974,
  "status": "passed"
});
});