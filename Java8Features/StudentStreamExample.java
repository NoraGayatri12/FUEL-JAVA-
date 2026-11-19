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

public class StudentStreamExample {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(1, "Vaishanavi", 65),
                new Student(2, "Tejaswini", 85),
                new Student(3, "Divya", 72),
                new Student(4, "Gayatri", 90),
                new Student(5, "Sanjana", 60)
        );

        students.stream()
                .filter(s -> s.getMarks() > 70) // marks > 70
                .sorted((s1, s2) -> s2.getMarks() - s1.getMarks()) // descending order
                .map(Student::getName) // get names only
                .forEach(System.out::println); 
    }
}