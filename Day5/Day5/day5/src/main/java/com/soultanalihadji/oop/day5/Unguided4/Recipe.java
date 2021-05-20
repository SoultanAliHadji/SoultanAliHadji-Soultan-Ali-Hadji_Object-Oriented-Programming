package com.soultanalihadji.oop.day5.Unguided4; //declaring package

public class Recipe { //declaring parent class
    private String foodName; //declaring variabel with string type of data

    public Recipe(String foodName) { //method with string-data type parameter
        this.foodName = foodName; //initializing value of variable
    }
    public String getFoodName() { //method getter
        return foodName; //returning variable value
    }
    public void setFoodName(String foodName) {  //method setter
        this.foodName = foodName;
    }

    public String getIngredient1() {
        return "";
    }
    public String getIngredient2() {
        return ""; 
    }
    public String getIngredient3() {
        return "";
    }
    public String getIngredient4() {
        return "";
    }
    public String getIngredient5() {
        return "";
    }
    public String getIngredient6() {
        return "";
    }

    public void showProfile() { //method
        System.out.println(getFoodName() + " Recipe:");
        System.out.println("1. " + getIngredient1() + ".");
        System.out.println("2. " + getIngredient2() + ".");
        System.out.println("3. " + getIngredient3() + ".");
        System.out.println("4. " + getIngredient4() + ".");
        System.out.println("5. " + getIngredient5() + ".");
        System.out.println("6. " + getIngredient6() + ".");
    }
}
