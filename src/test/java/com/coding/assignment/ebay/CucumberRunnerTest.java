package com.coding.assignment.ebay;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/*
 * specifying cucumber options
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {
                "pretty",
                "html:target/cucumber-html-report",
                "json:target/cucumber-json-report.json",
                "junit:target/cucumber-junit.xml"},
        tags = {"@ebaylogin"},
        features = {"src/test/resources/features"}
)
public class CucumberRunnerTest {
//This will run the stories identified by provided tag
}
