
/*
 * Aim :- Bridge Between FIleInputStream and InputStreamReader.
 */
import java.io.*;

public class Ex102 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Election.txt"); // -> Byte Stream.
        InputStreamReader isr = new InputStreamReader(fis); // --> Bridge.
        BufferedReader br = new BufferedReader(isr); // --> Character Stream.
        String line = br.readLine();
        System.out.println(line);
    }
}
