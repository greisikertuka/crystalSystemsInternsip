package Threads.Ushtrime;

import java.util.Scanner;

public class TestPrintim extends Thread {
    public void run() {
        Thread t = currentThread();
        String emri = t.getName();
        System.out.println("Po hyjme te loop:" + emri);
        for (int i = 0; i < 3; i++) {
            System.out.println(t.getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Dolem nga Loop!");
    }

    public static void main(String[] args) {
        TestPrintim t = new TestPrintim();
        t.setName("Prova");
        t.start();
    }
}
