package Permbledhje1;

public class U4 {
    public static void main(String[] args) {
        char[] c = {'J', 'a', 'v', 'a'};
        System.out.println("Vektori i karaktereve:");
        for (int i = 0; i < 4; i++) {
            System.out.println(c[i] + " ");
        }
        String s = new String(c);
        System.out.println("Stringa e krijuar:\n" + s);
    }
}
