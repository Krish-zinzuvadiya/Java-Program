
/*
 *  date-24/04/24
 *  name- krish zinzuvadiya
 *  Aim - Its ipl match No.10 Between MI & CSK 
 *        create thread class batsman
 *          -Batsman will play six balls 
 *          -If batsman is rohit then, print Six in each ball...
 *          -If batsman is rohit then, print Four in each ball...
 */
public class Ex49 {
    public static void main(String[] args) {
        Batsman n1 = new Batsman("rohit");
        n1.start();
        Batsman n2 = new Batsman("hardik");
        n2.start();
    }
}

class Batsman extends Thread {
    Batsman() {

    }

    Batsman(String name) {

    }

    public void run() {
        Thread t = Thread.currentThread();
        // t.getName(name);
        for (int i = 1; i <= 6; i++) {
            if (t.getName().equalsIgnoreCase("rohit")) {
                System.out.println("on" + i + "th ball" + "hits 6" + t.getName());
            } else if (t.getName().equalsIgnoreCase("hardik")) {
                System.out.println("on" + i + "th ball" + "hits 4" + t.getName());
            } else {
                System.out.println("Dot ball.");
            }
        }
    }
}
