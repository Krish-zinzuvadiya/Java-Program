/*
Date:-20/03/2024
Name:-Krish Zinzuvadiya
AIM :-Multiple inheritance
    
*/
class Ex11{
    public static void main(String[] args) {
        Son s=new Son();
        s.Study();
        s.task();
        System.out.println(Dad.x);
    }
}
interface Mom{
    int x=10;
    void Study();
    default void task(){
        System.out.println("vegetable cutting");
    }
}
interface Dad{
    int x=20;
    void Study();
    default void task(){
        System.out.println("playing cricket");
    }
}
class Son implements Mom,Dad{
    public void Study(){
        System.out.println("study java");
    }
    public void task(){
        System.out.println("playing game");
        Dad.super.task();
    }
}