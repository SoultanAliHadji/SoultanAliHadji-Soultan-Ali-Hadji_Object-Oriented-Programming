package com.soultanalihadji.oop.day5.guided4.guided4b;

public class Main2 {
    public static void main(String[] args) {
        // Array of objects of inherited classes
        Animal[] animals = {
        new Cat("Cat1"),
        new Dog("Dog1"),
        new Rabbit("Rabbit1"),
        };
        // Output first way
        int animalCount = animals.length;
        for (int i = 0; i < animalCount; i++)
            animals[0].showProfile();
            // Output second way
        for (Animal animal : animals)
            animal.showProfile();
    }
}
