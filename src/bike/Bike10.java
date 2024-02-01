package bike;

public class Bike10 {
    final int speedLimit;
    // speedLimit = 100; // The final field Bike10.speedLimit cannot be assigned

    Bike10() {
        speedLimit = 70;
        System.out.println(speedLimit);
    }

    public static void main(String[] args) {
        Bike10 myBike = new Bike10();
        System.out.println(myBike);
    }
}
