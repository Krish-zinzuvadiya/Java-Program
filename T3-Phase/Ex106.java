
/*
 * Aim :- Create A file with stores 2 digit Integer numbers
 *        User Is going to enter 5 Integer.
 *        Create a new File Which Stores all these integers number in sorted form.
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex106 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The File Name:- ");
        String f1 = sc.nextLine();

        FileWriter fw = new FileWriter(f1 + ".txt");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Inetger Name : ");
            int ch = sc.nextInt();
            fw.write(ch + "\n");
        }
        fw.close();

        ArrayList<Integer> al = new ArrayList<>();
        FileReader fr = new FileReader(f1 + ".txt");
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        while (line != null) {
            al.add(Integer.parseInt(line));
            line = br.readLine();
        }
        System.out.println(al);
        Collections.sort(al);
        br.close();
        fr.close();
        sc.nextLine();
        System.out.print("Enter The File Name:- ");
        String f2 = sc.nextLine();
        FileWriter fw2 = new FileWriter(f2 + ".txt");

        for (Integer i : al) {
            fw2.write(i + "\n");
        }
        fw2.close();
    }
}
