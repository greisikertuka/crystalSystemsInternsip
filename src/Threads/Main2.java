package Threads;

import java.lang.*;

class NumberClass {
    synchronized void printoKatror(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(Thread.currentThread().getName() + " :: " + i * i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        final NumberClass number = new NumberClass();
        Runnable thread = new Runnable() {
            @Override
            public void run() {
                number.printoKatror(4);
            }
        };
        new Thread(thread, "Threadi i pare").start();
        new Thread(thread, "Threadi i dyte").start();

    }
}
