import java.util.HashMap;

public class hashset{
    public static void main(String[] args) {
        HashMap set = new HashMap();

        set.put(1,50);
        set.put(2,10);
        set.put(3,30);
        set.put(4,50);  //value duplicate 
        set.put(2,20); // rewrite value

        System.out.println(set);
    }
}