package Learn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {
   // 1st way
    public static void main(String[] args) {
        Pattern p = Pattern.compile("..m");
        Matcher m = p.matcher("aim");
        boolean b = m.matches();
        System.out.println(b);

        //2nd way
       boolean b2 = Pattern.compile(".m").matcher("monica").matches();
        System.out.println(b2);

        //3rd way
        boolean b3 = Pattern.matches("m", "am");
        System.out.println(b3);
    }
}
