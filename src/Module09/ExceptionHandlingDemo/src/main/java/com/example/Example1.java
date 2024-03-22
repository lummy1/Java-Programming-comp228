package com.example;

import java.util.Scanner;

public class Example1 {
    void productCheck(int weight) throws InvalidProductException {
        if(weight < 100) {
            throw new InvalidProductException("Product Invalid");
        }
    }

    public static void main(String args[]) {
        Example1 obj = new Example1();
        for(int x = 0; x < 5; x++) {
            int weight;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter product weight: ");
            weight = input.nextInt();

            try {
                obj.productCheck(weight);
            } catch (InvalidProductException ex) {
                System.out.println("Caught the exception");
                System.out.println(ex.getMessage());
            }
        }
    }
}
