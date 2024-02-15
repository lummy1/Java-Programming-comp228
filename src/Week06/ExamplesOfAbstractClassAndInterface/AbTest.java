package Week06.ExamplesOfAbstractClassAndInterface;

public class AbTest {

    public static void main(String[] args) {
        Sedan mySedan = new Sedan();
        mySedan.setModel("Honda Civic");
        mySedan.setColor("White");
        mySedan.setMaxSpeed(145);
        mySedan.accelerate();
        mySedan.brake();
        System.out.println(mySedan);
        mySedan.setNavigationSys("Delux");
        System.out.println("\nNow the navigation system is set to: " + mySedan.getNavigationSys());
        System.out.println(mySedan);
    }
}
