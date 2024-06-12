/*
 * Aim :- Create A folder FEE, create A file Example.txt
 * ------>Create a folder Inside FEE Mid-sem and also create Result.txt
 * ------> And Calculate no. of Files in FEE.
 */

import java.io.*;

public class Ex94 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("FEE");
        f1.mkdir();
        File f2 = new File("FEE/Example.txt");
        File f3 = new File("FEE/Result.txt");
        f2.createNewFile();
        f3.createNewFile();
        File f4 = new File("FEE/Mid-sem");
        f4.mkdir();

        // Calculate no. of Files in FEE.
        int cntf = 0;
        int cntd = 0;
        File f[] = f1.listFiles();
        for (File f5 : f) {
            if (f5.isFile()) {
                System.out.println(f5.getName() + " Is File.");
                cntf++;
            }
            if (f5.isDirectory()) {
                System.out.println(f5.getName() + " Is Directory.");
                cntd++;
            }
        }
        System.out.println("Total File = " + cntf);
        System.out.println("Total Directory = " + cntd);
    }
}
