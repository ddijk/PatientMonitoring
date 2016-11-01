package org.ucll.demo.service;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by dickdijk on 25/06/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/org/ucll/demo/service/ShowPatientDetails.feature"},
        format = {"html:target/cucumber", "json:target/cucumber.json"}
)
public class ShowPatientDetailsTest {
}
