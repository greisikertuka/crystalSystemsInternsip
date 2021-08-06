/*Shkruani një metodë me emër shumaNegative që merr si argument një objekt
  të tipit Scanner për të lexuar të dhëna nga një skedar që përmban
  një seri numrash të plotë. Kjo metodë printon një mesazh në monitor
  nëse ndonjë prej shumave ((numri i parë, (numri i parë + numri i dytë),
  (numri i parë+numri i dytë+numri i tretë), etj) është negative.
  Kjo metodë kthen true nëse arrihet ndonjëherë shuma negative dhe
  false në të kundërt. Psh. nëse skedari ka përmbajtjen:
        14 7 –10 9 -18 -10 17 42 98
  Metoda gjen që shuma negative –8 arrihet pas mbledhjes së gjashtë numrave
  të parë. Në këtë rast metoda duhet të kthejë true dhe të printojë në ekran:
  Shuma negative –8 pas mbledhjes se 6 numrave te pare.
  (Nëse ka me shumë se një shumë të printohen të gjitha shumat sipas
  formatit të dhënë më lart).
*/

package Files;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class U4 {
    private static Scanner input;
    public static void main(String[] args) {
// TODO Auto-generated method stub
// hap file-in per lexim
        try {
            input = new Scanner(new File("numrat.txt"));
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error ne hapjen e file-it.");
            System.exit(1);
        }
        shumaNegative(input);
// mbyll file-in dhe perfundo aplikacionin
        if (input != null)
            input.close();
    }
    public static void shumaNegative(Scanner input) {
        int shuma = 0;
        int n = 0;
        try {
// lexohen numrat njeri pas tjetrit
            while (input.hasNextInt()) {
// mbahet nje counter se sa numra jane lexuar
                n++;
                int nr = input.nextInt();
// per cdo numer te lexuar llogaritet shuma
                shuma += nr;
                System.out.println(shuma);
// nese shuma eshte negative afishohet kjo shume dhe se sa numra jane mbledhur
                if (shuma < 0)
                    System.out.println("Shuma negative " + shuma + " pas"+
                           " mbledhjes se " + n + " numrave te pare");
            }
        }
        catch (NoSuchElementException elementException) {
            System.err.println("File nuk eshte ne formatin e duhur.");
            input.close();
            System.exit(1);
        }
        catch (IllegalStateException stateException) {
            System.err.println("Error ne leximin e file.");
            System.exit(1);
        }
    }
}