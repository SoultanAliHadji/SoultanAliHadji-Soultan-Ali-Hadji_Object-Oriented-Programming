package com.soultanalihadji.oop.day5.unguided1; //

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = in.nextInt();

        if(number%2 == 0) {
            System.out.print("The number of " + number + " is an even number");
        }
        else {
            System.out.print("The number of " + number + " is an odd number");
        }
    }
}
