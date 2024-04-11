package runnabledemo;

class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    RunnableDemo(String name) {
        threadName = name;
        System.out.println("\nCreating " + threadName);
    }

    public void run() {
        System.out.println("\nRunning " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("\nThread: " + threadName + ", " +
                        i);
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

// Multithreading Demo 1:The driver class
public class TestThread {
    /**
     * @param args
     */
    public static void main(String[] args) {
        RunnableDemo T1 = new RunnableDemo("Thread-1");
        T1.start();
        RunnableDemo T2 = new RunnableDemo("Thread-2");
        T2.start();
    }
}
