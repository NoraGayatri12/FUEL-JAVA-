package com.banking;

import com.account.Account;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create Account
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        Account acc = new Account(accNo, name, balance);

        int choice;
        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double wd = sc.nextDouble();
                    acc.withdraw(wd);
                    break;

                case 3:
                    acc.display();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}