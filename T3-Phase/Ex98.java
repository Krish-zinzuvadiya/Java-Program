
/*
 * Aim :- FileReader & FileWriter
 * 
 */
import java.io.*;
import java.util.Scanner;

public class Ex98 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Player Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Strike-rate: ");
        double sr = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter File-Name: ");
        String fn = sc.nextLine();

        FileWriter fw = new FileWriter(fn + ".txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("PlayeName :- " + name + " ");
        bw.newLine();
        bw.write("Age :- " + age + " ");
        bw.newLine();
        bw.write("Strike-rate :- " + sr + " ");
        bw.close();
        fw.close();

        // Read From File.

        FileReader fr = new FileReader(fn + ".txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while (line != null) {
            System.out.print(line);
            line = br.readLine();
        }
        br.close();
        fr.close();
        sc.close();
    }
}
