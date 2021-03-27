$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Desktops.feature");
formatter.feature({
  "line": 1,
  "name": "Desktops",
  "description": "",
  "id": "desktops",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2603462246,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User verify all items are present in Desktops tab",
  "description": "",
  "id": "desktops;user-verify-all-items-are-present-in-desktops-tab",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Desktop"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on Desktops tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on Show all desktops",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should see all items are present in Desktop page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 2868674072,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsStepDefiniation.user_click_on_Desktops_tab()"
});
formatter.result({
  "duration": 851759172,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsStepDefiniation.user_click_on_Show_all_desktops()"
});
formatter.result({
  "duration": 1367837471,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsStepDefiniation.user_should_see_all_items_are_present_in_Desktop_page()"
});
formatter.result({
  "duration": 3605338642,
  "status": "passed"
});
formatter.after({
  "duration": 169927084,
  "status": "passed"
});
});