package Learn;

import java.util.Date;

public class TimeDelay {
    public static void main(String[] args) {
        try {
            for (int i=1;i<6;){
                System.out.println(new Date()+"\n");
                Thread.sleep(1000);
                i++;

            }

        }
        catch (Exception e){
            System.out.println();

        }
    }
}
