package com.account;

public class Account {

    private int accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Deposit
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Display Details
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}