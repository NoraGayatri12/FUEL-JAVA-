// Functional Interface
interface Sample {
    int add(int a, int b);   // parameterized abstract method
}

public class LambdaExample {
    public static void main(String[] args) {

        // Lambda Expression Implementation
        Sample obj = (a, b) -> {
            return a + b;
        };

        // Calling method
        int result = obj.add(10, 20);
        System.out.println("Sum = " + result);
    }
}