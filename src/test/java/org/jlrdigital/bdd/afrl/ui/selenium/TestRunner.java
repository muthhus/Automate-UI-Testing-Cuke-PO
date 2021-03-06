package org.jlrdigital.bdd.afrl.ui.selenium;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/resources/cucumber"
        },
        snippets = SnippetType.CAMELCASE, plugin = {"pretty", "html:out"}
)
public class TestRunner {

}
