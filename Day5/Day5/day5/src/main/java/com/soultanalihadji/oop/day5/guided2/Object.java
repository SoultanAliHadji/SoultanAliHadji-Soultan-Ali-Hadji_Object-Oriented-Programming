package com.soultanalihadji.oop.day5.guided2;

public class Object {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student("Andre", 19102099);
        // Output student1
        System.out.println("==> Student Data 1 <==");
        System.out.println("Name: " + stu1.name);
        System.out.println("ID: " + stu1.id);
        // Output student2
        System.out.println("==> Student Data 2 <==");
        System.out.println("Name: " + stu2.name);
        System.out.println("ID: " + stu2.id);
        System.out.println();
    }
}
