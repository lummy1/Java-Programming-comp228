package Week04;

// A class trying to inherit a final class will fail
public class Honda1 extends Bike1 {
    void run() {
        System.out.println("running safely with 100 kmph");
    }

    public static void main(String args[]) {
        Honda1 honda = new Honda1();
        honda.run();
    }
}
