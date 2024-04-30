import java.io.FileNotFoundException;
import java.util.Scanner;
/*
Date:-27/03/2024
Name:-Krish Zinzuvadiya
AIM :- Ask user to Enter a Number If number isdivisible by 10 then throw InterruptedException do all this in one
       method.
*/
class Ex25 {
    static int run;
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Super-over:- ");
        for(int i=0;i<6;i++){
            System.out.println("Enter ball:- "+(i+1)+" :- ");
            run=sc.nextInt();
            try{
                play(run);
            } catch(Exception e){
                System.out.println(e);
            }
        }
    }
    static void play(int run) throws InvalidRunException{
        int total=0;
        count++;

        if(run<0||run>6){
            throw new InvalidRunException("Invalid run.");
        } else {
            total = total + run;
            System.out.println(total);
        }
        try{
            if(count == 6 && total <= 25){
                throw new LossMatchException("Loss Match.");
            }
        } catch (LossMatchException e){
            System.out.println(e);
        }
    }
}
class InvalidRunException extends Exception{
    public  InvalidRunException(String s){
        super(s);
    }
}
class LossMatchException extends RuntimeException{
    public LossMatchException(String s){
        super(s);
    }
}