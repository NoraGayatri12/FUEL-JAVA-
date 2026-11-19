package src;

import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. View All Student");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Add Student");
                    break;

                case 2:
                    System.out.println("View All Student");
                    break;

                case 3:
                    System.out.println("Search Student");
                    break;

                case 4:
                    System.out.println("Update Student");
                    break;

                case 5:
                    System.out.println("Delete Student");
                    break;

                case 6:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
    }
}