/*
Date:-16/03/2024
Name:-Krish Zinzuvadiya 
AIM :-Abstract Keyword
    Abstract class & Abstract Method
    Conclusions:
    1.Abstract Method Dosenot have Any Body{}.
    2.If Atleast 1 Method Is Abstract In class Then Class Must Be  Abstract Class.
    3.We Cannot Instantitation (Object Creation) Abstract Class.
    4.To Access Properties of Abstract Class We Have To Create Object Of Child Class.
    5.We Have To Implemet Abstract Meta In Child Class.
    6.If We Donot Implement Abstract Method Child Class Make Child Class As Abstract class.
    7.We Can not Use static,final,private,synchronized With Abstract Keyword.
    8.We Cannot use abstract With  instance Variables And Constructors.
    9.In abstract class we Can Define constructors And Static methods.
    10.abstract methods can be overlodaded.
    11. We can Create Abstract Innerclass.
*/

class Ex6 {
    public static void main(String[] args) {
        // Meta m1 = new Meta(); 3.
        Insta I = new Insta();
        I.putStory(); // 4.
    }
}

abstract class Meta { // 2.
    // abstract int time; 8.
    void posting() {
        System.out.println("Meta Post");
    }

    abstract void putStory(); // 1.

    // private abstract void like(); 7.
    // final abstract void like(); 7.
    // synchronized abstract void putStory(); 7.
    // static abstract void putStory(); 7.
    Meta() { // 9.

    }

    static void show() { // 9.

    }

    abstract void putStory(int a); // 10.

}

class Insta extends Meta {
    void putStory() { // 5.
        System.out.println("Insta Story");
    }

    void putStory(int a) {
        System.out.println("Insta Story");
    }
}

abstract class Whatsapp extends Meta { // 6.
    abstract class Upi { // 11.

    }
}