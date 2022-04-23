/*Të ndërtohet një program që lexon nga një skedar tekst gjithë fjalët
që janë shkruar në të( numri i fjalëve është i papërcaktuar)
dhe shkruan në një skedar të ri gjithë fjalët që nuk përmbajnë
gërmën d dhe i.
*/
package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Formatter;

public class U3 {
    private static Scanner input;
    private static Formatter output;

    public static void main(String[] args) {
// TODO Auto-generated method stub
// hapja e file-it per lexim
        try {
            input = new Scanner(new File("fjalet.txt"));
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error ne hapjen e file-it.");
            System.exit(1);
        }
// hapja e file-it per shkrim
        try {
            output = new Formatter("fjalePaDdheI.txt"); // hap file-in
        } catch (SecurityException securityException) {
            System.err.println("Ti nuk ke te drejta shkrimi ne kete file.");
            System.exit(1); // perfundo programin
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error ne hapjen ose krijimin e file-it.");
            System.exit(1); // perfundo programin
        }
        try {
// lexohen fjalet
            while (input.hasNext()) {
                String fjala = input.next();
// nese fjala nuk permban as "d" as "i" shkruhet ne file-in tjeter
                if (!(fjala.contains("d") || fjala.contains("i")))
                    output.format("%s ", fjala);
            } // fund i while
        } catch (NoSuchElementException elementException) {
            System.err.println("File nuk eshte ne formatin e duhur.");
            input.close();
            System.exit(1);
        } catch (IllegalStateException stateException) {
            System.err.println("Error ne leximin e file.");
            System.exit(1);
        }
// mbyll file-in dhe perfundo aplikacionin
        if (input != null && output != null)
            input.close();
        output.close();
    }
}