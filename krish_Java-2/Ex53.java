public class Ex53 {
    public static void main(String[] args) throws InterruptedException {
        Pvr p = new Pvr();
        BookingUser manthan = new BookingUser("Manthan", p, 30);
        BookingUser het = new BookingUser("Het", p, 35);
        manthan.start();
        // manthan.join();
        het.start();
        // het.join();
        CancelBookingUser Ary = new CancelBookingUser("Ary", p, 15);
        Ary.start();
    }
}

class Pvr {
    int seats = 50;

    synchronized void booking(int n) {
        Thread t = Thread.currentThread();
        if (seats >= n) {

            System.out.println(n + " Tickets Booking succesful by..:- " + t.getName());
            seats -= n;
            System.out.println("Total available :- " + seats);
        } else {
            System.out.println("No Tickets Are Available For... " + t.getName());
        }
    }

    synchronized void cancelBooking(int n) {
        Thread t = Thread.currentThread();
        if ((seats + n) < 50) {
            System.out.println(n + " Cancel Tickets Succesfull By User...:- " + t.getName());
            seats += n;
            System.out.println("Available Tickets :- " + seats);
        } else {
            System.out.println("Cancel Tickets Not Succesfull By User...:- " + t.getName());
        }
    }

}

class BookingUser extends Thread {
    Pvr p;
    int seats = 50;
    int n;

    public BookingUser(String name, Pvr p, int n) {
        super(name);
        this.p = p;
        this.n = n;
    }

    public void run() {
        synchronized (p) {
            Thread t = Thread.currentThread();
            System.out.println("Booking Status by..." + t.getName());
            p.booking(n);
        }
    }
}

class CancelBookingUser extends Thread {
    Pvr p;
    int seats = 50;
    int n;

    public CancelBookingUser(String name, Pvr p, int n) {
        super(name);
        this.p = p;
        this.n = n;
    }

    public void run() {
        synchronized (p) {
            Thread t = Thread.currentThread();
            System.out.println("Canceling Booking Status by..." + t.getName());
            p.cancelBooking(n);
        }
    }
}