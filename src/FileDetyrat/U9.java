package FileDetyrat;

import java.io.*;
import java.util.Optional;
import java.util.Scanner;

class Matrix {
    int[][] matrica = null;

    Matrix(int m, int n) {
        matrica = new int[m][n];
    }

    void fill(Scanner scn) {
        for (int i = 0; i < matrica.length; i++) {
            System.out.println("Jep " + matrica[0].length + " elementet e rreshtit " + (i + 1) + ":");
            for (int j = 0; j < matrica[0].length; j++) {
                matrica[i][j] = scn.nextInt();
            }
        }
    }

    static void printo(Matrix m) {
        if (m == null) {
            System.out.println("Matrica eshte bosh!");
        }
        for (int i = 0; i < m.matrica.length; i++) {
            for (int j = 0; j < m.matrica[0].length; j++) {
                System.out.print(m.matrica[i][j] + "   ");
            }
            System.out.println();
        }
    }

    void save(String filename) throws IOException {
        FileWriter fw = new FileWriter(filename);
        PrintWriter pw = new PrintWriter(fw);
        System.out.println("Te dhenat po ruhen ne file!");
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[0].length; j++) {
                pw.printf("%8d", matrica[i][j]);
            }
            if (i != matrica.length - 1) pw.println();
        }
        System.out.println("Te dhenat u ruajten ne file!");
        pw.close();
        fw.close();
    }

    static Matrix read(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        String s1 = br.readLine();
        int m = 0, n = 0, rasti = 0;
        while (s1 != null) {
            m++;
            if (rasti == 0) //Mjafton ta gjejme 1 here
                n = s1.split("\\s+").length - 1;
            rasti++;
            s1 = br.readLine();
        }
        br.close();
        fr.close();
        Matrix mat = new Matrix(m, n);
        FileReader f = new FileReader(filename);
        BufferedReader b = new BufferedReader(f);
        s1 = b.readLine();
        int nr = 0;
        while (s1 != null) {
            for (int i = 0; (i < m) && (s1 != null); i++) {
                String[] s = s1.split("\\s+");
                for (int k = 1; k < s.length; k++) {
                    mat.matrica[i][k - 1] = Integer.parseInt(s[k]);
                }
                s1 = b.readLine();
            }
        }
        b.close();
        f.close();
        return mat;
    }

    Matrix sum(int[][] m1) {
        if ((m1.length == matrica.length) && (m1[0].length == matrica[0].length)) {
            Matrix mResult = new Matrix(m1.length, m1[0].length);
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[0].length; j++) {
                    mResult.matrica[i][j] = m1[i][j] + matrica[i][j];
                }
            }
            return mResult;
        } else {
            return null;
        }
    }

    Matrix product(int[][] m1) {
        if (matrica[0].length == m1.length) {
            Matrix mResult = new Matrix(matrica.length, m1[0].length);
            for (int i = 0; i < matrica.length; i++) {
                for (int j = 0; j < m1[0].length; j++) {
                    for (int k = 0; k < matrica[0].length; k++) {
                        mResult.matrica[i][j] += matrica[i][k] * m1[k][j];
                    }
                }
            }
            return mResult;
        } else
            return null;
    }
}

public class U9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Jepni numrin e rreshtave dhe kolonave per matricen e pare:");
        int m = scn.nextInt();
        int n = scn.nextInt();
        Matrix m1 = new Matrix(m, n);
        m1.fill(scn);
        System.out.println("Jep emrin e file per te ruajtur matricen e pare:");
        String s = scn.next();
        try {
            m1.save(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Jepni numrin e rreshtave dhe kolonave per matricen " +
                "per mbledhje:");
        m = scn.nextInt();
        n = scn.nextInt();
        Matrix m2 = new Matrix(m, n);
        m2.fill(scn);
        System.out.println("Jepni numrin e rreshtave dhe kolonave per matricen " +
                "per shumezim:");
        m = scn.nextInt();
        n = scn.nextInt();
        Matrix m3 = new Matrix(m, n);
        m3.fill(scn);
        try {
            Matrix mFile = Matrix.read(s);
            System.out.println("Matrica e lexuar nga file:");
            Matrix.printo(mFile);
            System.out.println("Rezultati i mbledhjes:");
            Matrix mbledhje = m1.sum(m2.matrica);
            Matrix.printo(mbledhje);
            System.out.println("Rezultati i shumezimit:");
            Matrix shumezim = m1.product(m3.matrica);
            Matrix.printo(shumezim);
        } catch (IOException e) {
            e.printStackTrace();
        }
        scn.close();
    }
}
