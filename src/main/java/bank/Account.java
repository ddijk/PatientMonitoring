package bank;

/**
 * Created by dickdijk on 14/04/2017.
 */
public class Account {

    private Money currentBalance;

    public Account() {
        this.currentBalance = new Money(0,0);
    }

    public void setBalance(Money money) {
        this.currentBalance = money;
    }

    public void deposit(Money money) {
        currentBalance = currentBalance.add(money);
    }

    public void withdraw(Money money) {
        currentBalance = currentBalance.subtract(money);
    }

    public Money getBalance() {
        return currentBalance;
    }
}
