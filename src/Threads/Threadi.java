package Threads;
import java.lang.*;
public class Threadi implements Runnable{
    public void run(){
           System.out.println("Threadi vazhdoi!");
    }
    public static void main(String[] args) {
        Thread thr=new Thread(new Threadi());
        thr.start();
    }
}
