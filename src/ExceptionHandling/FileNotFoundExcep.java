package ExceptionHandling;
import java.io.*;
import java.io.IOException;

public class FileNotFoundExcep {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream io =new FileInputStream("E:/sample/WelcomeExcep.txt");
            int i;
            while ((i=io.read())!=-1){
                System.out.println((char)i);
            }
        }catch (FileNotFoundException e){             \\ For handling the exceptions
            System.out.println(e);
        }
    }
}
