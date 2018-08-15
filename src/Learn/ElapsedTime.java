package Learn;

import java.util.*;


public class ElapsedTime {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 5; i++) {
                long start = System.currentTimeMillis();
                System.out.println(new Date() );
                Thread.sleep(2000);
                long end = System.currentTimeMillis();
                long diff = end - start;
                System.out.println("Difference is : " + diff+ "\n");
            }

        } catch (Exception a) {
            System.err.println("Got exception !");
        }
    }

}















