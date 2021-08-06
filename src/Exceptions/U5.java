package Exceptions;
class U5
{
    public static void main (String[] args)    {
        try {
            int a = 0;
            System.out.println ("a = " + a);
            int b = 20 / a;
            System.out.println ("b = " + b);
        }

        catch(ArithmeticException e)
        {
            System.out.println ("Divide by zero error");
        }

        finally
        {
            System.out.println ("inside the finally block");
        }
    }
}
  /*    (A) Compile error
        (B) Divide by zero error
     -->(C)a = 0
           Divide by zero error
           inside the finally block
        (D) a = 0
        (E) inside the finally block
        */
