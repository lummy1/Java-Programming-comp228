package collections;

import java.util.ArrayList;

public class ArrL {
    public static void main(String[] args) {
        ArrayList cars = new ArrayList();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add(123);
        System.out.println(cars); // FIFO
    }
}
