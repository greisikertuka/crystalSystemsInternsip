package Permbledhje1;
import java.util.Scanner;
public class U5 {
    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      System.out.println("Jep numrin si int:");
      int n=scn.nextInt();
      System.out.println("Jep numrin si Stringe:");
      n+=Integer.parseInt(scn.next());
      System.out.println("Shuma: "+n );
      scn.close();
    }
}
