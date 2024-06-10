package org.iu.dspwa1022.oop.Bank;

import java.util.HashSet;
import java.util.Set;

public final class Bank {

    private final Set<Account> accounts = new HashSet<Account>();

    public void openAccount(Account account) {
        for (Account acc : accounts) {
            if (acc.id.equals(account.id)) {
                throw new IllegalArgumentException("Konto mit dieser ID existiert bereits.");
            }
        }
        accounts.add(account);
    }

    public void closeAccount(Account account) throws InsufficientFundsException {
        if (account.getBalance() < 0) {
            throw new InsufficientFundsException();
        }
        accounts.remove(account);
    }

    public double totalManagedMoney() {
        double total = 0;
    for (Account account : accounts) {
        total += account.getBalance();
    }
    return total;
    }

    public void transfer(Account from, Account to, double amount) {
        if (from.allowedToWithdraw(amount)) {
            from.withdraw(amount);
            to.deposit(amount);
        } else {
            throw new IllegalArgumentException("Transfer nicht erlaubt: Unzureichender Kontostand oder negative Salden nicht erlaubt.");
        }
    }

}
