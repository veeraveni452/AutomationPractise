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
  "line": 130,
  "name": "",
  "description": "Alert with OK",
  "id": "test-practice-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 129,
      "name": "@TC13_TestPractice"
    }
  ]
});
formatter.step({
  "line": 132,
  "name": "launch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 133,
  "name": "Home Page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 134,
  "name": "go to DemoSite",
  "keyword": "Then "
});
formatter.step({
  "line": 135,
  "name": "SwithTo alerts",
  "keyword": "Then "
});
formatter.step({
  "line": 136,
  "name": "click the button to display alert Msg",
  "keyword": "Then "
});
formatter.step({
  "line": 137,
  "name": "close chrome application",
  "keyword": "Then "
});
formatter.match({
  "location": "AlertOk_Test.lauch_chrome_browser()"
});
formatter.result({
  "duration": 10039821972,
  "status": "passed"
});
formatter.match({
  "location": "AlertOk_Test.Home_Page_is_opened()"
});
formatter.result({
  "duration": 98711737250,
  "status": "passed"
});
formatter.match({
  "location": "AlertOk_Test.go_to_DemoSite()"
});
formatter.result({
  "duration": 6381438971,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d80.0.3987.132)\nBuild info: version: \u00273.7.0\u0027, revision: \u00272321c73\u0027, time: \u00272017-11-02T22:22:35.584Z\u0027\nSystem info: host: \u0027BLT1036\u0027, ip: \u0027192.168.1.36\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.132, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\BLTUSE~1.BLT\\AppDa...}, goog:chromeOptions: {debuggerAddress: localhost:49228}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: a9b33429ec2f4307b7afa923f4134225\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"menu-item-251\"]/a}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:472)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\r\n\tat com.pages.AlertOk_Page.clickDemoSite(AlertOk_Page.java:21)\r\n\tat com.StepDefinition.AlertOk_Test.go_to_DemoSite(AlertOk_Test.java:28)\r\n\tat ✽.Then go to DemoSite(./src/main/resources/feature/Testcase.feature:134)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AlertOk_Test.SwithTo_alerts()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AlertOk_Test.click_the_button_to_display_alert_Msg()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AlertOk_Test.close_chrome_application()"
});
formatter.result({
  "status": "skipped"
});
});