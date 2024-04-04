package mult2;
//The first class

class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;

    ThreadDemo(String name) {
        threadName = name;
    }

    public void run() {
        System.out.println("\nRunning " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("\nThread: " + threadName + ", " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("\nThread: " + threadName + " interrupted.");
        }
        System.out.println("\nThread: " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("\nStarting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

// Multithreading Demo 2: The driver class
public class TestThread {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ThreadDemo T1 = new ThreadDemo("Thread-1");
        T1.start();
        ThreadDemo T2 = new ThreadDemo("Thread-2");
        T2.start();
    }
}
