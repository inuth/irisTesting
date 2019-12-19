$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:be/iris/testJunit/cucumber/features/is_it_Friday_yet.feature");
formatter.feature({
  "name": "Is it Friday yet",
  "description": "  I want to ask if it is Friday yet",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@removed"
    }
  ]
});
formatter.scenario({
  "name": "It is Friday",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@removed"
    },
    {
      "name": "@fast"
    }
  ]
});
formatter.step({
  "name": "today is \"Friday\"",
  "keyword": "Given "
});
formatter.match({
  "location": "IsItFridayYetSteps.todayIs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I ask if it is Friday",
  "keyword": "When "
});
formatter.match({
  "location": "IsItFridayYetSteps.i_ask_if_it_is_Friday()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get a YES",
  "keyword": "Then "
});
formatter.match({
  "location": "IsItFridayYetSteps.i_get_a_YES(String)"
});
formatter.result({
  "status": "passed"
});
});