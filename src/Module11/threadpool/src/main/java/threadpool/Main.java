package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // Create a thread pool with 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Submit tasks to the thread pool
        for (int i = 0; i < 10; i++) {
            Runnable task = new MyTask(i);
            executor.submit(task);
        }

        // Shutdown the thread pool when all tasks are completed
        executor.shutdown();
    }
}

class MyTask implements Runnable {
    private int taskId;

    public MyTask(int taskId) {
        this.taskId = taskId;
    }

    public void run() {
        System.out.println("Task " + taskId + " executed by thread: " + Thread.currentThread().getName());
    }
}
