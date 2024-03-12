package Module04.Week4ClassDemos2;

//Week 4: Demo 2 The effect of final method. The final method cannot be overridden.

//Parent class Bike

public class Bike

{

    public final void run()

    {

        System.out.println("running");

    }

    public static void main(String args[])

    {

        Bike bike = new Bike();

        bike.run();

        Honda honda = new Honda();

        honda.run();

    }

}
