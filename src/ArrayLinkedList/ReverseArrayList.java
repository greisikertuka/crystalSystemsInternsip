package ArrayLinkedList;
import java.util.ArrayList;
import java.util.Collections;
public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("Apple");
        l.add("Banana");
        l.add("Kiwi");
        l.add("Mango");
        System.out.println("Before Reversing");
        System.out.println(l.toString());
        Collections.reverse(l);
        System.out.println("After Reversing");
        System.out.println(l);
    }
}