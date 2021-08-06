package Detyra1;
import java.util.ArrayList;
import java.util.Scanner;
public class U3 {
    public static void main(String [] args) {
        Scanner scn=new Scanner(System.in);
        ArrayList<String> arr1=new ArrayList<String>();
        ArrayList<String> arr2=new ArrayList<String>();

        System.out.println("Jep ArrayListin e pare:");
        arr1.add(scn.nextLine());
        System.out.println("Jep ArrayListin e dyte:");
        arr2.add(scn.nextLine());
        if(arr1.equals(arr2)) System.out.println("\nJane identike");
        else System.out.println("\n Nuk jane identike");

        scn.close();
    }
}

