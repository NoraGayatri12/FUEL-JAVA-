import java.util.*;
import java.util.stream.*;

class Student {
    int id;
    String name;
    double marks;

    // Constructor
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // toString method
    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class CollectionStreamAPI {
    public static void main(String[] args) {

        // 1. Create Student List (Collection)
        List<Student> students = Arrays.asList(
                new Student(1, "Vaishanavi", 80),
                new Student(2, "Pranita", 70),
                new Student(3, "Gayatri", 90),
                new Student(4, "Usha", 60),
                new Student(5, "Tejaswini", 85)
        );

        // 2. Find students with marks > 75
        List<Student> filteredStudents = students.stream()
                .filter(s -> s.getMarks() > 75)
                .collect(Collectors.toList());

        System.out.println("Students with marks > 75:");
        filteredStudents.forEach(System.out::println);

        // 3. Get only student names
        List<String> names = students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println("\nStudent Names:");
        names.forEach(System.out::println);

        // 4. Sort students by marks
        List<Student> sortedStudents = students.stream()
                .sorted(Comparator.comparing(Student::getMarks))
                .collect(Collectors.toList());

        System.out.println("\nStudents sorted by marks:");
        sortedStudents.forEach(System.out::println);
    }
}