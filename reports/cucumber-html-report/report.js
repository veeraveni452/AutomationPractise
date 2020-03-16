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
formatter.scenarioOutline({
  "line": 4,
  "name": "",
  "description": "login and logout into TestPractice",
  "id": "test-practice-website;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@TC01_TestPractice"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user open the TestPractice Home Page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user open the My Account Page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "the user login using \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on the login button user navigate to next page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click on the logout button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "test-practice-website;;",
  "rows": [
    {
      "cells": [
        "username",
        "",
        "password"
      ],
      "line": 14,
      "id": "test-practice-website;;;1"
    },
    {
      "cells": [
        "vmcube1@gmail.com",
        "",
        "REyansh123$"
      ],
      "line": 15,
      "id": "test-practice-website;;;2"
    },
    {
      "cells": [
        "vmcube2@gmail.com",
        "",
        "REyansh123$$"
      ],
      "line": 16,
      "id": "test-practice-website;;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "",
  "description": "login and logout into TestPractice",
  "id": "test-practice-website;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TestPractice"
    },
    {
      "line": 3,
      "name": "@TC01_TestPractice"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user open the TestPractice Home Page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user open the My Account Page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "the user login using vmcube1@gmail.com and REyansh123$",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on the login button user navigate to next page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click on the logout button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TestPractice_LoginAndLogout.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 7028821484,
  "status": "passed"
});
formatter.match({
  "location": "TestPractice_LoginAndLogout.the_user_open_the_TestPractice_Home_Page()"
});
formatter.result({
  "duration": 8804036339,
  "status": "passed"
});
formatter.match({
  "location": "TestPractice_LoginAndLogout.the_user_open_the_My_Account_Page()"
});
formatter.result({
  "duration": 9072117776,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vmcube1@gmail.com",
      "offset": 21
    },
    {
      "val": "REyansh123$",
      "offset": 43
    }
  ],
  "location": "TestPractice_LoginAndLogout.the_user_login_using_username_and_password(String,String)"
});
formatter.result({
  "duration": 853352805,
  "status": "passed"
});
formatter.match({
  "location": "TestPractice_LoginAndLogout.click_on_the_login_button_user_navgate_to_next_page()"
});
formatter.result({
  "duration": 6873828777,
  "status": "passed"
});
formatter.match({
  "location": "TestPractice_LoginAndLogout.click_on_the_logout_button()"
});
formatter.result({
  "duration": 8911591936,
  "status": "passed"
});
formatter.match({
  "location": "TestPractice_LoginAndLogout.close_the_browser()"
});
formatter.result({
  "duration": 2365147163,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "",
  "description": "login and logout into TestPractice",
  "id": "test-practice-website;;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TestPractice"
    },
    {
      "line": 3,
      "name": "@TC01_TestPractice"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user open the TestPractice Home Page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user open the My Account Page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "the user login using vmcube2@gmail.com and REyansh123$$",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on the login button user navigate to next page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "click on the logout button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TestPractice_LoginAndLogout.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 4483147768,
  "status": "passed"
});
formatter.match({
  "location": "TestPractice_LoginAndLogout.the_user_open_the_TestPractice_Home_Page()"
});
formatter.result({
  "duration": 7276880535,
  "status": "passed"
});
formatter.match({
  "location": "TestPractice_LoginAndLogout.the_user_open_the_My_Account_Page()"
});
formatter.result({
  "duration": 3190495165,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vmcube2@gmail.com",
      "offset": 21
    },
    {
      "val": "REyansh123$$",
      "offset": 43
    }
  ],
  "location": "TestPractice_LoginAndLogout.the_user_login_using_username_and_password(String,String)"
});
formatter.result({
  "duration": 1869042369,
  "status": "passed"
});
formatter.match({
  "location": "TestPractice_LoginAndLogout.click_on_the_login_button_user_navgate_to_next_page()"
});
formatter.result({
  "duration": 3170257202,
  "status": "passed"
});
formatter.match({
  "location": "TestPractice_LoginAndLogout.click_on_the_logout_button()"
});
formatter.result({
  "duration": 4127949825,
  "status": "passed"
});
formatter.match({
  "location": "TestPractice_LoginAndLogout.close_the_browser()"
});
formatter.result({
  "duration": 2334176756,
  "status": "passed"
});
});