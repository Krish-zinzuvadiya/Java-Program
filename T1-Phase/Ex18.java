/*
Date:-26/03/2024
Name:-Krish Zinzuvadiya
AIM :- finally{} and return value
       try...finally
*/
class Ex18 {
    public static void main(String[] args) {
         System.out.println(m1());
    }
    static int m1(){
        try{
            System.out.println("Hi try.");
            System.out.println(10/0);
            System.out.println("Hi");
            return 100;
        } 
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Hi catch"+e);
            return 200;
        }
        finally {
            System.out.println("This is finally block.");
            return 300;
        }
    }
}
