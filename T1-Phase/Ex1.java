class Ex1{
    public static void main(String[] args) {
        System.out.println("Hi");
        T1 p = new T1();
        T2 q = new T2();
        Test r;
        r = p;
        r.display();
        r = q;
        r.display();
    }
}

class Test {
    void display() {
        System.out.println("hello Test.");
    }
}

class T1 extends Test{
    void display() {
        System.out.println("hello T1");
    }
}

class T2 extends Test{
    void display() {
        System.out.println("hello T2");
    }
}