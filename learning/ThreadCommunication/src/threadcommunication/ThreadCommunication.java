/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadcommunication;

/**
 *
 * @author nazmulbasher
 */

class Chat {
   boolean flag = false;

   public synchronized void FromSam(String msg) {
      if (flag) {
         try {
            wait();
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
      
      System.out.println(msg);
      
      flag = true;
      notify();
   }

   public synchronized void FromJam(String msg) {
      if (!flag) {
         try {
            wait();
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }

      System.out.println(msg);
      
      flag = false;
      notify();
   }
}

class T1 implements Runnable {
   Chat m;
   String[] s1 = { "Hi", "How are you?", "I am also doing fine!" };

   public T1(Chat m1) {
      this.m = m1;
      new Thread(this, "Question").start();
   }

   public void run() {
      for (int i = 0; i < s1.length; i++) {
         m.FromSam(s1[i]);
      }
   }
}

class T2 implements Runnable {
   Chat m;
   String[] s2 = { "Hello", "I am good, what about you?", "Great!" };

   public T2(Chat m2) {
      this.m = m2;
      new Thread(this, "Answer").start();
   }

   public void run() {
      for (int i = 0; i < s2.length; i++) {
         m.FromJam(s2[i]);
      }
   }
}

public class ThreadCommunication {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Chat m = new Chat();
        new T1(m);
        new T2(m);
    }
}
