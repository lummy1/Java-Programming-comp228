package com.example;

import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        for(int x = 0; x < 3; x++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter 2 integers: ");
            int number1 = input.nextInt();
            int number2 = input.nextInt();
            System.out.println(number1 + " / " + number2 + " is " + number1 / number2);
        }
    }
}
