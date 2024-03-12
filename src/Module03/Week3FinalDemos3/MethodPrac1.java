package Module03.Week3FinalDemos3;

//Week 3 Demo 3

// Method Practice: static vs. non-static

public class MethodPrac1

{

    public static void main(String[] args)

    {

        staticPrac(); // valid call

        // nonStatPrac(); // invalid call

        MethodPrac1 myObj = new MethodPrac1(); // creating object with default constructor

        myObj.nonStatPrac(); // valid call

    }

    public static void staticPrac() // shared by all object

    {

        System.out.println("The static method is called without object reference.");

    }

    public void nonStatPrac() // each object calls this one with the object state

    {

        System.out.println("The non-static method must be called with an object reference.");

    }

}
