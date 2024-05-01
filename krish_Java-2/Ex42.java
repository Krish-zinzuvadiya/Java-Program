
/*
 *  date-24/04/24
 *  name- krish zinzuvadiya
 *  Aim - What if we call run() directly...
 */
public class Ex42 {
    public static void main(String[] args) {
        MyThread2 mt2 = new MyThread2(); // New State...
        mt2.start(); // Thread is ready to run, run() automatically called and runnable to running
                     // state.
        // mt2.run(); it works as normal methd, no thread mt2 will run.
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi Main " + i);
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi Run " + i);
        }
    }
}