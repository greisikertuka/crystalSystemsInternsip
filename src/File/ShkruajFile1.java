package File;

import java.io.File;

public class ShkruajFile1 {
    public static void main(String[] args) {
        File f = new File("numrat.txt");
        if (f.exists()) {
            System.out.println("Emri i file: " + f.getName());
            System.out.println("Pathi: " + f.getAbsolutePath());
            System.out.println("Mund te lexoje: " + f.canRead());
            System.out.println("Mund te shkruaje: " + f.canWrite());
            System.out.println("Madhesia: " + f.length());
        } else {
            System.out.println("Objekti nuk ekziston");
        }
    }
}
