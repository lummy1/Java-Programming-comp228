package Module03.Week3FinalDemos4;

//Week 3 Demo 4

//Method Forms: arguments, no arguments, //non-returning and returning type methods and

//static and non-static methods

public class MethodForms

{

    public static void methodPrac1() // no returning with no args

    {

        System.out.println("Reporting from no return no argument method");

    }

    public static void methodPrac2(int x, String y) // non returning with args

    {

        System.out.println("Reporting from no return with args methodPrac2: The value of x is: " + x
                + "\nThe value of y is: " + y);

    }

    public static int methodPrac3() // returning int with no args

    {

        return 5;

    }

    public static String methodPrac4(String x) // static method with 1 String argument, returning a String

    {

        return x;

    }

    public static void main(String[] args)

    {

        methodPrac1(); // calling no return no arg method

        methodPrac2(44, "Syed"); // calling no return with arg method

        int z = methodPrac3(); // calling return type no argument and capturing the return

        System.out.println("\nPrinting the value returned by methodPrac3 " + z); // displaying the captured returned
                                                                                 // value, an int in this case

        String n = methodPrac4("Syed"); // calling return type with arg and capturing the returned value, String in this
                                        // case

        System.out.println(
                "\n Printing the value of string n as returned by methodPrac4, method that takes argument and returns "
                        + n);

    }

}

