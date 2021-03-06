package com.soultanalihadji.oop.day5.guided2;

public class Human {
    private String name;
    private int age;
    // First: Default constructor without parameter
    public Human() {}
    // Second constructor
    public Human(String name) {
        this.name = name;
    }
    // Third constructor
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Method Defition
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
    return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
