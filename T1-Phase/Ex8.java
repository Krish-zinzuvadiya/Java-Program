/*
Date:-19/03/2024
Name:-Krish Zinzuvadiya 
AIM :-Interface
*/
class Ex8{
    public static void main(String[] args) {
        Lju u=new Ljiet();
        u.exam();
        u.festival();
        u=new Ljdip();
        u.exam();
        u.festival();
    }
}
interface Uni{
    double marks=100;
    void exam();
}
interface Lju extends Uni{
    int size=50;
    void festival();
}
class Ljiet implements Lju{
    public void exam(){
        System.out.println("ljiet exam");
    }
    public void festival(){
        System.out.println("Hi Lumina");
    }
}
class Ljdip implements Lju{
    public void exam(){
        System.out.println("Diploma exam");
    }
    public void festival(){
        System.out.println("Hi deeprang");
    }
}
class Ljmca implements Lju{
    public void exam(){
        System.out.println("Mca exam");
    }
    public void festival(){
        System.out.println("Hi Mca");
    }
}
