package cucumberbook;

import bank.Money;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dickdijk on 14/04/2017.
 */
public class MoneyConverterTest {

    private MoneyConverter moneyConverter;

    @Before
    public void setup() {
        moneyConverter = new MoneyConverter();
    }

    @Test
    public void transform() throws Exception {

        Money expected  = new Money(33, 44);

        assertEquals( expected, moneyConverter.transform("33.44"));
    }

    @Test
    public void transformDollarsOnly() throws Exception {

        Money expected  = new Money(33, 0);

        assertEquals( expected, moneyConverter.transform("33"));
    }

}