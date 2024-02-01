package bike;

public class Bike {
    static final int speedLimit = 90; // Assign a value to speedLimit

    public void run() {
        // speedLimit = 400; // This will cause an error because speedLimit is final
        // Instead, you might want to create a new variable or make speedLimit non-final
        int currentSpeed = 400;
    }

    public static void main(String[] args) {
        Bike obj1 = new Bike();
        obj1.run();

        Bike obj2 = new Bike();
        obj2.run(); // Added missing semicolon
    }
}
