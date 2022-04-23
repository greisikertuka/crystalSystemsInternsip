package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Tekst {
    public static void main(String[] args) {
        try {
            File f = new File("TekstProve.tx");
            if (f.createNewFile()) {
                System.out.println("Krijuat nje File te ri!");
            } else {
                System.out.println("File ezkiston!");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File nuk ezkiston!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Keni dhene input te gabuar!");
            e.printStackTrace();
        }
    }
}
