package Generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> name = new HashSet<String>();
        name.add("China");
        name.add("is");
        name.add("Number");
        name.add("One");
        Iterator<String> i = name.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }


}
