package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/FeatureWithTags",
glue={"StepDefinitions"},
tags="@regression and not @important"
)

public class TestRunner_RunWithSingleTag {

}
