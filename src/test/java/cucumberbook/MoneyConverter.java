package cucumberbook;

import bank.Money;
import cucumber.api.Transformer;

/**
 * Created by dickdijk on 12/02/2017.
 */
public class MoneyConverter extends Transformer<Money> {


    @Override
    public Money transform(String s) {

        int[] geld = Money.parse(s);
        return new Money(geld[0], geld[1]);
    }

}
