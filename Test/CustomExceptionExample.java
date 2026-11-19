// User-defined exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Bank class
class Bank {
    double balance = 5000;

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance!");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        }
    }
}

// Main class
public class CustomExceptionExample {
    public static void main(String[] args) {
        Bank b = new Bank();

        try {
            b.withdraw(7000);   
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}