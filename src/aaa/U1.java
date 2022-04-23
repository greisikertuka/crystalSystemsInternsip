package aaa;

class Prove {
    int a = 1;
}

public class U1 {
    public static void main(String[] args) {
        U1 t = new U1();
        if (t instanceof U1) {
            System.out.println("Prova");
        }
        Prove y = new Prove();
        if (y instanceof Prove) {
            System.out.println("Prova");
        }
    }
}
