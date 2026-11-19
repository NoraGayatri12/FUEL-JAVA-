package com.example.model;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private IDCard idCard;

    // ✅ GETTERS & SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {   // 🔥 REQUIRED
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {        // 🔥 REQUIRED
        this.age = age;
    }

    public IDCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IDCard idCard) {  // 🔥 REQUIRED
        this.idCard = idCard;
    }
}