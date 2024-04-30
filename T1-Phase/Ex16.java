/*
Date:-26/03/2024
Name:-Krish Zinzuvadiya
AIM :- finally{}
       try...finally
*/
class Ex16 {
    public static void main(String[] args) {
        try{
            System.out.println("Hi try.");
            System.out.println(10/0);
            System.out.println("Hi");
        } 
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Hi catch"+e);
        }
        finally {
            System.out.println("This is finally block.");
        }
        System.out.println("Bye Bye.");
    }
}
