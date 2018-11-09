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
public class DisplayMessage implements Runnable {
   private String message;
   
   public DisplayMessage(String message) {
      this.message = message;
   }
   
   public void run() {
      while(true) {
         System.out.println(message);
      }
   }
}
