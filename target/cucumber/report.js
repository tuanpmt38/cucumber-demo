$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CreateAccount.feature");
formatter.feature({
  "name": "Create account",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "create new account by email",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the page create account",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters \"\u003cname\u003e\" and \"\u003cemail\u003e\" and \"\u003cphone\u003e\" and \"\u003cpassword\u003e\" and \"\u003cverifyPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user select checkbox gender",
  "keyword": "When "
});
formatter.step({
  "name": "user select country",
  "keyword": "When "
});
formatter.step({
  "name": "user select checkbox subscriptions",
  "keyword": "When "
});
formatter.step({
  "name": "user click submit",
  "keyword": "When "
});
formatter.step({
  "name": "gets confirmation",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "email",
        "phone",
        "password",
        "verifyPassword"
      ]
    },
    {
      "cells": [
        "cong nghiem",
        "nghiem@gmail.com",
        "0987776666",
        "12345687",
        "12345687"
      ]
    }
  ]
});
formatter.scenario({
  "name": "create new account by email",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the page create account",
  "keyword": "Given "
});
formatter.match({
  "location": "BDDCreateAccountTest.user_is_on_the_page_create_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"cong nghiem\" and \"nghiem@gmail.com\" and \"0987776666\" and \"12345687\" and \"12345687\"",
  "keyword": "When "
});
formatter.match({
  "location": "BDDCreateAccountTest.user_enters_and_and_and_and(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select checkbox gender",
  "keyword": "When "
});
formatter.match({
  "location": "BDDCreateAccountTest.user_select_checkbox_gender()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select country",
  "keyword": "When "
});
formatter.match({
  "location": "BDDCreateAccountTest.user_select_country()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select checkbox subscriptions",
  "keyword": "When "
});
formatter.match({
  "location": "BDDCreateAccountTest.user_select_checkbox_subscriptions()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click submit",
  "keyword": "When "
});
formatter.match({
  "location": "BDDCreateAccountTest.user_click_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "gets confirmation",
  "keyword": "Then "
});
formatter.match({
  "location": "BDDCreateAccountTest.gets_confirmation()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});