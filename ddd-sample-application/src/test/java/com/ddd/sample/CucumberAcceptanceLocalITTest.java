package com.ddd.sample;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        plugin = {"pretty", "html:target/cucumber"},
        glue = {
                "com.ddd.sample"
        },
        features = "src/test/resources/com/ddd/sample",
        tags = "~@todo"
)
public class CucumberAcceptanceLocalITTest {
}
