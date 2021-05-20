package com.soultanalihadji.oop.day5.guided4.guided4b;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    public String getType() {
        return "Dog";
    }
    public String playSound() {
        return "Guk~!";
    }
}
