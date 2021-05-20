package com.soultanalihadji.oop.day5.Unguided5; //declaring package

import java.util.Scanner; //importing Scanner library from java.util
import java.util.Random; //importing Random library from java.util

public class Main { //declaring main class
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //making object for Scanner function

        System.out.println("         ---  Welcome to Fate Prediction Card Game  ---         ");
        System.out.println("-- Note: It is only a game, believe in Allah not in these cards! :D --\n");

        Deck(); //calling method

        System.out.print("Want to draw a card?? (y/n): ");
        String choice = in.nextLine(); //declaring variable which the value is based on user input

        if(choice.equals("y")) { //first condition
            CardDraw(); //calling method
        }

        else { //second condition
            System.out.println("See you in the next time then!");
        }
    }

    static String Deck() { //declaring static method to draw card shape
        for(int i=0; i<=1; i++) { //looping
            System.out.println("            ___________    ___________    ___________");
            for(int j=0; j<=4; j++) { //nested looping
                String cardNo = "???"; //declaring dan initializing variable
                if(j != 2) {
                    cardNo = "   ";
                }
                System.out.println("            |   " + cardNo + "   |    |   " + cardNo + "   |    |   " + cardNo + "   |");
            }
            System.out.println("            |_________|    |_________|    |_________|");
        }
        return "";
    }

    static void CardDraw() { //declaring static method
        TarotCard t = new TarotCard(); //making object from parent class
        TarotCard f = new TheFool(); //making object from child class connected to parent class
        TarotCard m = new TheMagician();
        TarotCard d = new Death();
        TarotCard w = new TheWheelOfFortune();

        Random random = new Random(); //making object for random function
        int card = random.nextInt(5); //declaring variable which the value is a random number in specified range
        int fate = random.nextInt(2);

        System.out.println("\nYour card of fate is:");

        switch(card){ //branch with 5 condition
            case 0: //first condition if the input value is 0
                if(fate == 0) {
                    t.blank(); //calling overloading1 method from parent class
                }
                else {
                    t.blank(""); //calling overloading2 method from parent class
                }
                break; //stoping program

            case 1: //second condition if the input value is 1
                if(fate == 0) {
                    System.out.print("The Fool, upright: ");
                    f.upright(); //calling overriding1 method from child class
                }
                else {
                    System.out.print("The Fool, reversed: ");
                    f.reversed(); //calling overriding2 method from child class
                }
                break;

            case 2: //third condition if the input value is 2
                if(fate == 0) {
                    System.out.print("The Magician, upright: ");
                    m.upright();
                }
                else {
                    System.out.print("The Magician, reversed: ");
                    m.reversed();
                }
                break;

            case 3: //fourth condition if the input value is 3
                if(fate == 0) {
                    System.out.print("Death, upright: ");
                    d.upright();
                }
                else {
                    System.out.print("Death, reversed: ");
                    d.reversed();
                }
                break;

            case 4: //fifth condition if the input value is 4
                if(fate == 0) {
                    System.out.print("The Wheel of Fortune, upright: ");
                    w.upright();
                }
                else {
                    System.out.print("The Wheel of Fortune, reversed: ");
                    w.reversed();
                }
                break;

            default: //default condition if the input value is out of the first-fith condition
                CardDraw(); //calling method
        }
    }
    
}
