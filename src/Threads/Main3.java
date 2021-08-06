package Threads;
import java.lang.*;
class Table{
    //Metode e sinkronizuar statike per printim tabele shumezimi
    synchronized static void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.print(n*i+" ");
        try{
            Thread.sleep(400);
        }
        catch(Exception e){
        }
        }System.out.println();
    }
}
class Thread1 extends Thread{
    public void run(){
        Table.printTable(2);
    }
}
class Thread2 extends Thread{
    public void run(){
        Table.printTable(3);
    }
}
public class Main3 {
    public static void main(String[] args) {
Thread1 th1=new Thread1();
Thread2 th2=new Thread2();
        th1.start();
        th2.start();
    }
}
