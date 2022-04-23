package Detyra1;

import java.util.Scanner;

public class U7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String e, adr, nr_cel, extra;
        int m, p;
        System.out.println("Jep emrin e punonjesit:\n");
        e = scn.next();
        System.out.println("Jep moshen e punonjesit:\n");
        m = scn.nextInt();
        System.out.println("Jep adresen e punonjesit:\n");
        adr = scn.next();
        System.out.println("Jep numrin e celularit te punonjesit:\n");
        nr_cel = scn.next();
        System.out.println("Jep pagen e punonjesit:\n");
        p = scn.nextInt();
        System.out.println("Jep specializimin e punonjesit:\n");
        extra = scn.next();
        Punonjes pn = new Punonjes(e, m, adr, nr_cel, p, extra);

        System.out.println("Jep emrin e menaxherit:\n");
        e = scn.next();
        System.out.println("Jep moshen e menaxherit:\n");
        m = scn.nextInt();
        System.out.println("Jep adresen e menaxherit:\n");
        adr = scn.next();
        System.out.println("Jep numrin e celularit te menaxherit:\n");
        nr_cel = scn.next();
        System.out.println("Jep pagen e menaxherit:\n");
        p = scn.nextInt();
        System.out.println("Jep departamentin e menaxherit:\n");
        extra = scn.next();
        Menaxher mn = new Menaxher(e, m, adr, nr_cel, p, extra);

        System.out.println("\n\n\nPunonjesi:\n" + pn.toString());
        System.out.println("\n\n======================\n\n");
        System.out.println("Menaxheri:\n" + mn.toString());
    }
}

class Member {
    private String emri;
    private int mosha;
    private String nr_cel;
    private String adresa;
    private int paga;

    Member() {
    }

    Member(String e, int m, String nr, String adr, int p) {
        emri = e;
        mosha = m;
        nr_cel = nr;
        adresa = adr;
        paga = p;
    }

    public String getEmri() {
        return emri;
    }

    public int getMosha() {
        return mosha;
    }

    public String getNumri() {
        return nr_cel;
    }

    public int getPaga() {
        return paga;
    }

    public void setEmri(String e) {
        emri = e;
    }

    public void setMosha(int m) {
        mosha = m;
    }

    public void setNumri(String nr) {
        nr_cel = nr;
    }

    public void setAdresa(String a) {
        adresa = a;
    }

    public void setPaga(int p) {
        paga = p;
    }

    public void printoPagen() {
        System.out.println("Paga:" + paga);
    }

    public String toString() {
        return emri + "\n" + nr_cel + "\n" + mosha + "Vjec" + "\n" + adresa + "\n" + "paga\n" + paga;
    }
}

class Menaxher extends Member {
    private String departamenti;

    Menaxher() {
    }

    Menaxher(String e, int m, String nr, String adr, int p, String d) {
        super(e, m, nr, adr, p);
        departamenti = d;
    }

    public String getDepartamenti() {
        return departamenti;
    }

    public void setDepartamenti(String d) {
        departamenti = d;
    }

    public String toString() {
        return super.toString() + "\n" + departamenti;
    }
}

class Punonjes extends Member {
    private String specializimi;

    Punonjes() {
    }

    Punonjes(String e, int m, String nr, String adr, int p, String s) {
        super(e, m, nr, adr, p);
        specializimi = s;
    }

    public String getSpecializimi() {
        return specializimi;
    }

    public void setSpecializimi(String s) {
        specializimi = s;
    }

    public String toString() {
        return super.toString() + "\n" + specializimi;
    }
}










