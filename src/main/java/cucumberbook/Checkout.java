package cucumberbook;

import java.util.HashMap;
import java.util.Map;

public class Checkout {

    private Map<String, Integer> cart = new HashMap<>();

    public void add(String productName, int count) {

       int currentCount =  cart.getOrDefault(productName, 0);

       currentCount = currentCount + count;

       cart.put(productName, currentCount);
    }

    public Map<String, Integer> getContents() {
        return cart;
    }

}
