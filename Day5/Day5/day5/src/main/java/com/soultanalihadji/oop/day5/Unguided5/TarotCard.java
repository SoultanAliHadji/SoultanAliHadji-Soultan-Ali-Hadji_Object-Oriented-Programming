package com.soultanalihadji.oop.day5.Unguided5; //declaring package

public class TarotCard { //declaring parent class
    void upright() {} //overriding1 method

    void reversed() {} //overriding2 method

    void blank() { //declaring overloading1 method
        System.out.println("Blank Card!");
        System.out.println("Try to draw another card eheh");
    }

    void blank(String unused) { //declaring overloading2 method
        System.out.println("Another Black Card!");
        System.out.println("Try to draw another card eheh");
    }
}
