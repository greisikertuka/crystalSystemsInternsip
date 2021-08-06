package Threads;
import java.util.Random;
public class UshtrimMatrica {
    static int [][] mat1=new int[3][3];
    static int [][] mat2=new int[3][3];
    static int [][] mat3=new int[3][3];
    public static void main(String[] args) {
        Random rnd=new Random();
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1.length;j++){
                mat1[i][j]=rnd.nextInt(10);
            }
        }
        System.out.println("\nMatrica e pare:");
        for (int i=0;i<mat1.length;i++){
            for (int j=0;j< mat1.length ;j++){
                System.out.print(mat1[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                mat2[i][j]=rnd.nextInt(10);
            }
        }
        System.out.println("\nMatrica e dyte:");
        for (int i=0;i< 3;i++){
            for (int j=0;j< 3 ;j++){
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println();
        }
        Shumefishim sh=new Shumefishim(3);
        new Thread(new matShumefish(sh)).start();
        new Thread(new matShumefish(sh)).start();
        new Thread(new matShumefish(sh)).start();
        System.out.println("\nRezultati");
        for (int i=0;i<3;i++){
            for (int j=0;j< 3 ;j++){
                System.out.print(mat3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class Shumefishim extends UshtrimMatrica{
    private int i;
    private int j;
    private int rreshti;
    public Shumefishim(int n){
        i=n;
        j=n;
        rreshti=0;
    }
    public synchronized void matricaShumefishim(){
        int shuma;
        for (int k=0;k<i;k++){
            shuma=0;
            for (int l=0;l<j;l++){
                shuma+=mat1[rreshti][l]*mat2[l][k];
            }
            mat3[rreshti][k]=shuma;
        }
        if (rreshti>i){
            return;
        }
        else
            rreshti++;
    }
}
class matShumefish implements Runnable{
    private final Shumefishim sh;
    public matShumefish(Shumefishim sh1){
        sh=sh1;
    }
    public void run(){
        sh.matricaShumefishim();
    }
}
