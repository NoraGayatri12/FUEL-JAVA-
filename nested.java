import java.util.Scanner;

public class nested {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Percentage");
        float percentage = sc.nextFloat();

        if (percentage >= 35) {
            
            if (percentage >= 85) {
                System.out.println("A");
            } 
            else {
                if (percentage >= 75) {
                    System.out.println("B");
                } 
                else {
                    if (percentage >= 65) {
                        System.out.println("C");
                    } 
                    else {
                        if (percentage >= 55) {
                            System.out.println("D");
                        } 
                        else {
                            System.out.println("E");
                        }
                    }
                }
            }
        } 
        else {
            System.out.println("Fail");
        }
    }
}