//package com.example.demo.model;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
//@Entity
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
//
//    // Constructors
//    public User() {}
//    public User(String name, String email) {
//        this.name = name;
//    }
//
//    // Getters and Setters
//    public Long getId() { return id; }
//    public String getName() { return name; }
//
//    public void setId(Long id) { this.id = id; }
//    public void setName(String name) { this.name = name; }
//}