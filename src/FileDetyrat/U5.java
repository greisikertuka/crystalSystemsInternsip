/*Exercise 8.5. Write a public static method that reads from a file information about exam marks obtained
        by students, organized as follows:
        Rossi 25 24 26 30 24 30
        Bianchi 20 24 25
        Verdi 30 24 30 27*/

package FileDetyrat;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.Scanner;
import java.util.Formatter;

public class U5 {
    static Scanner input;

    public static void main(String[] args) {
// hapja e file-it per lexim
        try {
            input = new Scanner(new File("notat1.txt"));
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error ne hapjen e file-it.");
            System.exit(1);
        }
        int m1 = 0, m = 0;
        double[] mesatare = new double[100];
        String[] emri = new String[100];
        while (input.hasNextLine()) {
            emri[m1] = input.next();
            String[] nr = input.nextLine().trim().split(" ");
            mesatare[m1] = getMes(nr);
            m1++;
        }
        if (input != null)
            input.close();
        int max = 0;
        for (int i = 0; i < mesatare.length; i++) {
            if (mesatare[i] > mesatare[max])
                max = i;
        }
        System.out.println("\nStudenti me mesataren me te larte: " + emri[max] + " me mesatare: " +
                "" + mesatare[max]);
    }

    public static double getMes(String[] nr) {
        double mes = Integer.parseInt(nr[0]);
        for (int i = 1; i < nr.length; i++) {
            mes += Integer.parseInt(nr[i]);
        }
        return mes / nr.length;
    }
}
