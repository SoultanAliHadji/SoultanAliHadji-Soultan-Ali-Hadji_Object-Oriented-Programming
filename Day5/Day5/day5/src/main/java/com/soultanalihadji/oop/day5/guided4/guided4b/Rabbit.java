package com.soultanalihadji.oop.day5.guided4.guided4b;

public class Rabbit extends Animal{
    public Rabbit(String name) {
        super(name);
    }
    public String getType() {
        return "Rabbit";
    }
    public String playSound() {
        return "Squeak~!";
    }
}
