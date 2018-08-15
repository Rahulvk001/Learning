package Learn;

import java.util.regex.Pattern;

public class RegexExample3 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[RS][a-z]{4}", "Rahul"));
        System.out.println(Pattern.matches("[RS][a-z]{4}", "Sunil"));
        System.out.println(Pattern.matches("[RS][a-z]{4}", "Monica")+"\n");

        System.out.println(Pattern.matches("[xyz]?","x"));
        System.out.println(Pattern.matches("[xyz]?","xx")+"\n");

        System.out.println(Pattern.matches("[xyz]+", "x"));
        System.out.println(Pattern.matches("[abc]+", "bacccccab")+"\n");


    }
}
