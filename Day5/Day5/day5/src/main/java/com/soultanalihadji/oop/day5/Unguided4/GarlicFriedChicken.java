package com.soultanalihadji.oop.day5.Unguided4; //declaring package

public class GarlicFriedChicken extends Recipe { //declaring child class
    public GarlicFriedChicken(String foodName) { //method with string-data type parameter
        super(foodName); //takking variable value from parent class
    }

    public String getIngredient1() { //getter method
        return "1/2kg of chicken thigh";
    }
    public String getIngredient2() { //getter method
        return "2 bulbs of garlics";
    }
    public String getIngredient3() { //getter method
        return "2-4 spoons of cornstarchs";
    }
    public String getIngredient4() { //getter method
        return "A little bit of sesame oil (optional)";
    }
    public String getIngredient5() { //getter method
        return "Enough pepper";
    }
    public String getIngredient6() { //getter method
        return "Enough salt";
    }
}
