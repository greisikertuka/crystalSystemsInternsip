package Permbledhje1;
import java.util.ArrayList;
import java.util.Scanner;
public class U8 {
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
        ArrayList<String> arrayList=new ArrayList<String>();
        for (int i=0;i<n;i++)
               arrayList.add(arr[i]);
        System.out.println("ArrayListi i krijuar:\n"+arrayList);
        scn.close();
    }
}
