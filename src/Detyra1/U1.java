package Detyra1;
import java.util.Scanner;
public class U1 {
    public static void main(String [] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Jep vleren e investimit:");
        double v=scn.nextDouble();
        System.out.println("Jep normen e interesit:");
        double n=scn.nextDouble();
        System.out.println("Jep numrin e viteve:");
        int nr=scn.nextInt();
        System.out.println("\nViti\tVlera ne te ardhmen");
        for(int i=0;i<nr;i++) {
            System.out.println("\n"+(i+1)+"\t"+vlera(v,n,i+1));
            v=vlera(v,n,i+1);
        }
        scn.close();
    }
    public static double vlera(double v,double n,int nr ) {
        for(int i=0;i<nr;i++) {
            v=v*(1+n);
        }
        return v;
    }
}
