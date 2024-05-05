package challenges.Bank;

public class Account {

    final String id;
    final String owner;
    final boolean allowNegativeBalance;
    double balance = 0;

    public Account(
            String id,
            String owner,
            boolean allowNegativeBalance) {
        this.id = id;
        this.owner = owner;
        this.allowNegativeBalance = allowNegativeBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public boolean allowedToWithdraw(double amount) {
        return true;
    }

}
