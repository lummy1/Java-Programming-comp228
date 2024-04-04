package demo6b;

public class ThreadJoiningMethod extends Thread {
    public void run() {
        for (int i = 1; i <= 4; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        ThreadJoiningMethod th1 = new ThreadJoiningMethod();
        ThreadJoiningMethod th2 = new ThreadJoiningMethod();
        ThreadJoiningMethod th3 = new ThreadJoiningMethod();

        // Start th1
        System.out.println("STARTING th1......");
        System.out.println();
        th1.start();

        // Wait for th1 to complete
        try {
            th1.join();
            System.out.println("th1 DONE.");
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }

        // Start th2
        System.out.println("STARTING th2......");
        System.out.println();
        th2.start();

        // Wait for th2 to complete
        try {
            th2.join();
            System.out.println("th2 DONE.");
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }

        // Start th3
        System.out.println("STARTING th3.");
        System.out.println();
        th3.start();

        // Wait for th3 to complete
        try {
            th3.join();
            System.out.println("th3 DONE.");
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("ALL: th1, th2, and th3 DONE.");
    }
}
