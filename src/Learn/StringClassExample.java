package Learn;

public class StringClassExample {
    public static void main(String[] args) {
        String a = "My name is Rahul";
        System.out.println(a);
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(5) + "\n");

        String str1 = "i love";
        String str2 = "programming";
        String str3 = "in Java";
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.equalsIgnoreCase(str3) + "\n");

        String str4 = new String("Its ok");
        String str5 = new String("Its ok");
        System.out.println(str1.contentEquals(str2));
        System.out.println(str5.contentEquals(str4) + "\n");

        String s1 = "Hi";
        System.out.println(s1.concat(" rahul") + "\n");

        char[] list1 = {'h', 'e', 'l', 'l', 'o'};
        String list2 = "";
        System.out.println(list2.copyValueOf(list1));
        System.out.println(list2.copyValueOf(list1, 1, 3));
        System.out.println(str1.endsWith("love"));
        System.out.println(s1.length());
        System.out.println(str1.replace('v', 'e') + "\n");

        String Str = new String("Welcome to programming");
        String Substr = new String(("WORLD"));
        System.out.println("Found Index : " + Str.indexOf(Substr));

        float f1 = 10.33f;
        int i1 = 20;
        String st1 = "Elon Musk";

              String fs;
              fs = String.format("The value of the float variable is" +
                      "%f, while the value of the integer " +
                      "variable is %d, and the string "+
                      "is %s", f1,i1,st1);
        System.out.format(fs);

    }
}


