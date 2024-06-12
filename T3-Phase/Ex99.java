
/*
 * Aim :- FileOutputStream
 */
import java.io.*;

public class Ex99 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("Election.txt");
        fos.write(98);
        String s = "Virat Kohli";
        fos.write(s.getBytes());
        fos.close();
    }
}
