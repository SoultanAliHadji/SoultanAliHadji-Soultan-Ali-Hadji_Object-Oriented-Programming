package com.soultanalihadji.oop.day5.guided4.guided4b;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    public String getType() {
        return "Cat";
    }
    public String playSound() {
        return "Meow~!";
    }
}
