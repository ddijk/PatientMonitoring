/**
 * Created by dickdijk on 14/04/2017.
 */
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/cash_withdrawal.feature", glue = "step_definitions")
public class RunCukesTest { // NOSONAR SonarLint does not know about @RunWith(Cucumber.class)
}
