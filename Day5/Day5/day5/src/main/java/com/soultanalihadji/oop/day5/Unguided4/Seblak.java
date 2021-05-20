package com.soultanalihadji.oop.day5.Unguided4; //declaring package

public class Seblak extends Recipe { //declaring child class
    public Seblak(String foodName) { //method with string-data type parameter
        super(foodName); //takking variable value from parent class
    }

    public String getIngredient1() { //getter method
        return "100gr of raw crackers";
    }
    public String getIngredient2() { //getter method
        return "1 egg";
    }
    public String getIngredient3() { //getter method
        return "2 lime leaves";
    }
    public String getIngredient4() { //getter method
        return "1 stick of leek";
    }
    public String getIngredient5() { //getter method
        return "1 spoon of broth powder";
    }
    public String getIngredient6() { //getter method
        return "Enough water";
    }
}
