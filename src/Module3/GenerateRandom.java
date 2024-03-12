package Module3;

//Tested3

//Random values from 0 to 24 and 0.0 to 1.0



import java.util.Random;

class GenerateRandom {

public static void main( String args[] ) {

Random rand = new Random(); //instance of random class

int upperbound = 25;

//generate random values from 0-24

int int_random = rand.nextInt(upperbound);

double double_random=rand.nextDouble();

float float_random=rand.nextFloat();


System.out.println("Random integer value from 0 to " + (upperbound-1) + " : "+ int_random);

System.out.println("Random float value between 0.0 (inclusive) and 1.0 (exclusive) : "+float_random);

System.out.println("Random double value between 0.0 (inclusive) and 1.0 (exclusive) : "+double_random);

}

}