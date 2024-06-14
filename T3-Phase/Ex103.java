
/*
 * Aim :- Ask User To Create File 1 and enter 2 lines per for team India.
 *        Create Copy Of This File In File 2.
 *        Both File Names Will Be Entered By User.
 */
import java.io.*;
import java.util.Scanner;

public class Ex103 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Line 1: ");
        String l1 = sc.nextLine();
        System.out.print("Enter Line 2: ");
        String l2 = sc.nextLine();
        System.out.print("Enter File 1: ");
        String f1 = sc.nextLine();

        FileOutputStream fos1 = new FileOutputStream(f1 + ".txt");
        fos1.write((l1 + "\n").getBytes());
        fos1.write(l2.getBytes());
        fos1.close();

        // --> Read From File 1 And Write to File 2.
        System.out.print("Enter File 2: ");
        String f2 = sc.nextLine();
        FileInputStream fis1 = new FileInputStream(f1 + ".txt");
        FileOutputStream fos2 = new FileOutputStream(f2 + ".txt");

        int i = fis1.read();
        while (i != -1) {
            fos2.write(i);
            i = fis1.read();
        }
        fis1.close();
        fos2.close();
        sc.close();
    }
}
