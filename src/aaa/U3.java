package aaa;

import java.util.Scanner;
import java.util.ArrayList;

class Lexo {
    ArrayList<Integer> pos = new ArrayList<Integer>();
    ArrayList<Integer> neg = new ArrayList<Integer>();

    Lexo(int[][] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[0].length; j++) {
                if (v[i][j] > 0) {
                    pos.add(v[i][j]);
                } else if (v[i][j] < 0) {
                    neg.add(v[i][j]);
                }
            }
        }
    }
}

public class U3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Jep nurmin e rrashtave dhe kolonave:");
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] v = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println("Jep elementet e rreshtit " + (i + 1) + ":");
            for (int j = 0; j < n; j++) {
                v[i][j] = scn.nextInt();
            }
        }
        Lexo l = new Lexo(v);
        System.out.println("ArrayListi pozitiv: " + l.pos);
        System.out.println("ArrayListi negativ: " + l.neg);
    }
}
