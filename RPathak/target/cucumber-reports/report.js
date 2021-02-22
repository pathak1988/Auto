$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/feature/UpdatePI.feature");
formatter.feature({
  "line": 1,
  "name": "Update Personal Information",
  "description": "",
  "id": "update-personal-information",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Login as an authenticated user and navigates to Personal Information/MyAccount and updates the First name and confirms password and saves the record",
  "description": "",
  "id": "update-personal-information;login-as-an-authenticated-user-and-navigates-to-personal-information/myaccount-and-updates-the-first-name-and-confirms-password-and-saves-the-record",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" and click login button",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 10,
      "value": "#Then user can see the full \"\u003cName\u003e\""
    }
  ],
  "line": 11,
  "name": "user clicks on My Personal Info link",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user updates \"\u003cFirstName\u003e\" and confirms pass \"\u003cpassword\u003e\" and save the record",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user should see sucess message \"Your personal information has been successfully updated.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user take screenshot",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user logs out of the application",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "update-personal-information;login-as-an-authenticated-user-and-navigates-to-personal-information/myaccount-and-updates-the-first-name-and-confirms-password-and-saves-the-record;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "Name",
        "FirstName"
      ],
      "line": 20,
      "id": "update-personal-information;login-as-an-authenticated-user-and-navigates-to-personal-information/myaccount-and-updates-the-first-name-and-confirms-password-and-saves-the-record;;1"
    },
    {
      "cells": [
        "ravi.pathak0803@gmail.com",
        "Automation@1234",
        "Ravik Pathak",
        "Ravi"
      ],
      "line": 21,
      "id": "update-personal-information;login-as-an-authenticated-user-and-navigates-to-personal-information/myaccount-and-updates-the-first-name-and-confirms-password-and-saves-the-record;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 11279398700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user take screenshot",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user clicks on sign-in and navigates to Login page",
  "keyword": "When "
});
formatter.match({
  "location": "StepsTest.user_is_on_homepage()"
});
formatter.result({
  "duration": 216457100,
  "status": "passed"
});
formatter.match({
  "location": "StepsTest.I_take_screenshot()"
});
formatter.result({
  "duration": 434262900,
  "status": "passed"
});
formatter.match({
  "location": "StepsTest.user_navigates_to_Login_page()"
});
formatter.result({
  "duration": 1924126700,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Login as an authenticated user and navigates to Personal Information/MyAccount and updates the First name and confirms password and saves the record",
  "description": "",
  "id": "update-personal-information;login-as-an-authenticated-user-and-navigates-to-personal-information/myaccount-and-updates-the-first-name-and-confirms-password-and-saves-the-record;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "user enters \"ravi.pathak0803@gmail.com\" and \"Automation@1234\" and click login button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 10,
      "value": "#Then user can see the full \"\u003cName\u003e\""
    }
  ],
  "line": 11,
  "name": "user clicks on My Personal Info link",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user updates \"Ravi\" and confirms pass \"Automation@1234\" and save the record",
  "matchedColumns": [
    1,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user should see sucess message \"Your personal information has been successfully updated.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user take screenshot",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user logs out of the application",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ravi.pathak0803@gmail.com",
      "offset": 13
    },
    {
      "val": "Automation@1234",
      "offset": 45
    }
  ],
  "location": "StepsTest.user_enters_username_and_password_click_login_button(String,String)"
});
formatter.result({
  "duration": 1539089300,
  "status": "passed"
});
formatter.match({
  "location": "StepsTest.user_clicks_Personal_Info()"
});
formatter.result({
  "duration": 1008297600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ravi",
      "offset": 14
    },
    {
      "val": "Automation@1234",
      "offset": 39
    }
  ],
  "location": "StepsTest.user_updates_first_name_verifies_password(String,String)"
});
formatter.result({
  "duration": 1027599600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your personal information has been successfully updated.",
      "offset": 32
    }
  ],
  "location": "StepsTest.user_see_sucess_message(String)"
});
formatter.result({
  "duration": 36969000,
  "status": "passed"
});
formatter.match({
  "location": "StepsTest.I_take_screenshot()"
});
formatter.result({
  "duration": 125231600,
  "status": "passed"
});
formatter.match({
  "location": "StepsTest.user_logs_out_application()"
});
formatter.result({
  "duration": 1748412900,
  "status": "passed"
});
formatter.after({
  "duration": 5103162700,
  "status": "passed"
});
});