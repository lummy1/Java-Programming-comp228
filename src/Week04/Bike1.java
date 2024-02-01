package Week04;

public final class Bike1 extends Bike {
    public void run() {
        System.out.println("bike running");
    }

    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.run();

        Bike1 myBike1 = new Bike1();
        myBike1.run();

        Bike10 myBike10 = new Bike10();
        System.out.println(myBike10);

        Outer.Nested_Demo nested = new Outer.Nested_Demo();
        nested.my_method();

        Outer outer = new Outer();
        outer.outerMethod();
    }
}
