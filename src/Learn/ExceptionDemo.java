package Learn;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            int i = 6;
            int j = 0;
            int k = i / j;
            System.out.println("out put is" + k);
        } catch (ArithmeticException e) {
            System.err.println("Error");

        }


    }
}
