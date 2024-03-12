package Module03.Week3FinalDemos5;

// Week 3 Demo 5 Array Practice 1

public class PassArray2

{

    // main creates array and calls modifyArray and modifyElement

    public static void main(String[] args)

    {

        int[] array = { 1, 2, 3, 4, 5 };

        System.out.printf(

                "Effects of passing an entire array to a method:%n" +

                        "The values of elements in the original array using regular for loop are:\n");

        // output original array elements with regular for loop

        for (int counter = 0; counter < array.length; counter++)

            System.out.println(array[counter]);

        // output original array elements with enhanced for loop

        System.out.println("The values of elements in the original array using enhanced for loop:");

        for (int element : array)

            System.out.printf("\n%d", element);

        modifyArray(array); // pass the entire array: passing by reference

        System.out.printf("%n%nThe values of the modified array are:%n");

        // output modified array elements

        for (int value : array)

            System.out.printf(" %d", value);

        System.out.printf(

                "%n%nEffects of passing an array element:passing by value:%n" +

                        "array[3] before modifyElement: %d%n",
                array[3]);

        modifyElement(array[3]); // attempt to modify array[3]

        System.out.printf(

                "array[3] value in the original array after modifyElement is still: %d%n", array[3]);

    }

    // multiply each element of an array by 2

    public static void modifyArray(int array2[])

    {

        for (int counter = 0; counter < array2.length; counter++)

            array2[counter] *= 2;

    }

    // multiply argument by 2

    public static void modifyElement(int element)

    {

        element *= 2;

        System.out.printf(

                "Value of element in modifyElement within the method: %d%n", element);

    }

} // end class PassArray2
