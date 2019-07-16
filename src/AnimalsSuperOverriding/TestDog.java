package AnimalsSuperOverriding;

public class TestDog {

    public static void main(String[] args) {

        Animal a = new Animal();        // Animal reference and object
        Animal b = new Dog();           // Animal reference but Dog object
        Dog c = new Dog();              // Dog reference but Dog object  -->  only this one can bark additionally
        Animal d = new SuperDog();      // Animal reference but SuperDog object

        a.move();                       // runs the method in Animal class
        b.move();                       // runs the method in Dog class
        c.bark();                       // runs the method in Dog class
        d.move();                       // runs the method in SuperDog class
    }
}

class Animal {
    public void move() {
        System.out.println("Animals can move");
    }
}

class Dog extends Animal {
    public void move() {
        System.out.println("Dogs can walk and run");

    }
    public void bark() {
        System.out.println("Dogs can bark (most of them)");

    }
}

class SuperDog extends Dog {
    public void move() {
        super.move();                   // invokes the super class method
        System.out.println("But only SuperDogs (even silent ones) can jump so high!");
    }
}