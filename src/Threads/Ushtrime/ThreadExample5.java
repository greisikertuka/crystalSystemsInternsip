package Threads.Ushtrime;
/* Simple Java program to demonstrate how to use multiple threads.
 Steps to use multiple threads in Java :
        1. Implement Runnable interface to put the code
 you want to run in separate thread.
        2. Create an Instance of Thread class by
 passing an instance of Runnable you just created.
        3. Call Thread.start() method, this will
 execute the code in separate thread.*/
public class ThreadExample5 {
    private static class ParallelTask implements Runnable {
        @Override public void run() {
            System.out.println(Thread.currentThread().getName() + " is executing this code");
        }
    }
    public static void main(String[] args) {
        // created three threads but none will start
        // until you call start() method
        Thread t1 = new Thread(new ParallelTask(), "Thread - T1");
        Thread t2 = new Thread(new ParallelTask(), "Thread - T2");
        Thread t3 = new Thread(new ParallelTask(), "Thread - T3");
        // now, let's start all three threads
        t1.start();
        t2.start();
        t3.start();
    }
}
