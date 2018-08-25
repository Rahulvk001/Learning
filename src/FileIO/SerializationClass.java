package FileIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationClass {
    public static void main(String[] args) {
        Emp emp = new Emp();
        emp.name = "Rahul";
        emp.address = "Kerala";

        try {
            FileOutputStream fileout = new FileOutputStream("E:\\Files\\Chat.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(emp);
            out.close();
            fileout.close();
            System.out.println("Serialized data is saved in Char.txt file");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
