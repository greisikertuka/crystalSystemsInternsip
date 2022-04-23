package File;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileOutputStream;

public class Data {
    public static void main(String[] args) {
        byte[] array = new byte[100];
        try {
            InputStream input = new FileInputStream("studente.txt");
            System.out.println("Byte te disponueshme ne file jane  " + input.available());
            input.read(array);
            String data = new String(array);
            System.out.println("Afisho data " + data);
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}