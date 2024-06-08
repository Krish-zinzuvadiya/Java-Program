/*
 * Aim :- File Class
 */

import java.io.*;

public class Ex93 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("Test/Hi.txt");
        f1.createNewFile();
        System.out.println("Length of File = " + f1.length());
        System.out.println("Is File ? = " + f1.isFile());
        System.out.println("Absolute Path = " + f1.getAbsolutePath());
        System.out.println("Canonical Path = " + f1.getCanonicalPath());
        System.out.println("Path = " + f1.getPath());
        System.out.println("Name = " + f1.getName());
        System.out.println("Parent = " + f1.getParent());
        System.out.println("Car Read ? = " + f1.canRead());
        System.out.println("Car write ? = " + f1.canWrite());
        System.out.println("Car Execute ? = " + f1.canExecute());
        System.out.println("Last Modified = " + f1.lastModified());

        File f2 = new File("Test/Hi.txt");
        System.out.println("f1 Compare To Ff2  = " + f1.compareTo(f2));
        System.out.println("f1 Equals f2 = " + f1.equals(f2));
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println(f1.hashCode());
        System.out.println(f2.hashCode());

        File f3 = new File("Hii.txt");
        System.out.println("f1 equals f3 = " + f1.equals(f3));
        System.out.println("Length = " + f3.length());
        f3.createNewFile();
        System.out.println("f1 equals f3 = " + f1.equals(f3));

        File f4 = new File("FEE");
        f4.mkdir();
        System.out.println("Is File ? = " + f4.isFile());
        System.out.println("Is Directory ? = " + f4.isDirectory());
        System.out.println("Parent = " + f4.getParent());

        File f5 = new File("Maths/hello.txt");
        f5.mkdir();
    }
}
