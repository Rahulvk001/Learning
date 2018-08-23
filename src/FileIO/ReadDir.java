package FileIO;

import java.io.File;

public class ReadDir {
    public static void main(String[] args) {
        String[] paths;
        try {
            File file = new File("E:\\Directory");
            paths = file.list();
            for (String path : paths) {
                System.out.println(path);
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
