package cucumberbook;

import cucumber.api.Transformer;

import java.io.BufferedReader;

/**
 * Created by dickdijk on 12/02/2017.
 */
public class MoneyConverter extends Transformer<Money> {


    String str = "{\"name\":\"dick\", \"age\":43}";

    @Override
    public Money transform(String s) {

        int[] geld = parse(s);
        return new Money(geld[0], geld[1]);
    }

    public static int[] parse(String input) {
        String[] parts = input.split("\\.");
        int dollars = Integer.parseInt(parts[0]);
        int cents = Integer.parseInt(parts[1]);

        return new int[]{dollars, cents};
    }

    public static void main(String[] args) {
        String[] sa = new String[] { "aap", "noot", "mies"};

        for ( String s : sa) {
            s.toLowerCase();
        }
    }
}
