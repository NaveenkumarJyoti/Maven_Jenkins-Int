package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/GoogleSearch.feature",glue= {"StepDefinitions"},
monochrome = true,
plugin={"pretty","html:target/Destination"},
tags="@smoketest"
)


public class GoogleSearchRunner {

}


//junit:target/JunitReports/report2.xml",
//"json:target/JSONReports/report2.json",
//"html:target/HTMLreports2