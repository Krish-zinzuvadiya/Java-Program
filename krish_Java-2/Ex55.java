/*
 *  date-30/04/24
 *  name- krish zinzuvadiya
 *  Aim -   
 */
public class Ex55 {
    public static void main(String[] args) {
        Table t = new Table();
        Table20 t1 = new Table20(t);
        Table300 t2 = new Table300(t);

        t1.start();
        t2.start();
    }
}

class Table {
    synchronized void printTable(int n) {
        Thread t = Thread.currentThread();
        System.out.println("Table Printing Start for... : " + n);

        for (int i = 1; i <= 5; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Table Printing Completed For... : " + n);
    }
}

class Table20 extends Thread {
    Table t;

    Table20(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(20);
    }
}

class Table300 extends Thread {
    Table t;

    Table300(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(300);
    }
}