/*
Date:-20/03/2024
Name:-Krish Zinzuvadiya
AIM :-try Multi catch [TwoExceptions]
*/
import java.util.Scanner;
class Ex14{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p[]={10,8,3,0,4};
        System.out.println("Enter Value Of A");
        int a=sc.nextInt();
        System.out.println("Enter Value Of B");
        int b=sc.nextInt();
        try{
            int ans=p[a]/p[b];
            System.out.println("Ans"+ans);
        }catch(ArithmeticException e){
            System.out.println("Enter Valid "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Enter Valid Index "+e);
        }
    }
}