package ArrayLinkedList;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
public class HiqElementetePerseritura {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("Apple");
        l.add("Banana");
        l.add("Mango");
        l.add("Mango");
        System.out.println(l);
        Set<String> s = new LinkedHashSet<String>(l);
        System.out.println(s);
    }
}
