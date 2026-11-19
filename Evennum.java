import java.util.Scanner;

public class Evennum {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}