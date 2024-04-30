/*
Date:-20/03/2024
Name:-Krish Zinzuvadiya
AIM :-Exception Handling [ArrayIndexOutOfBoundsException]
*/

class Ex13{
    public static void main(String[] args) {
        System.out.println("Welocme");
        try{
            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println(args[2]);
            System.out.println(args[3]);
            System.out.println(args[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please valid");
        }
        System.out.println("Bye Bye");
    }
}