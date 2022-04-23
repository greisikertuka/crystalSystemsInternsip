package Threads;

import java.lang.*;

//Sender dergon nje mesazh
class Sender {
    public void send(String s) {
        System.out.println("Po dergohet:" + s);
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Threadi u nderpre!");
        }
        System.out.println("\n" + s + " u dergua!");
    }
}

//Klasa per dergimin e mesazhit me threads
class DergimMeThread extends Thread {
    private String mesazh;
    Sender snd;

    //Merr nje Objekt per mesazh dhe nje  String
    DergimMeThread(String m, Sender obj) {
        mesazh = m;
        snd = obj;
    }

    public void run() {
        //Sinkronizojme Sender brenda metodes run
        synchronized (snd) {
            snd.send(mesazh);
        }
    }
}

class Test1 {
    public static void main(String[] args) {
        Sender snd = new Sender();
        DergimMeThread th1 = new DergimMeThread("Pershendetje", snd);
        DergimMeThread th2 = new DergimMeThread("Mireupafshim!", snd);
        th1.start();
        th2.start();
    }
}
