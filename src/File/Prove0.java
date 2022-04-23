package File;

import java.io.*;

public class Prove0 {
    public static void main(String[] args) {
        try {
            String[] loadArray = new String[100];
            OutputStream is = new FileOutputStream("test.txt");
            for (String b : loadArray) {
                is.write(Integer.parseInt(b));
            }
            is.close();
            String[] sa = new String[100];
            InputStream os = new FileInputStream("test.txt");

            int size = os.available();
            for (String s : sa) {
                System.out.println(os.read() + "   ");
            }
            os.close();
        } catch (IOException e) {
            System.out.println("Vendosem perjashtim");
        }
    }
}