package com.soultanalihadji.oop.day5.unguided3; //declaring package

public class Main { //declaring main class
    public static void main(String[] args) {
        Car[] array = new Car[3]; //making array object from class
        Car product1 = new Car(); //making object from class
        product1.setManufacturer("Toyota"); //initializing variable value
        product1.setModel("Avanza");
        product1.setYear(2017);

        Car product2 = new Car("Daihatsu", "Xenia", 2018);
        Car product3 = new Car("Honda", "Jazz", 2015);

        array[0] = product1; //initializing array variable value
        array[1] = product2;
        array[2] = product3;

        System.out.println("Available Cars List:\n");

        for(Car x : array) { //looping
            System.out.println("Manufactured by: " + x.getManufacturer());
            System.out.println("Car Model: " + x.getModel());
            System.out.println("Produced in: " + x.getYear() + "\n");
        }
    }
}
