/*
Date:-26/03/2024
Name:-Krish Zinzuvadiya
AIM :- Ask user to enter value then throw NullPointerException if value > 10 
       throw ArithmeticException if value < 10 
       if value is 10 then print correct value.

       It is used to throw custom or In-built exception
       try...finally

       [Topic--->Custom Exception]
*/

import java.util.Scanner;

class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value.");
        int n =sc.nextInt();
        try{
            if(n>10){
                throw new D6Exception("Enter 10.");
            } else if(n<10){
                throw new D10Exception("Enter 10.");       
            } else {
                System.out.println("Correct value :"+n);
            }
        } catch(D6Exception e){
            System.out.println(e);
        } catch(D10Exception e){
            System.out.println(e);
        } finally {
            System.out.println("Hi Finally.");
            System.exit(0);
        }
    }
}
class D6Exception extends RuntimeException {
    D6Exception(String s){
        super(s);
    }
}
class D10Exception extends RuntimeException {
    D10Exception(String s){
        super(s);
    }
}