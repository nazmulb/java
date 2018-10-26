/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankdemo;

/**
 *
 * @author nazmulbasher
 */
public class InsufficientFundsException extends Exception {
    private double amount;
    
    public InsufficientFundsException(double amount){
        this.amount = amount;
    }
    
    public double getAmount(){
        return this.amount;
    }
}
