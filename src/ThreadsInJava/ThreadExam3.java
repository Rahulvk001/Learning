package ThreadsInJava;

public class ThreadExam3 extends Thread {
    public static void main(String[] args) {
        ThreadExam3 t1 = new ThreadExam3();
        ThreadExam3 t2 = new ThreadExam3();
        t1.start();
        t2.start();
    }

    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
