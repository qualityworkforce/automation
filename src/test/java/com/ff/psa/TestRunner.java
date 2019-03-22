package com.ff.psa;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features" ,
        glue="steps",
        tags={"@dataset"},
        plugin ={"pretty","html:target/reports" })
public class TestRunner {

}