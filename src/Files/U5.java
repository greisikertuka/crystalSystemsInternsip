/*Shkruaj një program që merr dy brinjët e një drejtkëndëshi nga rreshti
  i komandës dhe afishon në ekran sipërfaqen e tij. Të përdoret blloku
  try dhe catch për të trajtuar përjashtimet që mund të ndodhin.
*/
package Files;
public class U5 {
    public static void main(String[] args) {
        try {
            double x = Double.parseDouble(args[0]);
            double y = Double.parseDouble(args[1]);
            if (x <= 0 || y <= 0)
                throw new IllegalArgumentException("x<=0 ose y<=0");
            System.out.println(x * y);
            }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Jep dy argumenta nga rreshti i"+
                   " komandes");
            }
        catch (NumberFormatException e) {
            System.err.println("Duhet te jepni numer double");
            }
        catch (IllegalArgumentException e) {
            System.err.println("Argumenti " + e.getMessage());
        }
    }
}