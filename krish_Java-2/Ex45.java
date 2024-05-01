
/*
 *  date-24/04/24
 *  name- krish zinzuvadiya
 *  Aim - Can we overload run()---> YES...
 */
public class Ex45 {
    public static void main(String[] args) {
        MyThread5 mt5 = new MyThread5(); // New State...
        mt5.setName("Hello");
        mt5.start();
        mt5.run(10); // it work as normal method
        Thread t = Thread.currentThread();
        t.setName("Hii");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi Main " + i + " " + t.getName());
        }
    }
}

class MyThread5 extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi Run " + i + " " + t.getName());
        }
    }

    public void run(int a) {
        System.out.println(a);
    }
}