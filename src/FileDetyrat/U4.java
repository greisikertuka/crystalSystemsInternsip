/*Exercise 8.4. Write a public static method that takes as parameters a string representing a filename and an
        integer n, and writes on the file the multiplication table of size n. For example, for n = 3, the method should
        write:
        1 2 3
        2 4 6
        3 6 9*/
package FileDetyrat;

import java.io.*;
import java.util.Scanner;

public class U4 {
    static void tabeleShumezimi(String s,int n){
        FileWriter f= null;
        try {
            f = new FileWriter(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter pw=new PrintWriter(f);
        for (int i=0;i<n;i++){
            if(i==0)System.out.println("Po shkruhen te dhenat ne file!");
            for (int j=0;j<n;j++){
                pw.print((j+1)*(i+1)+"  ");
            }
            pw.println();
        }
        System.out.println("U shkruajten te dhenat!");
        pw.close();
        try {
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
         System.out.println("Jep emrin e file dhe madhesine e tabeles se shumezimit:");
         tabeleShumezimi(scn.next(),scn.nextInt());
         scn.close();
    }
}
