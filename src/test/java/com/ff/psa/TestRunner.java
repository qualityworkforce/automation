package com.ff.psa;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features" ,
        glue= "com/ff/psa/steps",
        tags={"@smoke,@registration,@login"},
        plugin ={"pretty","html:target/reports" })
public class TestRunner {

}