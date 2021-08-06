package FileDetyrat;

import java.io.*;
import java.util.Scanner;
public class U1 {
    public static void main(String[] args) throws IOException {
        Scanner scn=new Scanner(System.in);
        System.out.println("Jep numrin e karaktereve:");
        int n=scn.nextInt();
        System.out.println("Jep "+n+" karakteret:");
        char[]c=new char[n];
        for (int i=0;i<n;i++){
            c[i]=scn.next().charAt(0);
        }
        scn.close();
        OutputStream os=new FileOutputStream("U11.txt");
        for(int i=0;i<n;i++){
            os.write(c[i]);
        }
        os.close();
        InputStream is =new FileInputStream("U11.txt");
        int m=is.available();
        for(int i=0;i<m;i++){
            System.out.println((char)is.read()+" ");
        }
    }
}
