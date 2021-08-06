package ThreadsMatrica;
import java.util.Random;
class Matrica implements Runnable{
    int m1[][] = new int[3][3];
    int m2[][] = new int[3][3];
    int m3[][] = new int[3][3];
    int rreshti;
    Matrica(){}
public void mbush(int[][] m11, int[][] m22) {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            m1[i][j] = m11[i][j];
            m2[i][j] = m22[i][j];
            rreshti=0;
            }
       }
    }
        public synchronized void shumezim (){
            int shuma;
            for (int k = 0; k < m1.length; k++) {
                shuma = 0;
                for (int l = 0; l < m1[0].length; l++) {
                    shuma += m1[rreshti][l] * m2[l][k];
                }
                m3[rreshti][k] = shuma;
            }
            if (rreshti > m1.length) {
                return;
            } else
                rreshti++;
        }
        public synchronized void printo(){
            System.out.println("Rezultati pas shtimit te rreshtit te "+rreshti+ ":");
            for (int i=0;i<m3.length;i++){
                for (int j=0;j< m3.length ;j++){
                    System.out.print(m3[i][j]+" ");
                }
                System.out.println();
            }
        }
        public void run(){
        shumezim();
        printo();
    }
}
public class UshtrimMatrice {
    public static int[][] mbushMatricen(int[][] mat1){
        Random rnd=new Random();
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1.length;j++){
                mat1[i][j]=rnd.nextInt(10);
            }
        }
        System.out.println("\nMatrica e krijuar:");
        for (int i=0;i<mat1.length;i++){
            for (int j=0;j< mat1.length ;j++){
                System.out.print(mat1[i][j]+" ");
            }
            System.out.println();
        }
        return mat1;
    }
    public static void main(String[] args) {
        int m1[][]=new int [3][3];
        int m2[][]=new int [3][3];
        int m3[][]=new int [3][3];
        mbushMatricen(m1);
        mbushMatricen(m2);
        Matrica m=new Matrica();
        m.mbush(m1,m2);
        Thread th1=new Thread(m);
        Thread th2=new Thread(m);
        Thread th3=new Thread(m);
        th1.start();
        th2.start();
        th3.start();
    }
}
