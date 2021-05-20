package com.soultanalihadji.oop.day5.guided2;

public class DemoHuman {
    public static void main(String[] args) {
        Human[] arrayHuman = new Human[3];
        Human h1 = new Human();
        h1.setName("Jake");
        h1.setAge(20);
        Human h2 = new Human("Finn");
        Human h3 = new Human("Darwin", 16);
        arrayHuman[0] = h1;
        arrayHuman[1] = h2;
        arrayHuman[2] = h3;
        for (Human x : arrayHuman) {
            System.out.println("Character");
            System.out.println("Name: " + x.getName());
            System.out.println("Age: " + x.getAge());
            System.out.println();
        }
    }
}
