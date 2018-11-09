/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericmethodstest;

/**
 *
 * @author nazmulbasher
 */
public class GenericMethodsTest {
    
    public static <E> void printArray(E[] inputArray){
        for(E element:inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
    
    public static <E> E getData(E x, E y){
        E r = null;
        
        r = x.equals(y) ? x : y;
        
        return r;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] intArray = {1, 3, 5};
        Double[] doubleArray = {2.5, 5.6, 7.1};
        
        System.out.println("Array integer Array contains:");
        printArray(intArray);
        
        System.out.println("Array double Array contains:");
        printArray(doubleArray);
        
        System.out.println(getData(2, 3));
        System.out.println(getData(4.5, 5.5));
        
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(10);
        stringBox.add("Hello World");

        System.out.printf("\nInteger Value: %d\n", integerBox.get());
        System.out.printf("String Value: %s\n", stringBox.get());
        
    }    
}

class Box<T> {
    private T t;

    public void add(T t) {
       this.t = t;
    }

    public T get() {
       return t;
    }
}
