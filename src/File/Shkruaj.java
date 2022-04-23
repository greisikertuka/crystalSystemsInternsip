package File;

import java.io.*;

public class Shkruaj {
    public static void main(String[] args) {
        try {
            byte[] bWrite = {90, 80, 74, 15, 3};
            OutputStream os = new FileOutputStream("test.txt");
            for (byte b : bWrite) {
                os.write(b);
            }
            os.close();
            InputStream is = new FileInputStream("test.txt");
            int size = is.available();
            for (int a = 0; a < size; a++) {
                System.out.println((char) is.read() + "   ");
            }
            is.close();
        } catch (IOException e) {
            System.out.println("Vendosem perjashtim");
        }
    }
}