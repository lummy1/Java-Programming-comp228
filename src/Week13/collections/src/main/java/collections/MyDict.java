package collections;

import java.util.*;

class MyDict {
    public static void main(String[] args) {
        Hashtable<String, String> my_dict = new Hashtable<String, String>();
        my_dict.put("01", "Apple");
        my_dict.put("10", "Banana");
        System.out.println("\nValue at key = 10 : " + my_dict.get("10"));
        System.out.println("Value at key = 11 : " + my_dict.get("11"));
        System.out.println("\nIs my dictionary empty? : " + my_dict.isEmpty() + "\n");
        my_dict.remove("10");
        System.out.println("Checking if the removed value exists: " + my_dict.get("10"));
        System.out.println("\nSize of my_dict : " + my_dict.size());
    }
}
