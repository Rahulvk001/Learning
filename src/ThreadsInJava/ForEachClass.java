package ThreadsInJava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachClass {
    public static void main(String[] args) {
        List<Integer> v = Arrays.asList(4, 5, 6, 7, 8, 9);
        Consumer<Integer> c = (Integer i) -> System.out.print(" " + i);
        v.forEach(c);
    }
}
