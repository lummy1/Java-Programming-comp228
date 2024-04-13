package collections;

import java.util.*;

public class QIt {
    public static void main(String[] args) {
        Queue LL_queue = new LinkedList();
        LL_queue.add("Value-0");
        LL_queue.add("Value-1");
        LL_queue.add("Value-2");
        LL_queue.add("Value-3");
        System.out.println("\n\nThe Queue elements using for loop:");
        for (Object object : LL_queue) {
            String element = (String) object;
            System.out.print(element + " ");
        }
    }
}
