package Module4;

//Week 4: Demo 1 The effect of final variable. The value cannot be changed

public class Bike1

{

    static final int speedlimit = 90;// final variable

    public void run()

    {

        // speedlimit = 400; // The final field Bike1.speedlimit cannot be assignedJava(33554512)

        System.out.println("The value is " + speedlimit);

    }

    public static void main(String args[])

    {

        System.out.println("The original value is " + speedlimit);

        Bike1 obj1 = new Bike1();

        obj1.run();

        Bike1 obj2 = new Bike1();

        obj2.run();

    }

}// end of class