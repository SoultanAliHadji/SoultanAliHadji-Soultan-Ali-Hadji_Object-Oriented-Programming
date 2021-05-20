package com.soultanalihadji.oop.day5.guided5;

public class Chef {
    String name;
    // Constructor Chef
    public Chef(String name){
        this.name = name;
    }
    // Method cook original
    public void cook(){
        System.out.println("Chef " + name + " is cooking.");
    }
    // Method cook overloaded
    public void cook(String nameFood){
        System.out.println("Chef " + name + " is cooking " + nameFood + ".");
    }
}
