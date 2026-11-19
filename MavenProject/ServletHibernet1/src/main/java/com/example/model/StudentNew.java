package com.example.model;

import javax.persistence.*;

@Entity
@Table(name="student")
public class StudentNew {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String username;
    private String password;

    public StudentNew() {}

    public StudentNew(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
}