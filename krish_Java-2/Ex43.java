
/*
 *  date-24/04/24
 *  name- krish zinzuvadiya
 *  Aim - Thread.cuttentThread().
 */
public class Ex43 {
    public static void main(String[] args) {
        MyThread3 mt3 = new MyThread3(); // New State...
        mt3.start();
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi Main " + i + " " + t);
        }
    }
}

class MyThread3 extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi Run " + i + " " + t);
        }
    }
}