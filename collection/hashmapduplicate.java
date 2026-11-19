import java.util.*;

public class hashmapduplicate {
    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 10); // duplicate
        map.put(4, 30);
        map.put(5, 20); // duplicate

        HashSet<Integer> set = new HashSet<>();

        for (Integer value : map.values()) {
            if (!set.add(value)) {
                System.out.println("Duplicate: " + value);
            }
        }
    }
}