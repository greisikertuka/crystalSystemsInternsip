package Exceptions;

class Test extends Exception {
}

class U2 {
    public static void main(String args[]) {
        try {
            throw new Test();
        } catch (Test t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }
}
     /*   -->(A)    Got the Test Exception
                    Inside finally block
             (B)    Got the Test Exception
             (C)    Inside finally block
             (D)    Compiler Error             */
