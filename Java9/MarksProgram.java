import java.util.*;

public class MarksProgram {
    public static void main(String[] args) {

        // Step 1: String input (marks)
        String str = "70 85 90 70 60 85";

        // Step 2: Convert String to Integer and store in ArrayList
        String[] arr = str.split(" ");
        ArrayList<Integer> marks = new ArrayList<>();

        for (String s : arr) {
            marks.add(Integer.parseInt(s));
        }

        System.out.println("Original Marks: " + marks);

        // Step 3: Remove duplicates
        Set<Integer> uniqueSet = new LinkedHashSet<>(marks);
        ArrayList<Integer> uniqueMarks = new ArrayList<>(uniqueSet);

        System.out.println("Marks after removing duplicates: " + uniqueMarks);

        // Step 4: Calculate total
        int total = 0;
        for (int m : uniqueMarks) {
            total += m;
        }

        // Step 5: Average
        double avg = (double) total / uniqueMarks.size();

        // Step 6: Highest and Lowest
        int max = Collections.max(uniqueMarks);
        int min = Collections.min(uniqueMarks);

        // Step 7: Output
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
        System.out.println("Highest Marks: " + max);
        System.out.println("Lowest Marks: " + min);
    }
}