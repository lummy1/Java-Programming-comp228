package demo5;

// Multithreading Demo5: The first class
class Output {
    public synchronized void print(String s) {
        System.out.println(s);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Multithreading Demo5: The second class
class Library extends Thread {
    Output output;

    public Library(Output output) {
        this.output = output;
    }

    public void run() {
        output.print("Printing from the library.");
    }
}

// Multithreading Demo5: The third class
class Classroom extends Thread {
    Output output;

    public Classroom(Output output) {
        this.output = output;
    }

    public void run() {
        output.print("Printing from the classroom.");
    }
}

// Multithreading Demo5: The driver class
class TestMultSync {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Output output = new Output();
        Library lib = new Library(output);
        Classroom clr = new Classroom(output);
        lib.start();
        clr.start();
    }
}

// Multithreading Demo6a: The driver class: The only class
class ThJoMethodXXX extends Thread {
}
