/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadclassdemo;

/**
 *
 * @author nazmulbasher
 */
public class ThreadClassDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable hello = new DisplayMessage("Hello");
        Thread thread1 = new Thread(hello);
        thread1.setDaemon(true);
        thread1.setName("hello");
        System.out.println("Starting hello thread...");
        thread1.start();

        Runnable bye = new DisplayMessage("Goodbye");
        Thread thread2 = new Thread(bye);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.setDaemon(true);
        System.out.println("Starting goodbye thread...");
        thread2.start();

        System.out.println("Starting thread3...");
        Thread thread3 = new GuessANumber(32);
        thread3.setName("thread3");
        thread3.start();
        try {
           thread3.join();
        } catch (InterruptedException e) {
           System.out.println("Thread interrupted.");
        }
        
        System.out.println("Starting thread4...");
        Thread thread4 = new GuessANumber(8);
        thread4.setName("thread4");
        thread4.start();
        System.out.println("main() is ending...");
    }
}
