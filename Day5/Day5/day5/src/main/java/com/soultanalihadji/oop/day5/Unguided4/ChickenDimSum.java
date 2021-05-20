package com.soultanalihadji.oop.day5.Unguided4; //declaring package

public class ChickenDimSum extends Recipe { //declaring child class
    public ChickenDimSum(String foodName) { //method with string-data type parameter
        super(foodName); //takking variable value from parent class
    }

    public String getIngredient1() { //getter method
        return "1/2kg of chicken thigh";
    }
    public String getIngredient2() { //getter method
        return "8 spoon of tapioca flour";
    }
    public String getIngredient3() { //getter method
        return "1 egg";
    }
    public String getIngredient4() { //getter method
        return "2 cloves of garlics (puree the garlics)";
    }
    public String getIngredient5() { //getter method
        return "2 spoons of oyster sauce";
    }
    public String getIngredient6() { //getter method
        return "1/2 spoon of salt";
    }
}
