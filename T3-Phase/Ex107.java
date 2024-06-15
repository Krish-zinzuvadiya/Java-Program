
/*
 * Aim :- Copy Img From One Location To Another.
 */
import java.io.*;

public class Ex107 {
    public static void main(String[] args) throws IOException {
        // --> Read Image File(Copy)
        File f = new File("d:/Java/lj.png");
        FileInputStream fis = new FileInputStream(f);
        byte b[] = new byte[(int) f.length()];
        fis.read(b);
        fis.close();

        // --> Write Data To Another File...
        FileOutputStream fos = new FileOutputStream("d:/Java/lju.png");
        fos.write(b);
        fos.close();
    }
}
