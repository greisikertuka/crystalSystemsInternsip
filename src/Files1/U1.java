//Shkrimi ne file shembull
package Files1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class U111 {
    String emri;
    int numri;

    U111() {
    }

    U111(String e, int n) {
        emri = e;
        numri = n;
    }
}

public class U1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Jep numrin e elementeve:");
        int n = scn.nextInt();
        U111[] nr = new U111[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Jep emrin dhe numrin per objektin " + (i + 1) + ":");
            scn.nextLine();
            String s = scn.nextLine();
            int m = scn.nextInt();
            nr[i] = new U111(s, m);
        }
        scn.close();
        FileWriter f = null;
        try {
            f = new FileWriter("U1.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter pw = new PrintWriter(f);
        for (int i = 0; i < n; i++) {
            System.out.println("Po shkruhen te dhenat ne file!");
            pw.println(nr[i].emri + " " + nr[i].numri);
        }
        System.out.println("U shkruajten te dhenat!");
        pw.close();
        try {
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
