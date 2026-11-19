package com.example.SpringBoostProject1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Controller {

    @GetMapping("/")
    public String home() {
        return "Hello Spring Boot!";
    }

    @GetMapping("/about")
    public String about() {
        return "Spring Boot is fast application";
    }

    @GetMapping("/contact")
    public String contact() {
        return "CONTACT US";
    }

    @GetMapping("/w")
    public String welcome(@RequestParam String name) {
        return "Hello " + name; // URL: http://localhost:8080/w?name=Gayatri
    }

    @GetMapping("/student")
    public Student getStudent() {
        return new Student(101, "Gayatri");// URL: http://localhost:8080/student
    }

       @GetMapping("/studentList")
    public List<Student> getStudentList() {
        List<Student> students = new ArrayList<>();

        students.add(new Student(301, "Tejaswini"));
        students.add(new Student(302, "Divya"));
        students.add(new Student(303, "Sanjana"));
        students.add(new Student(304, "Vaishnavi"));

        return students;
    }
    //PostMapping
     @PostMapping("/studentPost")
    public Student addStudent(@RequestBody Student student) {
        return student;
    }
}