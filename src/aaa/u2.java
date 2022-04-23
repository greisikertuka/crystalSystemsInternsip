package aaa;

import java.util.Scanner;

public class u2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Jep nje stringe, nje numer dhe nje stringe te dyte:");
        String s = scn.nextLine();
        //String s1=scn.nextLine(); s do kishte probleme
        int a = scn.nextInt();
        //String s1=scn.nextLine(); stringa s1 merret si ""
        scn.nextLine();   //E nevojshme
        String s1 = scn.nextLine();
        System.out.println("Stringa e pare: " + s);
        System.out.println("Stringa e dyte: " + s1);
    }
}
