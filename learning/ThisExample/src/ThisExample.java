/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nazmulbasher
 */
public class ThisExample {
    int num;
    
    ThisExample(){
        System.out.println("This is an example program on keyword this");
    }
    
    ThisExample(int num) {
        // Invoking the default constructor
        this();
        
        this.num = num;
    }
    
    public void print() {
      // Local variable num
      int num = 20;
      
      // Printing the local variable
      System.out.println("value of local variable num is : "+num);
      
      // Printing the instance variable
      System.out.println("value of instance variable num is : "+this.num);     
    }
    
    protected void finalize( ) {
        System.out.println("finalize method is called.");
    }
    
    public static void main(String[] args) {
      // Instantiating the class
      ThisExample obj1 = new ThisExample();
      
      // Invoking the print method
      obj1.print();
	  
      // Passing a new value to the num variable through parametrized constructor
      ThisExample obj2 = new ThisExample(30);
      
      // Invoking the print method again
      obj2.print();
      
      // Unreference the object
      obj1 = null;
      
      // Requesting JVM to call Garbage Collector method 
      System.gc();
   }
}
