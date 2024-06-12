
/*
 * Aim :- FileReader
 * Read File Using int read()
 */
import java.io.*;

public class Ex96 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("ICC.txt");
        int i = fr.read();
        while (i != -1) {
            System.out.print((char) i);
            i = fr.read();
        }
    }
}
