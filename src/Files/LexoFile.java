package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LexoFile {
    private Scanner input;

    public static void main(String[] args) {
        LexoFile f = new LexoFile();
        f.hapFile();
        f.lexoRekord();
        f.mbyllFile();
    }

    public void hapFile() {
        try {
            input = new Scanner(new File("Studente.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Gabim te hapja e file!");
            System.exit(1);
        }
    }

    public void lexoRekord() {
        //Krijohet Objekti std per aksesim te dhenash nga File per printim
        StudentRekord std = new StudentRekord();
        System.out.println("ID\tEmri\tMosha\tMesatare\n");
        try {
            while (input.hasNext()) {
                std.id = input.nextInt();
                std.emri = input.next();
                std.mosha = input.nextInt();
                std.mesatare = input.nextDouble();
                System.out.println(std.id + "\t" + std.emri + "\t   " + std.mosha + "\t   " + std.mesatare);
            }
        }
        //Probleme te hapja e File
        catch (NoSuchElementException e) {
            System.out.println("File nuk eshte ne rregull!");
            System.exit(1);
        }
        //Scanner mbyllet para inputit
        catch (IllegalStateException e) {
            System.out.println("Gabim ne leximin nga file!");
            System.exit(1);
        }
    }

    public void mbyllFile() {
        if (input != null)
            input.close();
    }
}
