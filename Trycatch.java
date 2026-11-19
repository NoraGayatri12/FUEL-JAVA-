import java.util.*;

public class Trycatch {
    public static void main(String args[]){
        int z = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first num:");
        int x = sc.nextInt();

        System.out.println("Enter second num:");
        int y = sc.nextInt();

        try {
            z = x / y;
        }
        catch(ArithmeticException e){
            System.out.println("Second number cannot be Zero");
        }

        System.out.println("Division: " + z);
    }
}