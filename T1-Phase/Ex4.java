/*
Date:-13/03/2024
Name:-Krish Zinzuvadiya 
AIM :-instanceof Operator 
it is used to check whether the given object is instanceof perticular class/subclass/interface/
Syntex-obj instanceof class  
    ex-b1  instanceof  bmw =>True/False
    NOTE - for null intialised object instanceof returns false  

    //instancOf //instanceof() // this is not a instanceof 9it is a method 
*/
class Ex4 {
    public static void main(String[] args) {
        Team t1 = new Team();
        India i1 = new India();
        System.out.println("t1 instance of team " + (t1 instanceof Team));
        System.out.println("i1 instance of team " + (i1 instanceof India));
        System.out.println("i1 instance of team " + (i1 instanceof Team));
        System.out.println("t1 instance of india " + (t1 instanceof India));
        India i2 = null;
        System.out.println(i2 instanceof India);
        Team T2;
    }
}

class Team {
    void play() {
        System.out.println("Team Is Playing");
    }
}

class India extends Team {
    void play() {
        System.out.println("India Is Playing");
    }
}