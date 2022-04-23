package Exceptions;

class Base extends Exception {
}

class Derived extends Base {
}

public class U4 {
    public static void main(String args[]) {
        try {
            throw new Derived();
        } catch (Base b) {
            System.out.println("Caught base class exception");
        }
        /*
        catch(Derived d)  {
            System.out.println("Caught derived class exception");
        }*/
    }
}
/*
        (A) Caught base class exception
        (B) Caught derived class exception
        (C) Compiler Error because derived is not throwable
      ->(D) Compiler Error because base class exception is caught before derived class
      */