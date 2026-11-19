import java.util.TreeMap;

public class Treemap{
    public static void main(String[] args) {
        TreeMap set = new TreeMap();

        set.put(1,50);
        set.put(2,10);
         set.put(4,50);
        set.put(3,30); 
        set.put(2,20); // rewrite value

        System.out.println(set);
    }
}