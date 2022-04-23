package File;

import java.io.*;
import java.nio.Buffer;

public class Prvvvvvvv {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("AAAAA.txt");
        PrintWriter pw = new PrintWriter(fw);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                pw.printf("%8d", (i + 1) * (j + 1));
            }
            if ((i == 2)) {
                pw.print("");
            } else {
                pw.println();
            }
        }
        pw.close();
        fw.close();
        FileReader fr = new FileReader("AAAAA.txt");
        BufferedReader br = new BufferedReader(fr);
        int[][] v = new int[3][3];
        String s1 = br.readLine();
        for (int i = 0; (i < 3) && (s1 != null); i++) {
            String[] s = s1.split("\\s+");
            for (int j = 1; j < s.length; j++) {
                v[i][j - 1] = Integer.parseInt(s[j]);
            }
            s1 = br.readLine();
        }
        br.close();
        fr.close();
        System.out.println("\n\nMatrica e lexuar nga file:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%8d", v[i][j]);
            }
            System.out.println();
        }
    }
}
