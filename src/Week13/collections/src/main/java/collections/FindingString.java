package collections;

import java.util.ArrayList;

public class FindingString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("JavaFX");
        list.add("Java");
        list.add("WebGL");
        list.add("OpenCV");
        list.add("OpenNLP");
        list.add("JOGL");
        list.add("Hadoop");
        list.add("HBase");
        list.add("Java Script");
        list.add("Flume");
        list.add("Mahout");
        list.add("Impala");
        list.add("java");
        System.out.println("Contents of the array list with Java in it: ");
        for (String element : list) {
            if (element.contains("Java")) {
                System.out.println(element);
            }
        }
    }
}
