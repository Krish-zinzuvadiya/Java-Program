
/*
Date:-13/03/2024
Name:-Krish Zinzuvadiya
AIM :-Run Time Polymorphism for Member Variables or Instance Variable 
      Run Time Ploymorhipsm Is Not possible for Overridden Instance Variable
*/
class Ex2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Bmw b1 = new Bmw();
        Alto a1 = new Alto();
        System.out.println(c1.speed);
        c1.drive();
        c1 = b1;
        c1.drive();
        System.out.println(c1.speed);// override do not possible for that reason. Speed will be constant 100;
        c1 = a1;
        c1.drive();
        System.out.println(c1.speed);
    }
}

class Car {
    int speed = 100;

    void drive() {
        System.out.println("Car Is Running At" + speed);
    }
}

class Bmw extends Car {
    int speed = 180;

    void drive() {
        System.out.println("Bmw Is Running At" + speed);
    }
}

class Alto extends Car {
    int speed = 80;

    void drive() {
        System.out.println("Alto Is Running At" + speed);
    }
}