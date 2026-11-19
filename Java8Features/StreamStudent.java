import java.util.*;
import java.util.stream.*;

class Student {
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}

public class StreamStudent{
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student(1, "Vaishanavi", 65),
                new Student(2, "Tejaswini", 85),
                new Student(3, "Divya", 72),
                new Student(4, "Gayatri", 90),
                new Student(5, "Sanjana", 60)
               
        );

        // 1. Sort marks (ascending)
        System.out.println("Sorted Marks:");
        students.stream()
                .map(Student::getMarks)
                .sorted()
                .forEach(System.out::println);

        // 2. Names starting with 'D'
        System.out.println("\nNames starting with D:");
        students.stream()
                .map(Student::getName)
                .filter(name -> name.startsWith("D"))
                .forEach(System.out::println);

        // 3. Longest name
        System.out.println("\nLongest Name:");
        Optional<String> longestName = students.stream()
                .map(Student::getName)
                .max(Comparator.comparingInt(String::length));

        longestName.ifPresent(System.out::println);
    }
}