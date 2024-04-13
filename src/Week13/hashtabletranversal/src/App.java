// Importing required packages
import java.util.*;
import java.util.Enumeration;

// Main Class
class HashtableTranversal {
    // Main driver method
    public static void main(String[] args) {
        // Creating Hashtable object where key is of Integer
        // type and value is of String type
        // LIFO
        Hashtable<Integer, String> ht = new Hashtable<>();

        // Putting key-value pairs to HashTable object
        // Custom input entries
        ht.put(1, "Ram");
        ht.put(2, "Shyam");
        ht.put(3, "Bijay");
        ht.put(4, "Hritik");
        ht.put(5, "Piyush");
        ht.put(6, "Syed");

        // Creating Enumeration interface
        // and get keys() from Hashtable
        Enumeration<Integer> e = ht.keys();

        // Iterating through the Hashtable
        // object
        // Checking for next element in Hashtable object
        // with the help of hasMoreElements() method
        while (e.hasMoreElements()) {
            // Getting the key of a particular entry
            int key = e.nextElement();
            // Print and display the Key and its corresponding Value i.e. Name
            System.out.println("Key : " + key + " Corresponding Mapped Value: ---> "
                    + "\t\tName : " + ht.get(key));
        }
    }
}
