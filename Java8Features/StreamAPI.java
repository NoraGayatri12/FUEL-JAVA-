// Without Stream API

// import java.util.*;

// public class StreamAPI {
//     public static void main(String[] args) {

//         // Correct declaration
//         List<Integer> numbers = Arrays.asList(10, 27, 35, 40, 50);

//         // Loop through numbers
//         for (Integer n : numbers) {   //(Primimitive Data Type) Integer = Wrapper Class
//             if (n % 2 == 0) {
//                 System.out.println(n); 
//             }
//         }
//     }
// }


// Using Stream API

import java.util.*;

public class StreamAPI {
    public static void main(String[] args) {

        // Correct declaration
        List<Integer> numbers = Arrays.asList(10, 27, 35, 40, 50);
        numbers.stream().filter(n->n%2==0).map(n->n*3).forEach(System.out::println);
      }

    }
