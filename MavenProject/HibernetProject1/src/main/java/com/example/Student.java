package com.example;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int marks;

    // Default constructor
    public Student() {}

    // Parameterized constructor
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getters & Setters
    public int getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getMarks() { return marks; }
    public void setMarks(int marks) { this.marks = marks; }
}