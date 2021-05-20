package com.soultanalihadji.oop.day5.Unguided4; //declaring package

import java.util.Scanner; //importing Scanner library dari java.util

public class Main { //declaring main class
    public static void main(String[] args) {
        Main call = new Main(); //making object
        call.MainProgram(); //calling method with the object that has been created
    }

    void MainProgram() { //method
        Scanner in = new Scanner(System.in); //making object for input
        int choice; //declaring variabel with int type of data

        Recipe[] recipe = { //making array object
            new ChickenDimSum("Chicken Dim Sum"),
            new GarlicFriedChicken("Garlic Fried Chicken"),
            new Seblak("Seblak")
        };

        System.out.println("--------> Welcome To Indonesian Food Recipes Program<--------");
        System.out.println("----------> BTW do not really try the recipes X_X <----------");
        System.out.println("");
        System.out.println("Food Menu:");
        System.out.println("1. " + recipe[0].getFoodName() + ".");
        System.out.println("2. " + recipe[1].getFoodName() + ".");
        System.out.println("3. " + recipe[2].getFoodName() + ".");
        System.out.println("4. Exit.");
        System.out.print("Choice: ");
        choice = in.nextInt();

        switch (choice) { //condition with switch
            case 1: //1st condition
            System.out.println("");
            recipe[0].showProfile(); //calling method based on number of array
            System.out.println("\n");
            MainProgram();
            break; //stopping execution

            case 2: //2nd condition
            System.out.println("");
            recipe[1].showProfile();
            System.out.println("\n");
            MainProgram();
            break;

            case 3: //3rd condition
            System.out.println("");
            recipe[2].showProfile();
            System.out.println("\n");
            MainProgram();
            break;

            case 4: //4th condition
            break;

            default: //default condition
            System.out.println("");
            System.out.println("Sorry, the menu that you choose is not available! Try to choose the other please :D");
            System.out.println("");
            System.out.println("");
            MainProgram();
        }
    }
}
