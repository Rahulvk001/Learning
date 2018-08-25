package FileIO;

import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        try {
            FileWriter out = new FileWriter("e:\\Files\\Chat.txt");
            out.write("I am a java programmer\t" +
                    "I am pro learner");
            System.out.println("Success");
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
