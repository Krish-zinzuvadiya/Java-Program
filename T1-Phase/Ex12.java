/*
Date:-20/03/2024
Name:-Krish Zinzuvadiya
AIM :-Exception "Handling
    ArithmeticException
*/
import java.util.Scanner;
class Ex12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value Of A");
        int a=sc.nextInt();
        System.out.println("Enter Value Of B");
        int b=sc.nextInt();
        int c;
        try {
            c=a/b;
            System.out.println("Ans :"+c);
        } catch (ArithmeticException e) {
            System.out.println("Please Do not Enter 0 in Second Value");
            System.out.println(e);
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
        System.out.println("Bye Bye");
    }
}