package Detyra1;

import java.util.Scanner;

public class U9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String e, em;
        char gj;
        System.out.println("Jep emrin e autorit/autores:\n");
        e = scn.next();
        System.out.println("Jep emailin e autorit/autores:\n");
        em = scn.next();
        System.out.println("Jep gjinine e autorit/autores:\n");
        gj = scn.next().charAt(0);
        Author a = new Author(e, em, gj);
        System.out.println(((a.getGjinia() == 'f') ? "Autorja e" : "Autori i") + " krijuar ka keto te dhena:\n"
                + a.toString());
        scn.close();
    }
}

class Author {
    private String emri;
    private String email;
    private char gjinia;

    Author() {
    }

    Author(String e, String em, char gj) {
        emri = e;
        email = em;
        gjinia = gj;
    }

    public String getEmri() {
        return emri;
    }

    public String getEmail() {
        return email;
    }

    public char getGjinia() {
        return gjinia;
    }

    public void setEmri(String e) {
        emri = e;
    }

    public void setEmail(String em) {
        email = em;
    }

    public void setGjinia(char gj) {
        gjinia = gj;
    }

    public String toString() {
        return emri + "\n" + email + "\n" + gjinia;
    }
}

