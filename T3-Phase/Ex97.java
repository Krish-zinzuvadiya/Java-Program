
/*
 * Aim :- FileReader
 * Read File Using int read(char c[])
 */
import java.io.*;

public class Ex97 {
    public static void main(String[] args) throws IOException {
        File f = new File("ICC.txt");
        FileReader fr = new FileReader(f);
        char c[] = new char[(int) f.length()];
        fr.read(c);
        for (char c1 : c) {
            System.out.print(c1);
        }
    }
}
