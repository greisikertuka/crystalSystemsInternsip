package AccessModifiers;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

class Punonjes implements Cloneable {
    private String emri;
    private int ditepune;
    private Date ditepushim = new Date();

    Punonjes(String e, int d) {
        emri = e;
        ditepune = d;
        Date ditepushimi = new Date();
    }

    public String getEmri() {
        return emri;
    }

    public int getDitepune() {
        return ditepune;
    }

    public Date getDitepushim() {
        return ditepushim;
    }

    public void setEmri(String e) {
        emri = e;
    }

    public void setDitePune(int d) {
        ditepune = d;
    }

    public void shtoDitePune(int m) {
        ditepune += m;
    }

    public void setDitePushim(int d, int m, int v) {
        ditepushim = (new GregorianCalendar(v, m - 1, d)).getTime();
    }

    public Object clone() throws CloneNotSupportedException {
        Punonjes p = (Punonjes) super.clone();
        p.ditepushim = (new GregorianCalendar(this.ditepushim.getYear(), this.ditepushim.getMonth() - 1,
                this.ditepushim.getDay())).getTime();
        return p;
    }

}

public class TestPunonjes {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner scn = new Scanner(System.in);
        System.out.println("Jep emrin e punonjesit:");
        String e = scn.nextLine();
        System.out.println("Jep numrin e diteve te punes se punonjesit:");
        int n = scn.nextInt();
        Punonjes p = new Punonjes(e, n);
        System.out.println("\n\nPunonjesi i krijuar:" +
                "\nEmri: \t" + p.getEmri() + "\nDite pune: \t" + p.getDitepune() + "" +
                "" + "\nDite pushimi: \n" + p.getDitepushim());
        System.out.println("Jep vitin e dites se pushimit:");
        int v = scn.nextInt();
        System.out.println("Jep muajin e dites se pushimit:");
        int m = scn.nextInt();
        System.out.println("Jep diten e dites se pushimit:");
        int d = scn.nextInt();
        p.setDitePushim(d, m, v);
        System.out.println("\n\nPas vendosjes se dates:" +
                "\nEmri: \t" + p.getEmri() + "\nDite pune: \t" + p.getDitepune() + "" +
                "" + "\nDite pushimi: \n" + p.getDitepushim());
        scn.close();
        System.out.println("Jep nr e diteve te punes shtese:");
        p.shtoDitePune(10);
        System.out.println("\n\nPas shtimit te 10 diteve te punes:" +
                "\nEmri: \t" + p.getEmri() + "\nDite pune: \t" + p.getDitepune() + "" +
                "" + "\nDite pushimi: \n" + p.getDitepushim());
        Punonjes pCopy = (Punonjes) p.clone();
        System.out.println("\n\nPPunonjesi i klonuar:" +
                "\nEmri: \t" + pCopy.getEmri() + "\nDite pune: \t" + pCopy.getDitepune() + "" +
                "" + "\nDite pushimi: \n" + pCopy.getDitepushim());
        System.out.println((p == pCopy) ? "Objektet ndodhen te i njejti vend ne memorje" : "" +
                "Objektet nuk ndodhen te i njejti vend ne memorje");
        System.out.println((p.getDitepushim() == pCopy.getDitepushim()) ? "Datat e pushimit ndodhen te i njejti vend ne memorje" : "" +
                "Datat e pushimit nuk ndodhen te i njejti vend ne memorje");
        scn.close();
    }
}
