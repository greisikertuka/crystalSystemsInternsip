/*
Exercise 8.7. Realize a class HandleBAs to handle a set of bank accounts, represented as in Units 4 and 5.
        The data for the bank accounts are stored on a text file according to the following format:
        name
        surname
        balance
        The class HandleBAs should export the following methods:
        • HandleBAs(String filename) : constructor that takes as parameter the name of a text file on which the
        data about the bank accounts is stored, and creates a object associated to that file;
        • void interests(double rate) : that updates the balance of all accounts by applying the interest rate
        specified by the parameter;
        • printNegative() : that prints on the video the data about all bank accounts with a negative balance.
*/

package FileDetyrat;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Balanca {
    String emri;
    String mbiemri;
    double balanca;

    Balanca() {
    }

    Balanca(String e, String m, double b) {
        emri = e;
        mbiemri = m;
        balanca = b;
    }

    public String toString() {
        return emri + " " + mbiemri + " " + balanca;
    }
}

class HandleBAs implements Serializable {
    static File f;

    HandleBAs(String filename) {
        f = new File(filename);
    }

    static void writeToFile(ArrayList<Balanca> list) throws IOException {
        System.out.println("Te dhenat per klientet po shkruhen ne file!");
        FileWriter fw = new FileWriter(f);
        PrintWriter pw = new PrintWriter(fw);
        for (int i = 0; i < list.size(); i++) {
            pw.println(list.get(i).emri + " " + list.get(i).mbiemri + " " + list.get(i).balanca);
        }
        pw.close();
        fw.close();
        System.out.println("Te dhenat per klientet u shkruajten ne file!");
    }

    void interests(double rate) throws IOException {
        FileReader fr = null;
        try {
            fr = new FileReader(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fr);
        ArrayList<Balanca> b = new ArrayList<Balanca>();
        String s1 = br.readLine();
        while (s1 != null) {
            Balanca b1 = new Balanca();
            String[] s = s1.split(" ");
            b1.emri = s[0];
            b1.mbiemri = s[1];
            b1.balanca = Double.parseDouble(s[2]);
            b.add(b1);
            s1 = br.readLine();
        }
        br.close();
        fr.close();
        System.out.println("Balancat e update-uara po shkruhen ne file!");
        FileWriter fw = new FileWriter(f);
        PrintWriter pw = new PrintWriter(fw);
        for (int i = 0; i < b.size(); i++) {
            b.get(i).balanca *= (1 + rate / 100);
            pw.println(b.get(i).emri + " " + b.get(i).mbiemri + " " + b.get(i).balanca);
        }
        pw.close();
        fw.close();
        System.out.println("Balancat e update-uara u shkruajten ne file!");
    }

    static void printNegative() throws IOException {
        FileReader fr = null;
        try {
            fr = new FileReader(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fr);
        ArrayList<Balanca> b = new ArrayList<Balanca>();
        String s1 = br.readLine();
        while (s1 != null) {
            Balanca b1 = new Balanca();
            String[] s = s1.split(" ");
            b1.emri = s[0];
            b1.mbiemri = s[1];
            b1.balanca = Double.parseDouble(s[2]);
            b.add(b1);
            s1 = br.readLine();
        }
        br.close();
        fr.close();
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i).balanca < 0)
                System.out.println(b.get(i).toString());
        }
    }
}

public class U7 {
    public static void main(String[] args) {
        ArrayList<Balanca> list = new ArrayList<Balanca>();
        Scanner scn = new Scanner(System.in);
        System.out.println("Jep numrin e klienteve qe doni ti ruani llogarine:");
        int n = scn.nextInt();
        Balanca[] balanca = new Balanca[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Jep emrin,mbiemrin dhe balancen e klientit " + (i + 1));
            balanca[i] = new Balanca(scn.next(), scn.next(), scn.nextDouble());
            list.add(balanca[i]);
        }
        System.out.println("Jepni emrin e file ku doni te shkruani:");
        HandleBAs b = new HandleBAs(scn.next());
        try {
            b.writeToFile(list);
            b.interests(5.0);
            b.printNegative();
        } catch (IOException e) {
            e.printStackTrace();
        }
        scn.close();
    }
}