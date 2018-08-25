package FileIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationClass {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Emp emp = null;
        try {
            FileInputStream fileIn = new FileInputStream("E:\\Files\\Chat.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            emp = (Emp) in.readObject();
            in.close();
            fileIn.close();
        } finally {
            System.out.println("Name = " + emp.name);
            System.out.println("Address = " + emp.address);
        }
    }
}
