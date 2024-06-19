
/*
 * Aim :- Restaurant Food Coupon
 */
import java.util.*;
import java.io.*;

public class Ex110 {
    Scanner sc = new Scanner(System.in);
    ArrayList<Restaurant> restaurants = new ArrayList<>();
    File f = new File("Coupon.txt");

    // ->At New Restaurant Information To Coupon.txt In Append mode.
    void addRestaurant() throws IOException {
        System.out.print("Enter Name:- ");
        String name = sc.nextLine();
        System.out.print("Enter Price:- ");
        double price = sc.nextDouble();
        System.out.print("Enter Offer:- ");
        int offer = sc.nextInt();
        sc.nextLine();

        Restaurant r = new Restaurant(name, price, offer);
        FileWriter fw = new FileWriter(f, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();
        bw.write(r.name + "-" + r.price + "-" + r.offer + "-" + r.total);
        bw.close();
        fw.close();
    }

    void readAllData() throws IOException {
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while (line != null) {
            String data[] = line.split("-");
            String name = data[0];
            double price = Double.parseDouble(data[1]);
            int offer = Integer.parseInt(data[2]);
            Restaurant r = new Restaurant(name, price, offer);
            restaurants.add(r);
            line = br.readLine();
        }
        br.close();
        fr.close();
        System.out.println("-------------------------------------------------------");
        System.out.println(restaurants + "\n");
    }

    /*
     * Ask User To Enter His/Her Name And Budget We Will Find Out Restaurant With
     * Total,
     * Lessthan or Equal To Budget And Add To The Final ArrayList.
     * Then Sort It And Write It In User.txt file....
     */

    void sortAsPerReq() throws IOException {
        ArrayList<Restaurant> finallist = new ArrayList<>();
        System.out.print("Enter Your Budget:- ");
        double budget = sc.nextDouble();
        sc.nextLine();
        for (Restaurant r : restaurants) {
            if (r.total <= budget) {
                finallist.add(r);
            }
        }

        // ->Sort arraylist as per total...
        Collections.sort(finallist, Comparator.comparing(Restaurant::getTotal));
        System.out.print("Enter User Name:- ");
        String user = sc.nextLine();

        File f = new File(user + ".txt");

        int Count = 0;
        if (f.exists()) {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            if (line != null) {
                Count = Integer.parseInt(line.split(": ")[0]);
            }
            br.close();
            fr.close();
        }
        Count++;

        FileWriter fw = new FileWriter(user + ".txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Inquiry Count:- " + Count);
        bw.newLine();
        bw.write("Client Name:- " + user);
        bw.newLine();
        bw.write("Budget:- " + budget);
        bw.newLine();

        bw.write("-----Available Restaurants-----");
        bw.newLine();
        if (finallist.isEmpty()) {
            bw.write("Sorry, Budget Is Not Enough For Any Restaurant");
            bw.newLine();
        } else {
            for (Restaurant r : finallist) {
                bw.write(r.name + "-" + r.price + "-" + r.offer + "-" + r.total);
                bw.newLine();
            }
        }
        bw.close();
        fw.close();
    }

    // --> Main method for Code Execution...
    public static void main(String[] args) throws IOException {
        Ex110 ex = new Ex110();
        // ex.addRestaurant();
        ex.readAllData();
        ex.sortAsPerReq();
        System.out.println("Thank You For Using Our Program.");
    }
}

class Restaurant {
    String name;
    double price;
    int offer;
    double total;

    public Restaurant(String name, double price, int offer) {
        this.name = name;
        this.price = price;
        this.offer = offer;
        this.total = price - ((price * offer) / 100);
    }

    double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Restaurant [name=" + name + ", price=" + price + ", offer=" + offer + ", total=" + total + "]";
    }
}