package Threads.Ushtrime;
class ThreadExample3 implements Runnable{
    public void run(){
        System.out.println("My thread is in running state.");
    }
    // public class ThreadExample{
    public static void main(String args[]){
        Thread obj=new Thread(new ThreadExample3());
       /* ose
        ThreadExample3 obj=new ThreadExample3();
        Thread tobj =new Thread(obj);*/
        obj.start();
    }
}
