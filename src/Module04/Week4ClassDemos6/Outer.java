package Module04.Week4ClassDemos6;

//Weee4 Demo 6: Static class the inner nested class

public class Outer

{
    public void outerMethod()

    {

        System.out.println("\nHi from outer class.");

    }

    // Java Arrays with Answers

    static class Nested_Demo

    {

        public void my_method()

        {

            System.out.println("This is my nested class");

        }

    }

    public static void main(String args[]) {

        Outer.Nested_Demo nested = new Outer.Nested_Demo();

        nested.my_method();

        Outer nonNested = new Outer();

        // nonNested.my_method;

        nonNested.outerMethod();

    }

}
