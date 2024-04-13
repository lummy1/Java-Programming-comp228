package collections;

import java.util.*;

public class LLex1 {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Steve");
        list.add("Carl");
        list.add("Raj");
        list.addFirst("Negan");
        list.addLast("Rick");
        list.add(2, "Glenn");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
