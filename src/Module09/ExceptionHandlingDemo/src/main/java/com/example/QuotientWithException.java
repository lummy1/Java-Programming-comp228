package com.example;

import java.util.Scanner;

public class QuotientWithException {
    public static int quotient(int number1, int number2) {
        return number1 / number2;
    }

    public static void main(String[] args) {
        for(int x = 0; x < 3; x++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter 2 integers: ");
            int number1 = input.nextInt();
            int number2 = input.nextInt();

            try {
                int result = quotient(number1, number2);
                System.out.println(number1 + " / " + number2 + " is " + result);
            } catch (ArithmeticException ex) {
                System.out.println("Exception: an integer cannot be divided by zero!!!");
            } finally {
                System.out.println("Executing finally block anyways!!!!");
            }

            System.out.println("Execution continues!!!");
        }
    }
}
