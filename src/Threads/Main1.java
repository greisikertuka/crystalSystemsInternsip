package Threads;
import java.lang.*;
class PrntCount{
    public void princounter(){
        for(int i=10;i>=0;i--){
               System.out.println("Counter ===> " +i);
        }
    }
}
class ThreadCounter1 extends Thread{
    private Thread t;
    private String threadName;
    PrntCount PD;
    ThreadCounter1(String tt,PrntCount p){
        threadName=tt;
        PD=p;
    }
    public void start(){
        System.out.println("Starting "+threadName);
        if(t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }
    public void run(){
        synchronized (PD){    //Nqs do hiqej kjo s do kishte sinkronizm threadesh
        PD.princounter();
        System.out.println("Thread:"+threadName+" exiting.");
    }}

}
public class Main1 {
    public static void main(String[] args) {
PrntCount PD=new PrntCount();
ThreadCounter1 t1=new ThreadCounter1("ThreadCounter 1",PD);
ThreadCounter1 t2=new ThreadCounter1("ThreadCounter 2",PD);
t1.start();
t2.start();
try{
    t1.join();
    t2.join();
}
catch(Exception e){
    System.out.println("Thread u nderpre");
}
    }
}
