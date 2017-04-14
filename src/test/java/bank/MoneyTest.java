package bank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dickdijk on 14/04/2017.
 */
public class MoneyTest {

    @Before
    public void setup( ){

    }

    @Test
    public void testAddMoney() {

        Money m1 = new Money(22, 54);
        Money m2 = new Money(10, 06);

        Money expected = new Money(32, 60);

        assertEquals(expected, m1.add(m2));

    }


}