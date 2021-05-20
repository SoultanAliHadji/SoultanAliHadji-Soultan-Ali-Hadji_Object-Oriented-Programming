package com.soultanalihadji.oop.day5.unguided2;

import java.util.Scanner;

public class AgeCalculator {
    public static int Age(int birthYaer){
        int result = 2021-birthYaer;
        return result;
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        
        System.out.print("Enter your birth year: ");
        int year = in.nextInt();

        System.out.println("Your current age based on your birth year is " + Age(year));
    }
}
