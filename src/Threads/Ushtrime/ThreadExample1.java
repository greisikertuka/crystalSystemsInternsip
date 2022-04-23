package Threads.Ushtrime;

class Numero extends Thread {
    Numero() {
        this.setName("Threadi");   //ose super("Threadi")
        System.out.println("Krijimi i thread-eve tona: \n" + this);
        start();
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printo numerimin " + i);
                // thread to sleep for 1000 milliseconds
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("My thread run is over");
    }
}

public class ThreadExample1 {
    public static void main(String args[]) {
        Numero nr = new Numero();
        try {
            while (nr.isAlive()) {
                System.out.println("Thread \"" + nr.getName() + "\" do te aktivizohet derisa \nthread-et e tjera 'femije' do te behen aktive");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread's run is over");
    }
}
