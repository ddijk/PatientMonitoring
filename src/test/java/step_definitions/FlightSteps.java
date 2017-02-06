package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

/**
 * Created by dickdijk on 06/02/2017.
 */
public class FlightSteps {

    // (\w{1,3}\d{3,4})
    // (\w*)
    @Given("^the flight (\\w{4,7}) is leaving today$")
    public void the_flight_EZY_is_leaving_today(String flightNo) throws Throwable {
        System.out.println("flightNo is:"+flightNo);
        System.out.println("");
    }

    @Given("^I have deposited (\\d+[.]?\\d*) on my account$")
    public void i_have_deposited_on_my_account(double arg1) throws Throwable {
        double amountWithTax = arg1+1;
        System.out.println("Deposit "+amountWithTax);
    }

}
