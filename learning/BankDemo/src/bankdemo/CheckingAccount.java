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
public class CheckingAccount {
    private double balance;
    private int number;

    public CheckingAccount(int number) {
       this.number = number;
    }

    public void deposit(double amount) {
       this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
       if(amount <= this.balance) {
          this.balance -= amount;
       }else {
          double needs = amount - this.balance;
          throw new InsufficientFundsException(needs);
       }
    }

    public double getBalance() {
       return this.balance;
    }

    public int getNumber() {
       return this.number;
    } 
}
