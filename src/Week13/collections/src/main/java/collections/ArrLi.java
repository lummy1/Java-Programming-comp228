package collections;

import java.util.ArrayList;

public class ArrLi {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars); // FIFO
        System.out.println();
        System.out.println(cars.get(0));
        System.out.println();
        cars.set(3, "Honda");
        System.out.println(cars.get(3));
        cars.remove(0);
        System.out.println();
        System.out.println(cars);
        System.out.println();
        System.out.println(cars.size());
        System.out.println();
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println();
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
