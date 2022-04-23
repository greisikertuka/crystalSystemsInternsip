package Exceptions;

class U6 {
    public static void main(String[] args) {
        try {
            int a[] = {1, 2, 3, 4};
            for (int i = 1; i <= 4; i++) {
                System.out.println("a[" + i + "]=" + a[i] + "\n");
            }
        }
//catch exception I eleminon te gjitha exceptionat e tjere
        catch (Exception e) {
            System.out.println("error = " + e);
        }

        /*catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println ("ArrayIndexOutOfBoundsException");
        }*/
    }
} /*
        -->(A) Compiler error
        (B) Run time error
        (C) ArrayIndexOutOfBoundsException
        (D) Error Code is printed
        (E) Array is printed

*/