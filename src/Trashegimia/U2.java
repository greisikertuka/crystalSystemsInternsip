package Trashegimia;
class Animall {

    // method in the superclass
    public void eat() {
        System.out.println("I can eat");
    }
}

// Dog inherits Animal
class Doggo extends Animall {

    // overriding the eat() method
    @Override
    public void eat() {
        System.out.println("I eat dog food");
    }

    // new method in subclass
    public void bark() {
        System.out.println("I can bark");
    }
}

class U2 {
    public static void main(String[] args) {
        // create an object of the subclass
        Doggo labrador = new Doggo();

        // call the eat() method
        labrador.eat();
        labrador.bark();
    }
}
