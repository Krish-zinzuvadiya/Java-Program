/*
Date:-26/03/2024
Name:-Krish Zinzuvadiya
AIM :- Ask user to enter value then throw NullPointerException if value > 10 
       throw ArithmeticException if value < 10 
       if value is 10 then print correct value.

       It is used to throw custom or In-built exception
       try...finally
*/

import java.util.Scanner;

class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value.");
        int n =sc.nextInt();
        try{
            if(n>10){
                throw new NullPointerException("Enter 10.");
            } else if(n<10){
                throw new ArithmeticException();       
            } else {
                System.out.println("Correct value :"+n);
            }
        } catch(NullPointerException e){
            System.out.println(e);
        } catch(ArithmeticException e){
            System.out.println(e);
        } finally {
            System.out.println("Hi Finally.");
            System.exit(0);
        }
    }
}
