$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "It should be possible to search a car at the JLR Website, https://www.jaguar.co.uk/",
  "description": "",
  "id": "it-should-be-possible-to-search-a-car-at-the-jlr-website,-https://www.jaguar.co.uk/",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11063921263,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Discover E-PACE",
  "description": "",
  "id": "it-should-be-possible-to-search-a-car-at-the-jlr-website,-https://www.jaguar.co.uk/;discover-e-pace",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I want to find out the details of New E-PACE Cars Details",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I search for E-PACE",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be able to get the information about the JLR New E-PACE",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDefinition.prepareHomePage()"
});
formatter.result({
  "duration": 318760453,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "E-PACE",
      "offset": 13
    }
  ],
  "location": "SearchStepDefinition.search(String)"
});
formatter.result({
  "duration": 9148920505,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "E-PACE",
      "offset": 58
    }
  ],
  "location": "SearchStepDefinition.assertTheSearchResult(String)"
});
formatter.result({
  "duration": 5639580429,
  "status": "passed"
});
formatter.after({
  "duration": 310719680,
  "status": "passed"
});
});