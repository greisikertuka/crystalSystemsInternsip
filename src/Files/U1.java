/*Lexoni nga një file emrat dhe 5 nota për secilin student dhe shkruani
në një file të ri emrin e studentit dhe notën maksimale të tij.
Numri i studentëve nuk është i përcaktuar.
        File-i është i organizuar në këtë mënyrë:
        Studenti1 8, 9, 7, 10, 8
        Studenti2 6, 8, 9, 7, 9
        */
package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Formatter;

public class U1 {
    private static Scanner input;
    private static Formatter output;

    public static void main(String[] args) {
// TODO Auto-generated method stub
// hapja e file-it per lexim
        try {
            input = new Scanner(new File("notat.txt"));
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error ne hapjen e file-it.");
            System.exit(1);
        }
// hapja e file-it per shkrim
        try {
            output = new Formatter("maksimale.txt");
        } catch (SecurityException securityException) {
            System.err.println("Ti nuk ke te drejta shkrimi ne kete file.");
            System.exit(1); // perfundo programin
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error ne hapjen ose krijimin e file-it.");
            System.exit(1); // perfundo programin
        }
// leximi i te dhenave per cdo student
        while (input.hasNextLine()) {
            try {
//leximi i emrit
                String emri = input.next();
// leximi i notave ne nje vektor String
                String[] nr = input.nextLine().trim().split(", ");
// gjetja e maksimumit
                int max = getMax(nr);
//shkrimi ne file
                output.format("%s %d\n", emri, max);
            } catch (NoSuchElementException elementException) {
                System.err.println("File nuk eshte ne formatin e duhur.");
                input.close();
                System.exit(1);
            } catch (IllegalStateException stateException) {
                System.err.println("Error ne leximin e file.");
                System.exit(1);
            }
        } // fund i while
// mbyll file-et
        if (input != null && output != null)
            input.close();
        output.close();
    }

    public static int getMax(String[] nr) {
        int max = Integer.parseInt(nr[0]);
        for (int i = 1; i < 4; i++) {
            if (Integer.parseInt(nr[i]) > max)
                max = Integer.parseInt(nr[i]);
        }
        return max;
    }
}
