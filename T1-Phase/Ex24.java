import java.io.FileNotFoundException;
import java.util.Scanner;
/*
Date:-27/03/2024
Name:-Krish Zinzuvadiya
AIM :- Ask user to Enter a Number If number isdivisible by 10 then throw InterruptedException do all this in one
       method.
*/
class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:- ");
        int n =sc.nextInt();
        try{
            check(n);
        }   
         catch (InterruptedException e) {
            System.out.println(e);
        } catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
    static void check(int n) throws InterruptedException, FileNotFoundException{
        if(n%10==0){
            throw new InterruptedException("Divisible by 10");
        }
        if(n%13==0){
            throw new FileNotFoundException("File is not Found.");
        }
    }
}
