package ThreadsInJava;

class Thread1 extends Thread {
    public void run() {
        System.out.println("This is Thread 1 ");
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println("This is Thread 2 ");
    }
}

public class MainThread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();

        t2.start();

    }
}
