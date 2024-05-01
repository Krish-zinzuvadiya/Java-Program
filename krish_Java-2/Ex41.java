
/*
 *  date-20/04/24
 *  name- krish zinzuvadiya
 *  Aim - Thread
 */
public class Ex41 {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1(); // New State...
        mt1.start(); // Thread is ready to run, run() automatically called and runnable to running
                     // state.
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi Main " + i);
        }
    }
}

class MyThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi Run " + i);
        }
    }
}