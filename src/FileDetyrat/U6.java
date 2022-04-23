package FileDetyrat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

class IOFilee {
    static String emriFile;
    static int nr_rreshtash = 0;

    IOFilee(String e) {
        emriFile = e;
    }

    static int countLines() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(emriFile));

        String str = br.readLine();
        while (str != null) {
            nr_rreshtash++;
            str = br.readLine();
        }
        br.close();
        return nr_rreshtash;
    }

    static void write(OutputStream os) throws IOException {
        String s = "Po ndryshojme permbajtjen e file";
        os = new FileOutputStream(emriFile);
        os.write(s.getBytes(StandardCharsets.UTF_8));
        os.close();
    }

    static void printo() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(emriFile));
        String s = br.readLine();
        System.out.println(s);
        for (int i = 0; i < nr_rreshtash - 1; ++i) {
            s = br.readLine();
            System.out.println(s);
        }
        br.close();
    }

    static void copy(String e) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(emriFile));
        PrintWriter pw = new PrintWriter(new FileWriter(e));
        String s;
        for (int i = 0; i < nr_rreshtash; ++i) {
            s = in.readLine();
            pw.println(s);
        }
        pw.close();
        in.close();
    }

    static void delete() {
        File f = new File(emriFile);
        System.out.println(f.delete());
    }
}

public class U6 {
    public static void main(String[] args) {
        IOFilee var1 = new IOFilee("u66.txt");

        try {
            System.out.println("Numri i rreshtave eshte:" + IOFilee.countLines());
            System.out.println("Printimi i elementeve:");
            IOFilee.printo();
            System.out.println("Jep emrin per filen qe do kopjohet");
            Scanner scn = new Scanner(System.in);
            String s = scn.next();
            scn.close();
            IOFilee.copy(s);
            System.out.println("Do ndryshohet permbajtja e file!");
            OutputStream os = null;
            IOFilee.write((OutputStream) os);
        } catch (IOException var5) {
            var5.printStackTrace();
        }

        System.out.println("Do fshihet file:");
        IOFilee.delete();
    }
}