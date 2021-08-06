package Threads.Ushtrime;
class Example implements Runnable {
    String name;
    Thread t;
    Example (String thread){
        name = thread;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start();
    }
    public void run() {
        try {
            for(int i = 10; i>0;i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting.");
    }
}
class ThreadExample4 {
    public static void main (String args[]) {
        new Example("One");
        new Example("Two");
        new Example("Three");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}