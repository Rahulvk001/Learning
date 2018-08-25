package FileIO;


import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsole {
    public static void main(String[] args) throws IOException {
        try (InputStreamReader cin = new InputStreamReader(System.in)) {
            System.out.println("Enter, q to quit.");
            char c;
            do {
                c = (char) cin.read();
                System.out.print(c);

            } while (c != 'q');
        }

    }
}
