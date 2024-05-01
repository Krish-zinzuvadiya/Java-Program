
/*
 *  date-24/04/24
 *  name- krish zinzuvadiya
 *  Aim - setName(String name)
 *        getName()
 */
public class Ex44 {
    public static void main(String[] args) {
        MyThread4 mt4 = new MyThread4(); // New State...
        mt4.setName("Hello");
        mt4.start();
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi Main " + i + " " + t);
        }
    }
}

class MyThread4 extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi Run " + i + " " + t.getName());
        }
    }
}