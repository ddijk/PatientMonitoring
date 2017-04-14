package step_definitions;

import bank.Account;
import bank.AtmSleuf;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import bank.Money;
import cucumberbook.MoneyConverter;

import static org.junit.Assert.assertEquals;

/**
 * Created by dickdijk on 12/02/2017.
 */
public class CashWithdrawalSteps {

    private final AtmSleuf atmSleuf;
    private final Account account;
    public CashWithdrawalSteps(Account account, AtmSleuf atmSleuf) {
        this.account = account;
        this.atmSleuf = atmSleuf;
    }

    @Given("^I have deposited \\$(\\d+\\.\\d+) on my account$")
    public void i_have_deposited_$_on_my_account(@Transform(MoneyConverter.class) Money spaargeld) throws Throwable {
        account.deposit(spaargeld);
    }

    @Given("^Ik heb ook nog \\$(\\d+\\.?\\d*) erbij gedaan$")
    public void ik_heb_ook_nog_$_erbij_gedaan(Money spaargeld) throws Throwable {
        account.deposit(spaargeld);
    }

    @When("^I request \\$(\\d+)$")
    public void i_request_$(int arg1) throws Throwable {

        Money money = new Money(arg1, 0);
        account.withdraw(money);
        atmSleuf.setContents(money);
    }

    @Then("^\\$(\\d+) should be dispensed\\.$")
    public void $_should_be_dispensed(int arg1) throws Throwable {
        assertEquals(new Money(arg1, 0), atmSleuf.getContents());
    }

    @Then("^My Account should have \\$(\\d+\\.?\\d*)$")
    public void my_Account_should_have_$(@Transform(MoneyConverter.class) Money balance) throws Throwable {
        assertEquals(balance, account.getBalance());
    }
}
