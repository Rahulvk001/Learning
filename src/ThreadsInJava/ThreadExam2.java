package ThreadsInJava;

public class ThreadExam2 implements Runnable {
    public static void main(String[] args) {
        ThreadExam2 threadExam2 = new ThreadExam2();
        Thread t1 = new Thread(threadExam2);
        System.out.println(t1.getName());
        t1.setName("RAHUL");
        System.out.println(t1.getName());
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
    }

    public void run() {
        System.out.println("Thread is running");
    }
}
