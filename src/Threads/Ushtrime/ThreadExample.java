//Ndertoni nje program, ne java e cila te afishoje
// emrin e thread-it duke ju dhene si emer nje
// numer (psh threade 1, thread 2 etj)
package Threads.Ushtrime;
public class ThreadExample {
    public static void main(String[] args) {
        System.out.println("Threadi Main: \""+Thread.currentThread().getName()+"\"");
        for(int i=0; i<10; i++){
            new Thread("" + i){
                public void run(){
                    System.out.println("Threadi i krijuar \"" + getName() + "\" is running");
                }
            }.start();
        }
    }
}