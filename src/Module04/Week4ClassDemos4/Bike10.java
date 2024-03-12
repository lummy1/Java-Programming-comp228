package Module04.Week4ClassDemos4;

//Week 4: Demo 4 The effect blank final variable. Can only be initialized later from //a constructor.

class Bike10

{

    final int speedlimit;// blank final variable

    // speedlimit = 70;

    Bike10()

    {

        speedlimit = 70;

        System.out.println("\nThe speed limit is " + speedlimit + ".");

    }

    public static void main(String args[])

    {

        Bike10 myBike = new Bike10();

    }

}
