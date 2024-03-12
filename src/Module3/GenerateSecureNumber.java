package Module3;

//Tested 2

//SecureRandom

//A Java program to demonstrate secure

//random number generation

//using java.security.SecureRandom

import java.security.SecureRandom;

public class GenerateSecureNumber {

    public static void main(String args[])

    {

        // create instance of SecureRandom class

        SecureRandom rand = new SecureRandom();

        // Generate random integers in range 0 to 9

        int rand_int1 = rand.nextInt(10);

        // Generate random integers in range 1 to 10

        int rand_int2 = rand.nextInt(10) + 1;

        // Print random integers

        System.out.println("Random Integers: " + rand_int1);

        System.out.println("Random Integers: " + rand_int2);

    }

}