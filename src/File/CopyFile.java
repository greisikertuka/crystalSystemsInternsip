package File;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {

        InputStream in = null;                 //Mund ta bejme dhe FileReader in=null;
        OutputStream out = null;              //Mund ta bejme dhe FileWriter out=null;
        try {
            in = new FileInputStream("input.txt");     //  in=new FileReader("input.txt");
            out = new FileOutputStream("output.txt");  //  out=new FileWriter("output.txt")
            int c = 0;
            while ((c = in.read()) != -1) {    //Metoda read() lexon byte dhe kthen nje numer nga 0 ne 255, -1 kur arrihet end-of-file
                out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null)
                in.close();
            if (out != null)
                out.close();
        }

    }
}