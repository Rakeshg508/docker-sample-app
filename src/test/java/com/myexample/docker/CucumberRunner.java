package com.myexample.docker;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(format = {"pretty", "html:cucumber/test-reports"}, //
    features = {"classpath:features"}, //
    tags = {"@IntegrationTest"}, //
    glue = {"com.myexample.docker"})

@RunWith(Cucumber.class)
public class CucumberRunner {

}
