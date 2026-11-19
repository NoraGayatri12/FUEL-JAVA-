
class BankAccount {

    private double balance;

    public void setBalance(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public double getBalance() {
        return balance;
    }
}
public class Bank {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.setBalance(5000);
        acc.setBalance(2000);

        System.out.println("Current Balance: " + acc.getBalance());
    }
}