package bike;

public class Bike {
    // static final int speedLimit = 90; // Assign a value to speedLimit
    int speedLimit = 0; // Declare speedLimit as final

    public void run() {
        int speedLimit = 400; // This will cause an error because speedLimit is final
    }

    public static void main(String[] args) {
        Bike obj1 = new Bike();

        Bike obj2 = new Bike();
        obj2.run(); // Added missing semicolon

        System.out.println(obj1.speedLimit);
        System.out.println(obj2.speedLimit);
    }
}
