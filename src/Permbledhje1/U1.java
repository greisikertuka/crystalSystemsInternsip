package Permbledhje1;
import java.util.ArrayList;
import java.util.Scanner;
public class U1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        ArrayList<String> l=new ArrayList<String>();
        System.out.println("Jep numrin e elementeve te ArrayList:");
        int n=scn.nextInt();
        scn.nextLine();
        System.out.println("Jep "+n+" elementet:");
        for(int i=0;i<n;i++){
            l.add(scn.nextLine());
        }
        System.out.println("ArrayListi origjinal:\n"+l);
        ArrayList<String> l1=(ArrayList)l.clone();
        System.out.println("ArrayListi i kopjuar:\n"+l1);
    }
}
