package File;

import java.io.*;

public class Lexo {
    public static void main(String[] args) throws IOException {
        InputStreamReader cin = null;
        try {
            cin = new InputStreamReader(System.in);
            System.out.println("Jep karakterin 'q' qe te afishoje:");
            char c;
            do {
                c = (char) cin.read();
                System.out.println(c);
            } while (c != 'q');
        } catch (IOException e) {
            System.out.println("Probleme te inputi!");
            e.printStackTrace();
        } finally {
            if (cin != null) {
                cin.close();
            }
        }
    }
}
