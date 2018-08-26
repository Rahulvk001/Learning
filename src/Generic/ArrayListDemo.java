package Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("China No1");
        countries.add("India");
        countries.add("Pakistan");
        countries.add("Africa");
        Iterator<String> j = countries.iterator();
        while (j.hasNext()) {
            System.out.println(j.next());
        }
    }
}
