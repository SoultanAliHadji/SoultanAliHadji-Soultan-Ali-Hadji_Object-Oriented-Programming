package com.soultanalihadji.oop.day5.guided4.guided4a;

public class Parent {
    public String name = "";
    public void talk() {
    if (name.equals(""))
        System.out.println("Hi!");
    else
        System.out.println("My name is " + name);
    }
}
