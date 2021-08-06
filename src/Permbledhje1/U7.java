package Permbledhje1;
import java.util.Scanner;
public class U7 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Jep numrin e elementeve te array te Stringave:");
        int n=scn.nextInt();
        scn.nextLine();
        System.out.println("Jep "+n+ " elementet e array te Stringave:");
        String[] arr=new String[n];
        for (int i=0;i<n;i++){
            arr[i]=scn.nextLine();
        }
        System.out.println("Jep stringen per krahasim:");
        String s=scn.nextLine();
        for (int i=0;i<n;i++){
           if(arr[i].equals(s)){
               System.out.println("Stringa \""+s+ "\" ndodhet te indeksi "+(i+1)+"\ni array te Stringave");
               return;
           }
        }
        System.out.println("Stringa \""+s+ "\" nuk ndodhet te array i Stringave");
        scn.close();
    }
}
