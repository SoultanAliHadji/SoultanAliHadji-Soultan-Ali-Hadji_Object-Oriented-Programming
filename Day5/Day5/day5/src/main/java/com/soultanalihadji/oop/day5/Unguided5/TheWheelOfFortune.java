package com.soultanalihadji.oop.day5.Unguided5; //declaring package

public class TheWheelOfFortune extends TarotCard { //declaring child class dengan extends
    void upright() { //overriding1 method
        System.out.println("Change, cycles, inevitable fate");
    }

    void reversed() { //overriding2 method
        System.out.println("No control, clinging to control, bad luck");
    }
}
