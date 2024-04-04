package prt;

public class ThreadPriorityExample {
    public static void main(String[] args) {
        // Creating instances of Test class
        Test thrd1 = new Test();
        Test thrd2 = new Test();
        Test thrd3 = new Test();

        // Setting priorities for threads
        thrd1.setPriority(Thread.MIN_PRIORITY); // Lowest priority
        thrd2.setPriority(Thread.NORM_PRIORITY); // Default priority
        thrd3.setPriority(Thread.MAX_PRIORITY); // Highest priority

        // Starting threads
        thrd1.start();
        thrd2.start();
        thrd3.start();
    }
}

class Test extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getId() + " Value- " + Thread.currentThread().getPriority());
    }
}
