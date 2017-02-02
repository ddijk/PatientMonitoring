package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberbook.Checkout;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CheckoutSteps {
    private Checkout checkout = new Checkout();

    private Map<String, Integer> assortiment = new HashMap<>();

    @Given("^the price of a \"(.*?)\" is (\\d+)c$")
    public void the_price_of_a_is_c(String productName, int pricePerItem) throws Throwable {
        assortiment.put(productName, pricePerItem);
    }

    @When("^I checkout (\\d+) \"(.*?)\"$")
    public void i_checkout(int count, String productName) throws Throwable {
        checkout.add(productName, count);
    }

    @Then("^the total price should be (\\d+)c$")
    public void the_total_price_should_be(int expectedResult) throws Throwable {


      int total =   checkout.getContents().entrySet().stream().map(entry->assortiment.get(entry.getKey()) * entry.getValue()).mapToInt(i->i).sum();

      assertEquals(expectedResult, total);
    }

}
