package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Formatter;

public class Prove2 {
    private static Scanner input;
    private static Formatter output;

    public static void main(String[] args) {
// TODO Auto-generated method stub
// hapja e file-it per lexim
        try {
            input = new Scanner(new File("emrat.txt"));
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error ne hapjen e file-it.");
            System.exit(1);
        }
// hapja e file-it per shkrim
        try {
            output = new Formatter("saveArray.txt");
        } catch (SecurityException securityException) {
            System.err.println("Ti nuk ke te drejta shkrimi ne kete file.");
            System.exit(1); // perfundo programin
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error ne hapjen ose krijimin e file-it.");
            System.exit(1); // perfundo programin
        }
// leximi i emrave
        while (input.hasNextLine()) {
            try {
                String emri = input.next();
// leximi i emrave ne nje vektor String
                String[] em = input.nextLine().trim().split(", ");
                System.out.print("Array i krijuar:");
                //shkrimi ne file
                output.format("%s \n", emri);
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
}
