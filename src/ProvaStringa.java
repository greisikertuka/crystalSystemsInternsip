import java.util.Scanner;
public class ProvaStringa {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Jep stringen per prova:");
        String s=scn.nextLine();
        System.out.println("Madhesia e Stringes: "+s.length());
        String s1=s.replace("e","EEE");
        System.out.println(s1);
        System.out.println(s.concat(" bashkim stringash"));
        System.out.println("Karakteri e ndodhet te:"+s.indexOf('e'));
        String s2=s.replace("EE","e");
        System.out.println("Prova me replace:"+s2);
        String s3=s.substring(2,4);
        System.out.println("Nga pozicioni 2 deri te 4:"+s3);
        String []v=s.trim().split(" ");
        System.out.println("Printimi pasi i bejme split:");
        for (int i=0;i<v.length;i++){
            System.out.println(v[i]);
        }
        System.out.println("Stringa origjinale:"+s);
    scn.close();
    }
}
