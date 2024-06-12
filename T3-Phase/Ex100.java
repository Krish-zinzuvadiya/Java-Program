
/*
 * Aim :- FileInputStream
 */
import java.io.*;

public class Ex100 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Election.txt");
        int i = fis.read();
        while (i != -1) {
            System.out.print((char) i);
            i = fis.read();
        }
    }
}
