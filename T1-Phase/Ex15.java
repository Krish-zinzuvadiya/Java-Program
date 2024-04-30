/*
Date:-23/03/2024
Name:-Krish Zinzuvadiya
AIM :- Nested try-catch.
*/
import java.util.InputMismatchException;
import java.util.Scanner;

class Ex15 {
        public String toString(){
            return "krish";
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p[]={10,8,3,0,4};
        Ex15 x = new Ex15();
        System.out.println(x);
        try {
            System.out.print("Enter value of A: ");
            int a = sc.nextInt();
            System.out.print("Enter value of B: ");
            int b = sc.nextInt();
            try{
            int ans = p[a] / p[b];
            System.out.println("Answer:- "+ans); 
        } catch(ArithmeticException e){
            System.out.println("enter valid."+e);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("enter valid index."+e);
        } catch(Exception e){
            System.out.println("enter valid index"+e);
        }
    }
    catch(InputMismatchException e){
        System.out.println("please enter index Y."+ e);
    }
    System.out.println("Bye Bye.");
}
}
