package Detyra1;
import java.util.ArrayList;
import java.util.Scanner;
public class U4 {
    public static void main(String [] args) {
        Scanner scn=new Scanner(System.in);
        ArrayList<String> arr1=new ArrayList<String>();
        ArrayList<String> arr2=new ArrayList<String>();

        System.out.println("Jep ArrayListin e pare:");
        arr1.add(scn.nextLine());
        System.out.println("Jep ArrayListin e dyte:");
        arr2.add(scn.nextLine());
        arr1.add(arr2.get(0));
        System.out.println("\nArrayLists pas bashkimit:"+arr1);
        scn.close();
    }
}
