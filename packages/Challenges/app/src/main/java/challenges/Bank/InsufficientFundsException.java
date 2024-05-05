package challenges.Bank;

public class InsufficientFundsException extends Exception {

    public InsufficientFundsException() {
        super("Insufficient funds");
    }

}
