package org.ucll.demo.service;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by dickdijk on 01/11/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:org/ucll/demo/service/show_patient_details.feature"},
        format = {"html:target/cucumber", "json:target/cucumber.json"}
)
public class Runner {
}