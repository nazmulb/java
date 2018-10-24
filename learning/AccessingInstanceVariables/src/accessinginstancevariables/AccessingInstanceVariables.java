/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accessinginstancevariables;

/**
 *
 * @author nazmulbasher
 */
public class AccessingInstanceVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("Tommy");
        myPuppy.setAge(2);
        myPuppy.getAge();
    } 
}

class Puppy {
    int puppyAge;
    
    public Puppy(String name){
        System.out.println("Name chosen is: "+name);
    }
    
    public void setAge(int age){
        puppyAge = age;
    }
    
    public int getAge(){
        System.out.println("Puppy's age is: " + puppyAge );
        return puppyAge;
    }
}
