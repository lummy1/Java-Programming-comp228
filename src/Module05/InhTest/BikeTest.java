package Module05.InhTest;

public class BikeTest

{

    public static void main(String[] args)

    {

        Bicycle b = new Bicycle(3, 100);

        System.out.println("\nBicycle Data: " + "\n\n" + b);

        MountainBike mb = new MountainBike(3, 100, 25);

        System.out.println("\nMountain Bike Data: " + "\n" + mb);

    }

}
