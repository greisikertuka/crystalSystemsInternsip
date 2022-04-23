package ArrayLinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class KlonimLinked {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();
        Scanner scn = new Scanner(System.in);
        System.out.println("Jep numrin e elementeve:");
        int n = scn.nextInt();
        scn.nextLine();
        System.out.println("Jep " + n + " elementet:");
        for (int i = 0; i < n; i++) {
            l.add(scn.nextLine());
        }
        LinkedList<String> lClone = (LinkedList) l.clone();
        System.out.println("LinkedListi origjinal:\n" + l);
        System.out.println("Lista e klonuar:\n" + lClone);
        scn.close();
    }
}
