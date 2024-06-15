
/*
 * Aim :- Copy Img From One Location To Another.
 */
import java.io.*;

public class Ex108 {
    public static void main(String[] args) throws IOException {
        // --> Read Image File(Copy)
        File f = new File("d:/Java/lj.png");
        FileInputStream fis = new FileInputStream(f);
        FileOutputStream fos = new FileOutputStream("d:/Java/GTU.png");

        int i = fis.read();
        while (i != -1) {
            fos.write(i);
            i = fis.read();
        }
    }
}
