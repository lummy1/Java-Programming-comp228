package Module4;

//Week 4: Demo 2 The effect of final method. The final method cannot be overridden.

//Parent class Bike

public class Bike2

{

    public final void run()

    {

        System.out.println("running");

    }

    public static void main(String args[])

    {

        Bike2 bike = new Bike2();

        bike.run();

        Honda honda = new Honda();

        // honda.run();

    }

}
