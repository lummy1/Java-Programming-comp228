package Module05.MyCalculation;

public class My_calculation extends Calculation

{

    public void multiplication(int x, int y)

    {

        z = x * y;

        System.out.println("The product of the given numbers:" + z);

    }

    public void division(int x, int y)

    {

        z = x / y;

        System.out.println("The dividend of the given numbers:" + z);

    }

    public static void main(String args[])

    {

        int a = 20, b = 10;

        Calculation demo1 = new Calculation();

        demo1.addition(a, b);

        demo1.Subtraction(a, b);

        // demo1.multiplication(a, b);

        // demo1.division(a, b);

        My_calculation demo2 = new My_calculation();

        demo2.addition(a, b);

        demo2.Subtraction(a, b);

        demo2.multiplication(a, b);

        demo2.division(a, b);

    }

}
