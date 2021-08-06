package Matrica;
import java.util.Scanner;
class Lexo{
    int k=0,l=0;
    int []poz=new int[100];
    int []neg=new int[100];
    public Lexo(int[][] v){
        for (int i=0;i<v.length;i++){
            for (int j=0;j<v[0].length;j++){
                if(v[i][j]>0){
                    poz[k]=v[i][j];
                    k++;
                }
                else if(v[i][j]<0){
                    neg[k]=v[i][j];
                    l++;
                }
            }
        }
    }
}
public class Matrica {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Jep numrin e rreshtave te matrices:");
        int m=scn.nextInt();
        System.out.println("Jep numrin e kolonave te matrices:");
        int n=scn.nextInt();
        int [][]v=new int[m][n];
        for (int i=0;i<m;i++){
            System.out.println("Jep elementet e rreshtit "+(i+1)+":");
            for (int j=0;j<n;j++){
                 v[i][j]=scn.nextInt();
            }
        }
        Lexo lexo=new Lexo(v);
        System.out.print("Elementet pozitive:");
        for(int i=0;i<lexo.k;i++){
            System.out.println(lexo.poz[i]+" ");
        }
        System.out.println("\nElementet negative:");
        for(int i=0;i<lexo.l;i++){
            System.out.print(lexo.neg[i]+" ");
        }
        scn.close();
    }

}
