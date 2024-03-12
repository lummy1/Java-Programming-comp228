package Module3;

//Tested 4

//Random values from 1 to 10

import java.util.Random;

public class GenerateNumberInRangeMain

{

    public static void main(String[] args)

    {

        System.out.println("============================");

        System.out.println("Generating 10 random integer in range of 1 to 10 using Random"); // 1 and 10 included

        System.out.println("============================");

        Random randomGenerator = new Random();

        for (int i = 0; i < 10; i++) {

            System.out.println(randomGenerator.nextInt(10) + 1);

        }

    }

}