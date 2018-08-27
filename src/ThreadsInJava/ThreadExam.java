package ThreadsInJava;

public class ThreadExam extends Thread {
    public static void main(String[] args) {
        ThreadExam thread1 = new ThreadExam();
        thread1.start();
    }

    public void run() {
        System.out.println("Thread is running");
    }
}
