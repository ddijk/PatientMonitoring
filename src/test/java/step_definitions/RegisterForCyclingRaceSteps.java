package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by dickdijk on 07/02/2017.
 */
public class RegisterForCyclingRaceSteps {

    List<String> startList = new ArrayList<>();

    @Given("^I have registered for Criterium Woerden as \"(.*?)\"")
    public void i_have_registered_for_Criterium_Woerden_as(String arg1) throws Throwable {
        startList.add(arg1);
    }


    @When("^I (?:request|get) the startlist$")
    public void i_request_the_startlist() throws Throwable {
    }

    @Then("^the name \"(Dick|Jens)\" should be on the list$")
    public void the_name_should_be_on_the_list(String arg1) throws Throwable {
        assertTrue(startList.contains(arg1));
    }
}
