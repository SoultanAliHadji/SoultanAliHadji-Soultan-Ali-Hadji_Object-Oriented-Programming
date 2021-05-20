package com.soultanalihadji.oop.day5.Unguided5; //declaring package

public class TheMagician extends TarotCard { //declaring child class
    void upright() { //overriding1 method
        System.out.println("Willpower, desire, creation, manifestation");
    }

    void reversed() { //overriding2 method
        System.out.println("Trickery, illusions, out of touch");
    }
}
