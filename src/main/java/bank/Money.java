package bank;

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
        int[] geld = parse(bedrag);
        dollars = geld[0];
        cents = geld[1];
    }

    @Override
    public String toString() {
        return  Integer.toString(dollars) + " dollars en " + Integer.toString(cents) + " cents";
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Money) {
            return dollars == ((Money) obj).dollars && cents == ((Money) obj).cents;
        }
        return false;
    }

    public static int[] parse(String input) {
        String[] parts = input.split("\\.");
        int dollars = Integer.parseInt(parts[0]);
        int cents = 0;
        if (parts.length == 2) {

            cents = Integer.parseInt(parts[1]);
        }

        return new int[]{dollars, cents};
    }

    public Money add(Money money) {
        dollars = dollars + money.dollars;
        cents = cents + money.cents;

        return new Money(dollars, cents);
    }

    public Money subtract(Money money) {
        dollars = dollars - money.dollars;
        cents = cents - money.cents;

        return new Money(dollars, cents);
    }
}
