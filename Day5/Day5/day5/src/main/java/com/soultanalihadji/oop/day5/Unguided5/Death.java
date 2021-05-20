package com.soultanalihadji.oop.day5.Unguided5; //declaring package

public class Death extends TarotCard { //declaring child class
    void upright() { //overriding1 method
        System.out.println("End of cycle, beginnings, change, metamorphosis");
    }

    void reversed() { //overriding2 method
        System.out.println("Fear of change, holding on, stagnation, decay");
    }
}
