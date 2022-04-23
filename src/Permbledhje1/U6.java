package Permbledhje1;

import java.util.Scanner;

public class U6 {
    public static void main(String[] args) {
        System.out.println("Jep nje stringe:");
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println("Gjatesia e stringes \"" + s + "\" eshte: " + s.length());
        scn.close();
    }
}
