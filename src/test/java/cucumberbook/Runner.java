package cucumberbook;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features/checkout.feature"},
        format = {"html:target/cucumber", "json:target/cucumber.json"}
)
public class Runner {
}
