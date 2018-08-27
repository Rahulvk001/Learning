package ThreadsInJava;

public class MainThread2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("Thread 1"));
        Thread r2 = new Thread(() -> System.out.println("Thread 2"));

        t1.start();
        t1.setPriority(10);
        r2.start();

    }
}
