package Trashegimia;
class Animal1 {
    // method in the superclass
    public void eat() {
        System.out.println("I can eat");
    }
}

// Dog inherits Animal
class Dogg extends Animal1 {

    // overriding the eat() method
    @Override
    public void eat() {

        // call method of superclass
        super.eat();
        System.out.println("I eat dog food");
    }

    // new method in subclass
    public void bark() {
        System.out.println("I can bark");
    }
}

class Dog1 {
    public static void main(String[] args) {

        // create an object of the subclass
        Dogg labrador = new Dogg();

        // call the eat() method
        labrador.eat();
        labrador.bark();
    }
}
