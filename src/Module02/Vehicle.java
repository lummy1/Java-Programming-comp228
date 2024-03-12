package Module02;

public class Vehicle

{

    // instance variables

    int passengers;

    int fuelCap;

    int kmpl;

    // overloaded constructor

    public Vehicle()

    {

    }

    public Vehicle(int pass, int fuelCap, int kmp)

    {

        passengers = pass;

        this.fuelCap = fuelCap;

        kmpl = kmp;

    }

    // setter (a method) that sets (modifies) the object values

    public void setVehicle(int pass, int fc, int kmp)

    {

        passengers = pass;

        fuelCap = fc;

        kmpl = kmp;

    }

    // one of the getters

    public int passengers()

    {

        return passengers;

    }

    // methods those calculate something and return the value

    public int range()

    {

        return kmpl * fuelCap;

    }

    public double fuelNeeded(int kms)

    {

        return (double) kms / kmpl;

    }

    // overriding toString()

    public String toString()

    {

        return "\nNo of passengers: " + passengers + "\nFuel Capacity: " + fuelCap + "\nkms per liter: " + kmpl;

    }

    public static void main(String[] args)

    {

        // create a vehicle object with default values of the instance variable data
        // type

        Vehicle miniVan1 = new Vehicle();

        // replacing values by assigning values of your choice

        miniVan1.passengers = 7;

        miniVan1.fuelCap = 60;

        miniVan1.kmpl = 20;

        // Displaying values one by one directly

        System.out.println("\nPassengers (miniVan1): " + miniVan1.passengers);

        System.out.println("\nFuel Capacity (miniVan1) :" + miniVan1.fuelCap);

        System.out.println("\nKilometers/liter (miniVan1) :" + miniVan1.kmpl);

        // using a 3-argument constructor to create the object all the bases are loaded

        Vehicle miniVan2 = new Vehicle(5, 50, 25);

        // Displaying values one by one directly

        System.out.println("\nPassengers (miniVan2): " + miniVan2.passengers);

        System.out.println("\nFuel Capacity (miniVan2) :" + miniVan2.fuelCap);

        System.out.println("\nKilometers/liter (miniVan2) :" + miniVan2.kmpl);

        // resetting values by calling setter method custom made

        miniVan2.setVehicle(7, 45, 30);

        // Displaying the changed values one by one directly

        System.out.println("\nPassengers (miniVan2): " + miniVan2.passengers);

        System.out.println("\nFuel Capacity (miniVan2) :" + miniVan2.fuelCap);

        System.out.println("\nKilometers/liter (miniVan2) :" + miniVan2.kmpl);

        // Calculating amount of gas needed to cover a distance of 252 kms

        double liters;

        int dist = 252;

        liters = miniVan2.fuelNeeded(dist);

        // Output

        System.out.println("\nTo cover " + dist + " kms the miniVan2 needs " + liters + " liters of fuel.");

        System.out.println("\nThe miniVan2 has: " + miniVan2.toString());

        // another way to print output

        System.out.println(miniVan2);

    }

}
