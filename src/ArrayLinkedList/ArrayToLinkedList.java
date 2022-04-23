package ArrayLinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;

public class ArrayToLinkedList {
    public static void main(String[] args) {
        ArrayList<String> L = new ArrayList<String>();
        Scanner scn = new Scanner(System.in);
        System.out.println("Jep numrin e elementeve:");
        int n = scn.nextInt();
        scn.nextLine();
        for (int i = 0; i < n; i++) {
            L.add(scn.nextLine());
        }
        List<String> arr = new LinkedList<>(L);
        System.out.println("ArrayListi:\n" + L);
        System.out.println("LinkedList i konvertuar:\n" + arr);
        scn.close();
    }
}
