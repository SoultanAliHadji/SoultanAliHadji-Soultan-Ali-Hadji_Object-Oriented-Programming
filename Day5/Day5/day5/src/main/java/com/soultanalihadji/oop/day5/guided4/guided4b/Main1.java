package com.soultanalihadji.oop.day5.guided4.guided4b;

public class Main1 {
    public static void main(String[] args) {
        // Object constructor
        Animal animal = new Animal("An animal");
        Cat cat = new Cat("Lucas");
        Dog dog = new Dog("Sebastian");
        Rabbit rabbit = new Rabbit("Mina");
        // Outputs
        animal.showProfile();
        cat.showProfile();
        dog.showProfile();
        rabbit.showProfile();
    }
}
