package demo8;

// Multithreading Demo8: The driver class
// TaskExecutor.java
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.security.SecureRandom;

class TaskExecutor {
    public static void main(String[] args) {
        // Create and name each runnable
        PrintTask task1 = new PrintTask("task1");
        PrintTask task2 = new PrintTask("task2");
        PrintTask task3 = new PrintTask("task3");

        System.out.println("Starting Executor");

        // Create ExecutorService to manage threads
        ExecutorService executorService = Executors.newCachedThreadPool();

        // Start the three PrintTasks
        executorService.execute(task1); // Start task1
        executorService.execute(task2); // Start task2
        executorService.execute(task3); // Start task3

        // Shut down ExecutorService--it decides when to shut down threads
        executorService.shutdown();

        System.out.printf("Tasks started, main ends.%n%n");
    }
}

// Multithreading Demo8: The PrintTask class
// PrintTask.java

public class PrintTask implements Runnable {
    private final static SecureRandom generator = new SecureRandom();
    private final int sleepTime; // random sleep time for thread
    private final String taskName; // name of task

    // constructor
    public PrintTask(String taskName) {
        this.taskName = taskName;
        // pick random sleep time between 0 and 5 seconds
        sleepTime = generator.nextInt(5000); // milliseconds
    }

    // method run contains the code that a thread will execute
    public void run() {
        try { // put thread to sleep for sleepTime amount of time
            System.out.printf("%s going to sleep for %d milliseconds.%n",
                    taskName, sleepTime);
            Thread.sleep(sleepTime); // put thread to sleep
        } catch (InterruptedException exception) {
            exception.printStackTrace();
            Thread.currentThread().interrupt(); // re-interrupt the thread
        }
        // print task name
        System.out.printf("%s done sleeping%n", taskName);
    }
}
