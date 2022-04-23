package Permbledhje1;

import java.util.Scanner;

class Test1 implements Cloneable {
    private int x;
    private int y;

    Test1() {
    }

    Test1(int x1, int y1) {
        x = x1;
        y = y1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x1) {
        x = x1;
    }

    public void setY(int y1) {
        y = y1;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Test2 extends Test1 implements Cloneable {
    private int z;
    Test1 t;

    Test2() {
    }

    Test2(int x1, int y1, int z1) {
        super(x1, y1);
        z = z1;
    }

    public Object clone() throws CloneNotSupportedException {
        Test2 obj = (Test2) super.clone();
        obj.t = (Test1) super.clone();
        return obj;
    }

    public void setZ(int z1) {
        z = z1;
    }

    public int getZ() {
        return z;
    }
}

public class U2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner scn = new Scanner(System.in);
        System.out.println("Jep x dhe y per objektin Test1:");
        Test1 t1 = new Test1(scn.nextInt(), scn.nextInt());
        System.out.println("Jep z per objektin Test2");
        Test2 t2 = new Test2(t1.getX(), t1.getY(), scn.nextInt());
        System.out.println("Objekti i krijuar:" +
                "\nx: " + t2.getX() + "\ny: " + t2.getY() + "\nz: " + t2.getZ());
        Test2 t2Copy = (Test2) t2.clone();
        System.out.println("Objekti i klonuar:" +
                "\nx: " + t2Copy.getX() + "\ny: " + t2Copy.getY() + "\nz: " + t2Copy.getZ());
        System.out.println((t2 == t2Copy) ? "Objektet Test2 ndodhen te i njejti vend ne memorje" : "" +
                "Objektet Test2 nuk ndodhen te i njejti vend ne memorje");

        System.out.println((t2.t == t2Copy.t) ? "Objektet Test1 brenda objekteve Test 2 ndodhen te i njejti vend ne memorje" +
                "" : "Objektet Test1 brenda objekteve Test2 nuk ndodhen te i njejti vend ne memorje");
        scn.close();
    }
}
