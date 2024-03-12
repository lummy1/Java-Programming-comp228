package Module3;

//Tested 5

//Random values in a range of max and min

import java.util.Random;

public class GenerateWithRange

{

    public static void main(String args[])

    {

        int maximum = 10;

        int minimum = 5;

        Random randomGenerator = new Random();

        System.out.println(randomGenerator.nextInt((maximum - minimum) + 1) + minimum);

        System.out.println(randomGenerator.nextInt(10) + 1);

    }

}
