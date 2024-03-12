package Module05.MyCalculation;

//1. Simple Inheritance without custom constructor, the default constructor works just fine in parent and child class

class Calculation

{

    int z;

    public void addition(int x, int y)

    {

        z = x + y;

        System.out.println("The sum of the given numbers:" + z);

    }

    public void Subtraction(int x, int y)

    {

        z = x - y;

        System.out.println("The difference between the given numbers:" + z);

    }

}
