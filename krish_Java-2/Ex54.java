/*
 *  date-30/04/24
 *  name- krish zinzuvadiya
 *  Aim - wait() & notify()...
 */
public class Ex54 {
    public static void main(String[] args) {
        Dominoz d = new Dominoz();
        Chef rishi = new Chef("Rishi", d);
        Customer raj = new Customer("Raj", d);

        rishi.start();
        raj.start();
    }
}

class Dominoz {
    int order;
    boolean isReady = false;

    synchronized void prepare(int newOrder) {
        while (isReady) {
            try {
                wait();
            } catch (Exception e) {

            }
        }
        order = newOrder;
        isReady = true;
        System.out.println("pizza Ready of order..: " + order);
        notify();
    }

    synchronized void eat() {
        while (!isReady) {
            try {
                wait();
            } catch (Exception e) {

            }
        }
        System.out.println("Taking order...: " + order);
        isReady = false;
        notify();
    }
}

class Chef extends Thread {
    Dominoz d;

    public Chef(String name, Dominoz d) {
        super(name);
        this.d = d;
    }

    public void run() {
        synchronized (d) {
            Thread t = Thread.currentThread();
            for (int i = 111; i <= 115; i++) {
                System.out.println("Order " + i + " Starts Preparing By. " + t.getName());
                d.prepare(i);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Customer extends Thread {
    Dominoz d;

    public Customer(String name, Dominoz d) {
        super(name);
        this.d = d;
    }

    public void run() {
        synchronized (d) {
            Thread t = Thread.currentThread();
            for (int i = 111; i <= 115; i++) {
                System.out.println("Order " + i + " Starts Taking By. " + t.getName());
                d.eat();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
