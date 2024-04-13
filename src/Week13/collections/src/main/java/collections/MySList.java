package collections;

import java.util.ArrayList;
import java.util.Collections;

public class MySList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (String i : cars) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println();
        Collections.sort(cars);
        for (String i : cars) {
            System.out.println(i);
        }

        System.out.println();

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);
        for (int i : myNumbers) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println();
        Collections.sort(myNumbers);
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
