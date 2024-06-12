
/*
 * Aim :- FileWriter
 */
import java.io.*;

public class Ex95 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("ICC.txt");
        fw.write(100);
        fw.write("Today Watch India Vs Usa \n");
        char c[] = { 'x', 'y', 'z' };
        fw.write(c);
        fw.close();
    }
}
