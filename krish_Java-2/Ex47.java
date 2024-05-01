
/*
 *  date-24/04/24
 *  name- krish zinzuvadiya
 *  Aim - Constructor Of Thread class... [Multi-Threading]
 */
public class Ex47 {
    public static void main(String[] args) {
        MyThread7 mt7 = new MyThread7(); // New State...
        mt7.setName("Hello");
        mt7.start();
        MyThread7 mt12 = new MyThread7("hi");
        mt12.start();
        Thread t = Thread.currentThread();
        t.setName("Hii");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi Main " + i + " " + t.getName());
        }
    }
}

class MyThread7 extends Thread {
    MyThread7() {

    }

    MyThread7(String s) {
        super(s);
    }

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