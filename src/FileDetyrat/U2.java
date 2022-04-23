/*Exercise 8.2. Write a public static method that reads from the keyboard a sequence of positive integers until
        the value 0 is inserted, and returns a double representing the average of the read values (without considering
        the final 0).*/

package FileDetyrat;

import java.io.*;
import java.util.Objects;

public class U2 {
    static double mes;
    static int nr_elem;

    static void provo() throws IOException {
        String s;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PrintStream ps = new PrintStream(System.out);
        System.out.println("Jep nje numer te ndryshem nga 0:");
        while (true) {
            int nr = Integer.parseInt((br.readLine()));
            ps.println("Numri i dhene eshte:\n" + nr);
            if (nr == 0) {
                System.out.println("Ju dhate numrin 0!\n" +
                        "Mesatarja e " + nr_elem + " numrave qe dhate: " + mes);
                break;
            }
            nr_elem++;
            mes = (mes + nr) / nr_elem;
            System.out.println("Jep nje numer te ndryshem nga 0:");
        }
        ps.close();
        br.close();
        isr.close();
    }

    public static void main(String[] args) {
        U2 obj = new U2();
        try {
            obj.provo();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
