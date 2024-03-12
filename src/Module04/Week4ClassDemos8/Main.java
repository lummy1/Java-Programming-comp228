package Module04.Week4ClassDemos8;

//Week 4: Demo 8 Enum

enum Level

{

    LOW,

    MEDIUM,

    HIGH

}

public class Main

{

    public static void main(String[] args)

    {

        Level myVar = Level.HIGH;

        switch (myVar)

        {

            case LOW:

                System.out.println("Low level");

                break;

            case MEDIUM:

                System.out.println("Medium level");

                break;

            case HIGH:

                System.out.println("High level");

                break;

            default:

                System.out.println("None of the levels applies.");

        }

    }

}
