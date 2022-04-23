package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Formatter;

public class Prove {
    private static Scanner input;
    static char v[] = new char[100];

    public static void main(String[] args) {
// hapja e file-it per lexim
        try {
            input = new Scanner(new File("karaktere.txt"));
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error ne hapjen e file-it.");
            System.exit(1);
        }
//
// leximi i karaktereve
        String emri = "";
        while (input.hasNextLine()) {
//leximi i emrit
            emri += input.nextLine();

        }
        if (input != null)
            input.close();
        int g = 0;
        for (int i = 0; i < emri.length(); i++) {
            v[i] = emri.charAt(i);
            g++;
        }
        System.out.println("Vektori me karaktere:");
        for (int i = 0; i < g; i++) {
            System.out.println(v[i]);
        }
    }
}
