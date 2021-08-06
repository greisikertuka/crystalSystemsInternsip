package Threads;
class Sender1{
    public synchronized void send(String s){
        //Sinkronizohet direkt te klasa Sender

        System.out.println("Po dergohet:"+s);
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(""+ s+ " u dergua!\n\n");
    }
}
//Klasa per dergimin e mesazhit me threads
class DergimMeThread1  extends Thread{
    private String mesazh;
    Sender1 snd;
    //Merr nje Objekt per mesazh dhe nje  String
    DergimMeThread1(String m, Sender1 obj){
        mesazh=m;
        snd=obj;
    }
    public void run(){
        snd.send(mesazh);
    }
}
public class Test2 {
    public static void main(String[] args) {
        Sender1 snd1=new Sender1();
        DergimMeThread1 th1=new DergimMeThread1("Pershendetje!",snd1);
        DergimMeThread1 th2=new DergimMeThread1("Mireupafshim!",snd1);
        th1.start();
        th2.start();
        try{
            th1.join();
            th2.join();
        }
        catch(Exception e){
            System.out.println("U nderpre ekzekutimi i thread!");
        }
    }
}
