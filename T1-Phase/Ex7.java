/*
Date:-19/03/2024
Name:-Krish Zinzuvadiya
AIM :-Create and abstract class Shape With abstract Methods Area & volume.
    Implement Both Methods in Respective child classes Rectangel & Circle.

*/
class Ex7{
    public static void main(String[] args) { 
        Shape s=new Circle();
        s.area(10);
        s.volume(20);
        s=new Rectangel();
        s.area(10);
        s.volume(20);
    }
}
abstract class Shape{
    abstract void area (int a);
    abstract void volume (int a);
}
class Circle extends Shape{
    void area(int a){
        double ans=Math.PI*a*a;
        System.out.println("Area Of Circle :-"+ans);
    }
    void volume(int a){
        double ans=4/3*Math.PI*a*a*a;
        System.out.println("Volume Of Circle :-"+ans);
    }
}
class Rectangel extends Shape{
    void area(int a){
        double ans=a*a;
        System.out.println("Area Of Rectangel :-"+ans);
    }
    void volume(int a){
        double ans=a*a*a;
        System.out.println("volume Of Rectangle :-"+ans);
    }
}
