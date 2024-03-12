package Module04.Week4ClassDemos3;

//A class tried to inherit a final class and fails.

// public class Honda1 extends Bike1 // The type Honda1 cannot subclass the final class Bike1Java(16777529)
public class Honda1

{

    void run()

    {

        System.out.println("running safely with 100 kmph");

    }

    public static void main(String args[])

    {

        Honda1 honda = new Honda1();

        honda.run();

    }

}
