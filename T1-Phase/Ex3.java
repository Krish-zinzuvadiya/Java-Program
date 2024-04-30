/*
Date:-13/03/2024
Name:-Krish Zinzuvadiya 
AIM :-Up-Casting AND Down-Casting
*/
class Ex3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Bmw b1 = new Bmw(); // child to parent conevration :upcasting
        Car c2 = new Bmw(); // child to parent :upcasting
        c2.drive();
        c1 = b1; // child to parent conevration :upcasting
        c1.drive();
        b1 = (Bmw) c1; // parent to child conevration :downcasting
        b1.drive();
        // b1=c1; -->Compile time error
        // Bmw b2 = new Car(); --> compile time errror
        //Bmw b3 = (Bmw) new Car(); -->run time errror
    }
}

class Car {
    int speed = 100;

    void drive() {
        System.out.println("Car Is Running At " + speed);
    }
}

class Bmw extends Car {
    int speed = 180;

    void drive() {
        System.out.println("Bmw Is Running At " + speed);
    }
}