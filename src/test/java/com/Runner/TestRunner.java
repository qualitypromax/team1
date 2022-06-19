package com.Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"StepDefinitions"},plugin= {"pretty", "html:target/SwagLabsReports.html", "junit:target/SwagLabsReports.xml"})
public class TestRunner {
}
