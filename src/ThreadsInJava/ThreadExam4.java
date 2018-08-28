package ThreadsInJava;

public class ThreadExam4 extends Thread {
    public static void main(String[] args) {
        ThreadExam4 t1 = new ThreadExam4();
        ThreadExam4 t2 = new ThreadExam4();
        ThreadExam4 t3 = new ThreadExam4();
        t1.start();
        try {
            t1.join(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();

    }

    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(i);
        }
    }
}