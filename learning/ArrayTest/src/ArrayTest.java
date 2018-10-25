/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nazmulbasher
 */
public class ArrayTest {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for(int number : numbers){
            number = (number%2==0) ? 0 : number;
            
            if(number>0)
                System.out.println(number);
        }
        
        System.out.println("----");
        
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        for (int i = 0; i < myList.length; i++) {
           System.out.println(myList[i] + " ");
        }
    }
}
