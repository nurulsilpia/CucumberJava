package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue={"StepDefinitions"}, monochrome = true, 
plugin = {"pretty","html:target/HtmlReports.html"}
//plugin = {"pretty", "json:target/JSONReports.json"}
//plugin = {"pretty", "junit:target/JUNITReports/report.xml"}
//tags="@smokeTest" -> ini buat filter step mana yg mau di report
)

public class TestRunner {

}
