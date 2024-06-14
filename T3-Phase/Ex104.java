
/*
 * Aim :- Ask User To Create File 1 and enter 2 lines per for team India.
 *        Create Copy Of This File In File 2.
 *        Both File Names Will Be Entered By User.
 */
import java.io.*;
import java.util.Scanner;

public class Ex104 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Line 1: ");
        String l1 = sc.nextLine();
        System.out.print("Enter Line 2: ");
        String l2 = sc.nextLine();
        System.out.print("Enter File 1: ");
        String f1 = sc.nextLine();

        FileWriter fw1 = new FileWriter(f1 + ".txt");
        fw1.write((l1 + "\n"));
        fw1.write(l2);
        fw1.close();

        // --> Read From File 1 And Write to File 2.
        System.out.print("Enter File 2: ");
        String f2 = sc.nextLine();
        System.out.print("Enter Word 1: ");
        String w1 = sc.nextLine();
        System.out.print("Enter Word 2: ");
        String w2 = sc.nextLine();
        FileReader fr = new FileReader(f1 + ".txt");
        FileWriter fw2 = new FileWriter(f2 + ".txt");

        BufferedReader br = new BufferedReader(fr);
        String data = br.readLine();
        while (data != null) {
            data = data.replace(w1, w2);
            fw2.write(data + "\n");
            data = br.readLine();
        }
        br.close();
        fr.close();
        fw2.close();
        br.close();
    }
}
