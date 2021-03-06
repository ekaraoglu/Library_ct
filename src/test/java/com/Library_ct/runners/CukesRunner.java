package com.Library_ct.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features", // Content root
        glue = "com/Library_ct/step_definitions", // Source root
        dryRun = false,
        tags = " @scenario_wip"

)

        public class CukesRunner {
        // comment 2
}
