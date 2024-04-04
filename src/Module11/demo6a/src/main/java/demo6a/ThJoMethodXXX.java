package demo6a;

public class ThJoMethodXXX extends Thread {
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
        ThJoMethodXXX th1 = new ThJoMethodXXX();
        ThJoMethodXXX th2 = new ThJoMethodXXX();
        ThJoMethodXXX th3 = new ThJoMethodXXX();

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
