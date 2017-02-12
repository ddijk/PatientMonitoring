package cucumberbook;

/**
 * Created by dickdijk on 12/02/2017.
 */
public class Money {


    int dollars;
    int cents;

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public Money(String bedrag) {
        int[] geld  = MoneyConverter.parse(bedrag);
        dollars=geld[0];
        cents=geld[1];
    }

    @Override
    public String toString() {
        return ""+ dollars + " dollars en " + cents + " cents";
    }
}
