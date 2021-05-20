package com.soultanalihadji.oop.day5.guided2;

public class Student {
    // Attribute
    String name;
    int id;
    // Constructor without parameter
    public Student() {
        this.name = "Default";
        this.id = 0;
    }
    // Constructor with parameter
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
