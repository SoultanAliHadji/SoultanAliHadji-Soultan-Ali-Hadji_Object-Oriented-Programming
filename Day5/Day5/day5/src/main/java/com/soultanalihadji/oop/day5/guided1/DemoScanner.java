package com.soultanalihadji.oop.day5.guided1;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==> Edit Profile <==");
        System.out.println();
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your nickname ");
        char nickname = input.nextLine().charAt(0);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Enter your height: ");
        float height = input.nextFloat();
        System.out.println();
        System.out.println("==> My Profile <==");
        System.out.println();
        System.out.println("Name : " + name);
        System.out.println("Nickname : " + nickname);
        System.out.println("Age : " + age + "year");
        System.out.println("Height : " + height + "cm");
    }
}
