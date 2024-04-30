public class TestTryAI {
    public static void main(String[] args) {
        System.out.println("Welcome");
        ex1 e=new ex1();
         
    }
}
interface ecx{
    void study();
    default void task(){
        System.out.println("vegetable cutting");
    }
}
interface ecy{
    void study();
    default void task(){
        System.out.println("playing cricket");
    }
}
class ex1 implements ecx,ecy{
    public void study(){
        System.out.println("study java");
    }
    public void task(){
        System.out.println("playing game");
        ecy.super.task();
    }
}