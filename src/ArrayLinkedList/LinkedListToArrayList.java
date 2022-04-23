package ArrayLinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;

public class LinkedListToArrayList {
    public static void main(String[] args) {
        LinkedList<String> L = new LinkedList<String>();
        Scanner scn = new Scanner(System.in);
        System.out.println("Jep numrin e elementeve:");
        int n = scn.nextInt();
        scn.nextLine();
        for (int i = 0; i < n; i++) {
            L.add(scn.nextLine());
        }
        List<String> arr = new ArrayList<>(L);
        System.out.println("LinkedList:\n" + L);
        System.out.println("ArrayListi i konvertuar:\n" + arr);
        scn.close();
    }
}
