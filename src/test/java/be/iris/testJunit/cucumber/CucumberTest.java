package be.iris.testJunit.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", 
		"json:JsonFile/cucumber.json", 
		"junit:JunitFile/cucumber.xml",
		"html:HtmlFile"},
snippets = SnippetType.CAMELCASE,
tags = {"@removed and @fast" })
public class CucumberTest {

}
