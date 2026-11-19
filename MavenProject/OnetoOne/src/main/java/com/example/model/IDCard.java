package com.example.model;

import javax.persistence.*;

@Entity
public class IDCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int card_id;

    private String cardNumber;   // ✅ String (correct)

    @OneToOne(mappedBy = "idCard")
    private Student student;

    // ✅ GETTERS & SETTERS

    public int getCard_id() {
        return card_id;
    }

    public void setCard_id(int card_id) {
        this.card_id = card_id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {   // ✅ String only
        this.cardNumber = cardNumber;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}