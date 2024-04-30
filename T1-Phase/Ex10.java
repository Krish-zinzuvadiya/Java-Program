
/*
Date:-20/03/2024
Name:-Krish Zinzuvadiya 
AIM :-Default,Private and static Keyweord in interface.
    
*/
class Ex10{
    public static void main(String[] args) {
    In1 a=new D6();
    In1 b=new D3();
        a.m1();
        b.m1();
        In1.m2();
    }
}
interface In1{
    default void m1(){
        System.out.println("In1 M1 Get 50% off");
        m3();
    }
    static void m2(){
        System.out.println("In1 m2");
    }
    private void m3(){
        System.out.println("Your Phone is Hacked");
    }
}
interface In2 extends In1{
    default void m1(){
        System.out.println("In2 M1 ");
    }
}
class D6 implements In1{
    public void m1(){
        System.out.println("D6 M1 ");
    }
    public void m2(){
        System.out.println("D6 M2");
    }
}
class D3 implements In1{
    
}