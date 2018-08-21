package FileIO;

import java.io.FileOutputStream;

public class ByteOutputStream1 {
    public static void main(String[] args) {
        try{
            FileOutputStream f = new FileOutputStream("e:\\new\\writeStream.txt");
            String s = "This is a demo content of the         file ";
                    byte[] b = s.getBytes();
            f.write(b);
            f.close();
            System.out.println("Success");

        }catch (Exception e){
            System.err.println(e);

        }

    }
}
