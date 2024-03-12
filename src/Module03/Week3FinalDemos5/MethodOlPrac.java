package Module03.Week3FinalDemos5;

//Week 3 Demo 5. Method Overloading Practice

public class MethodOlPrac

{

    public static void main(String[] args)

    {

        MOLPrac();

        MOLPrac(55);

        MOLPrac(8, "Syed");

    }

    public static void MOLPrac()

    {

        int x = 8;

        System.out.println("Reporting from no arg method.The value of x:" + x);

    }

    public static void MOLPrac(int x)

    {

        System.out.println("Reporting from 1 arg method: x is " + x);

    }

    public static void MOLPrac(int x, String y)

    {

        System.out.println("Reporting from 2 arg method: x is " + x + ", y is: " + y);

    }

}
