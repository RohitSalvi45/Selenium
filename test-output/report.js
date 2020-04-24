$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/main/java/Feature/demo.feature");
formatter.feature({
  "line": 1,
  "name": "Test Invalid and Valid login",
  "description": "",
  "id": "test-invalid-and-valid-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Test invalid Login",
  "description": "",
  "id": "test-invalid-and-valid-login;test-invalid-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "title of login page is Welcome",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I will enter invalidone \"\u003cuName\u003e\" and \"\u003cpwd\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I click on Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I am in Home Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "test-invalid-and-valid-login;test-invalid-login;",
  "rows": [
    {
      "cells": [
        "uName",
        "pwd"
      ],
      "line": 10,
      "id": "test-invalid-and-valid-login;test-invalid-login;;1"
    },
    {
      "cells": [
        "abcd",
        ""
      ],
      "line": 11,
      "id": "test-invalid-and-valid-login;test-invalid-login;;2"
    },
    {
      "cells": [
        "",
        "abcd"
      ],
      "line": 12,
      "id": "test-invalid-and-valid-login;test-invalid-login;;3"
    },
    {
      "cells": [
        "",
        ""
      ],
      "line": 13,
      "id": "test-invalid-and-valid-login;test-invalid-login;;4"
    },
    {
      "cells": [
        "mercuryabcd",
        "mercuryabcd"
      ],
      "line": 14,
      "id": "test-invalid-and-valid-login;test-invalid-login;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 21878678200,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Test invalid Login",
  "description": "",
  "id": "test-invalid-and-valid-login;test-invalid-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "title of login page is Welcome",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I will enter invalidone \"abcd\" and \"\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I click on Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I am in Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginPage.title_of_login_page_is_Welcome()"
});
formatter.result({
  "duration": 5122686500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd",
      "offset": 25
    },
    {
      "val": "",
      "offset": 36
    }
  ],
  "location": "loginPage.i_will_enter_invalidone_and(String,String)"
});
formatter.result({
  "duration": 150685100,
  "status": "passed"
});
formatter.match({
  "location": "loginPage.i_click_on_Login_Button()"
});
formatter.result({
  "duration": 38280500,
  "status": "passed"
});
formatter.match({
  "location": "loginPage.i_am_in_Home_Page()"
});
formatter.result({
  "duration": 32126000,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d80.0.3987.163)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027M5-D-2N1CG13\u0027, ip: \u002710.0.0.4\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.163, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\ROHITM~1.SAL\\AppDa...}, goog:chromeOptions: {debuggerAddress: localhost:53624}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 3b01317963925211a77f6a5584ac55b3\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getTitle(RemoteWebDriver.java:281)\r\n\tat stepDefinition.loginPage.i_am_in_Home_Page(loginPage.java:64)\r\n\tat ✽.Then I am in Home Page(./src/main/java/Feature/demo.feature:7)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1103761800,
  "status": "passed"
});
