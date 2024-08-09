package org.iu.dspwa1022.oop.Bank;

public class Account {

    final String id;
    final String owner;
    final boolean allowNegativeBalance;
    private double balance = 0;

    protected static void dangerouslySetBalance(Account account, double balance) {
        account.balance = balance;
    }

    public Account(
            String id,
            String owner,
            boolean allowNegativeBalance) {
        this.id = id;
        this.owner = owner;
        this.allowNegativeBalance = allowNegativeBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (!allowedToWithdraw(amount)) {
            throw new InsufficientFundsException();
        }
        balance -= amount;
    }

    public boolean allowedToWithdraw(double amount) {
        if (amount < 0) {
            return false; // Negative Beträge können nicht abgehoben werden
        }
        
        if (allowNegativeBalance) {
            return true; // Wenn negative Salden erlaubt sind, ist jede Abhebung erlaubt
        } else {
            return balance >= amount; // Wenn negative Salden nicht erlaubt sind, muss der Kontostand ausreichend sein
        }
    }


}
