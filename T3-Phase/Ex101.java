
/*
 * Aim :- InputStreamReader
 */
import java.io.*;

public class Ex101 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter Request :- ");
        String data = br.readLine();
        System.out.println("Data : " + data);
    }
}
