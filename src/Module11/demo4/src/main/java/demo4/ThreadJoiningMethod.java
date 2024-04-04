package demo4;

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

        th1.start();
        try {
            th1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        th2.start();
        th3.start();
    }
}
