/*Të ndërtohet programi që gjen se cila shkronjë dyshe e alfabetit
të gjuhes shqipe përseritet më shpesh në një file tekst.
*/
package Files;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class U2 {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        String[] dyshe = { "dh", "gj", "ll", "nj", "rr", "sh", "th", "xh", "zh" };
        int[] frekuenca = new int[9];
        Scanner input;
        try {
// hapja a file-it per lexim
            input = new Scanner(new File("fjale.txt"));
// leximi i file-it rresht me rresht
            while (input.hasNextLine()) {
                String rresht = input.nextLine();
// per cdo rresht marrim srtingat me 2 karaktere dhe e krahasojme me
                //secilen
// prej shkronjave dyshe
                for (int i = 0; i < rresht.length() - 1; i++) {
                    for (int j = 0; j < 9; j++) {
                        System.out.print(rresht.substring(i, i + 1) + " " +
                                dyshe[j]);
                        if (rresht.substring(i, i + 2).equals(dyshe[j]))
                            frekuenca[j]++;
                    }
                }
            }
            input.close();
            int eShpeshta = gjejMax(frekuenca);
            System.out.println("\nShkronja dyshe me e shpeshte eshte \"" + dyshe[eShpeshta]
                    + "\".");
        } catch (FileNotFoundException e) {
            System.err.println("File nuk ekziston");
        }
    }
    // gjen indeksin e shkronjes qe perseritet me shpesh
    public static int gjejMax(int[] f) {
        int max = f[0];
        int index = 0;
        for (int i = 1; i < f.length; i++) {
            if (f[i] > max) {
                max = f[i];
                index = i;
            }
        }
        return index;
    }
}