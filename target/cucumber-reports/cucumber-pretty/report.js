$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Laptop\u0026Notebook.feature");
formatter.feature({
  "line": 1,
  "name": "Laptop\u0026 NoteBooks",
  "description": "",
  "id": "laptop\u0026-notebooks",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3351636197,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": "laptop\u0026-notebooks;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@laptop\u0026Notbook"
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
  "name": "User click on Laptop \u0026NoteBooktab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on Show all Laptop \u0026NoteBookoption",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User click on MacBook  item",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click add to Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should see a message ‘Success: You have added MacBook to your shopping cart!’",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User should see ‘1tem(s)-602.00’showed to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click on cart option",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user click on red X button to remove the item from cart",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "item should be removed and cartshould show ‘0 item(s)’",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 2982972221,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "DesktopsStepDefiniation.user_click_add_to_Cart_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 188488685,
  "status": "passed"
});
});