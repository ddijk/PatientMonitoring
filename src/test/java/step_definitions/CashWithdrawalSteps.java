package step_definitions;

import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumberbook.Money;
import cucumberbook.MoneyConverter;

/**
 * Created by dickdijk on 12/02/2017.
 */
public class CashWithdrawalSteps {

    @Given("^I have deposited \\$(\\d+\\.\\d+) on my account$")
    public void i_have_deposited_$_on_my_account(@Transform(MoneyConverter.class) Money arg2) throws Throwable {



        System.out.println("deposit ok:"+arg2);
    }

    @Given("^Ik heb ook nog \\$(\\d+\\.\\d+) erbij gedaan$")
    public void ik_heb_ook_nog_$_erbij_gedaan(Money arg2) throws Throwable {
        System.out.printf("nog een deposit van " + arg2);
    }
}
