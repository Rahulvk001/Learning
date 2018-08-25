package FileIO;

import java.io.File;

public class CreateDir {
    public static void main(String[] args) {
        File f1 = new File("E:\\Directory");
        if (!f1.exists()) {
            if (f1.mkdir()) {
                System.out.println("Directory is Created");
            } else {
                System.out.println("Filed to create directory");
            }
            String dirname = "E:\\Directory\\Sub1\\New file";
            File f2 = new File(dirname);
            f2.mkdirs();

        }


    }
}
