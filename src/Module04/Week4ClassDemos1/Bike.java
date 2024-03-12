package Module04.Week4ClassDemos1;

public class Bike

{

    static final int speedlimit = 90;// final variable

    public void run()

    {

        // speedlimit=400; // The final field Bike.speedlimit cannot be assignedJava(33554512)

        System.out.println("The value is " + speedlimit);

    }

    public static void main(String args[])

    {

        System.out.println("The original value is " + speedlimit);

        Bike obj1 = new Bike();

        obj1.run();

        Bike obj2 = new Bike();

        obj2.run();

    }

}// end of class
