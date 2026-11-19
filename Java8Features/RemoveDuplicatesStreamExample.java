
// Using Stream API
import java.util.*;
public class RemoveDuplicatesStreamExample {
    public static void main(String[] args) {
        int numbers[]={10,20,10,30,40,50};

        int uniqueNum[]=Arrays.stream(numbers).distinct().toArray();

        System.out.println("After Removing Duplicates");
        for(int num:uniqueNum){
            System.out.println(num+"");
        }
    }
}
