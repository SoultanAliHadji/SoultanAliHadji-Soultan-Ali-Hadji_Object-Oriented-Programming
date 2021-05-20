package com.soultanalihadji.oop.day5.unguided3; //declaring package

public class Car { //declaring class
    private String manufacturer, model; //declaring variables with string type of data
    private int year; //declaring variable with int type of data

    public Car() {} //constructure

    public Car(String manufacturer, String model, int year) { //constructure
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    public String getManufacturer() { //getter method
        return manufacturer; //returning variable value
    }

    public void setManufacturer(String manufacturer) { //setter method
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
