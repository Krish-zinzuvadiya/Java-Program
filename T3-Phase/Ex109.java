
/*
 * Aim :- Ask User-1 To Enter For 5 Best Places Of India.
 *        Ask User-2 To Enter For 5 Best Places Of India.
 * ---> Store This Data In File user-1.txt and user-2.txt respectively...
 * ---> Merge Both Data By Bringing Out From Both Files...
 * ---> Create A File Final Places.txt With All Unique Places Data In Sorted Order....
 */
import java.io.*;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;

public class Ex109 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File user1 = new File("user1.txt");
        File user2 = new File("user2.txt");

        FileWriter fw1 = new FileWriter(user1);
        BufferedWriter bw1 = new BufferedWriter(fw1);
        for (int i = 1; i <= 5; i++) {
            System.out.print("User-1: Enter Places " + i + " = ");
            String place = sc.nextLine();
            bw1.write(place);
            bw1.newLine();
        }
        bw1.close();
        fw1.close();

        FileWriter fw2 = new FileWriter(user2);
        BufferedWriter bw2 = new BufferedWriter(fw2);
        for (int i = 1; i <= 5; i++) {
            System.out.print("User-2: Enter Places " + i + " = ");
            String place = sc.nextLine();
            bw2.write(place);
            bw2.newLine();
        }
        bw2.close();
        fw2.close();

        // --> Read From The Both Files And Create List Of Them....
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        // --> Read From User1 and Store To List1...
        FileReader fr1 = new FileReader(user1);
        BufferedReader br1 = new BufferedReader(fr1);
        String line1 = br1.readLine();
        while (line1 != null) {
            list1.add(line1);
            line1 = br1.readLine();
        }
        System.out.println("User-1 = " + list1);
        br1.close();
        fr1.close();

        // --> Read From User2 and Store To List2...
        FileReader fr2 = new FileReader(user2);
        BufferedReader br2 = new BufferedReader(fr2);
        String line2 = br2.readLine();
        while (line2 != null) {
            list2.add(line2);
            line2 = br1.readLine();
        }
        System.out.println("User-1 = " + list2);
        br2.close();
        fr2.close();

        // --> Add Both List In HashSet...
        HashSet<String> final1 = new HashSet<>();
        final1.addAll(list1);
        final1.addAll(list2);

        ArrayList<String> FinalList = new ArrayList<>(final1);
        Collections.sort(FinalList);

        // --> Now Writing Sorted List To Final Places.txt...
        FileWriter fw3 = new FileWriter("Final Places.txt");
        BufferedWriter bw3 = new BufferedWriter(fw3);
        for (String s : FinalList) {
            bw3.write(s);
            bw3.newLine();
        }
        bw3.close();
        fw3.close();
    }
}
