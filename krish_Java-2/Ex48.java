
/*
 *  date-24/04/24
 *  name- krish zinzuvadiya
 *  Aim - Create thread class with name number.
 *      - It uase to print numbers from 1 to 10.
 *      - Create 2 object of number class with name 'ODD' & 'EVEN'.
 *      -  The Odd object prints the odd values and Even object prints even values.
 */
public class Ex48 {
    public static void main(String[] args) {
        Number n1 = new Number("ODD");
        n1.start();
        Number n2 = new Number("EVEN");
        n2.start();
    }
}

class Number extends Thread {
    Number() {

    }

    Number(String name) {
        super(name);
    }

    public void run() {

        Thread t = Thread.currentThread();
        for (int i = 1; i <= 10; i++) {
            if (t.getName().equalsIgnoreCase("odd")) {
                if (i % 2 != 0) {
                    System.out.println("---> " + getName() + " " + t);
                }
            }
            if (t.getName().equalsIgnoreCase("even")) {
                if (i % 2 == 0) {
                    System.out.println("---> " + getName() + " " + t);
                }
            }
        }
    }
}