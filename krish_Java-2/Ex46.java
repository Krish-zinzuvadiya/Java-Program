
/*
 *  date-24/04/24
 *  name- krish zinzuvadiya
 *  Aim - Can we override start()---> YES 
 */
public class Ex46 {
    public static void main(String[] args) {
        MyThread6 mt6 = new MyThread6(); // New State...
        mt6.setName("Hello");
        mt6.start();
        Thread t = Thread.currentThread();
        t.setName("Hii");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi Main " + i + " " + t.getName());
        }
    }
}

class MyThread6 extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi Run " + i + " " + t.getName());
        }
    }

    public void start() {
        super.start();
        System.out.println("Hi Start.");
    }
}