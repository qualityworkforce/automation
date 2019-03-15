package com.ff.psa;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/accounts" , glue="src/test/java/steps",tags={"@smoke"})
public class TestRunner {

}