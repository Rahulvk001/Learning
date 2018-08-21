package FileIO;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try {
            FileReader in = new FileReader("e:\\Files\\Employees.java");
            int i;
            while ((i = in.read()) != -1) {
                System.out.print((char) i);
            }
            in.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
