package Learn;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateDemo {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        SimpleDateFormat dnow = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz" );
        System.out.println(dnow.format(now));
        String str =String.format("Current DATE/TIME :%tc", now );
        System.out.println(str);
        try{
            System.out.printf("%1$s %2$tB %2&td, %2$tY " ,"due date :", now);
        }
       catch (Exception e)
       {
           System.err.println("Error");
       }
        System.out.printf("%s %tB %te, %<tY", "Due date:",now);
    }
}
