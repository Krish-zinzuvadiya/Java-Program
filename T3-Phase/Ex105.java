
/*
 * Aim :- Ask User To Create File 1 and enter 2 lines per for team India.
 *        Create Copy Of This File In File 2.
 *        Both File Names Will Be Entered By User.
 */
import java.io.*;
import java.util.Scanner;

public class Ex105 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("India.txt", "rw");
        System.out.println("Pointer = " + raf.getFilePointer());
        raf.writeInt(100);
        System.out.print("Pointer = " + raf.getFilePointer());
        raf.seek(0);
        System.out.println("Data = " + raf.readInt());
        raf.writeDouble(10.5);
        System.out.print("Pointer = " + raf.getFilePointer());
        raf.seek(4);
        System.out.println("Data = " + raf.readDouble());
        raf.writeUTF("hi java ");
        System.out.print("Pointer = " + raf.getFilePointer());
        raf.writeUTF("lj lju");
        System.out.print("Pointer = " + raf.getFilePointer());
        raf.seek(12);
        System.out.println("Data = " + raf.readUTF());
        System.out.println("Data = " + raf.readUTF());
        raf.seek(15);
        // System.out.println("data = "+raf.readUTF);
        System.out.println("Data = " + raf.readInt());
    }
}
