/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at_seminar1;

/**
 *
 * @author Nerea
 */
public class BankClient extends Thread{
    public BankAccount account;

    public BankClient(BankAccount account) {
        this.account = account;
    }
    
    public void run(){
        for(int i =0; i<10000;i++){
            account.increase(1);
        }
        System.out.println("Running");
    }
    
    
    
    
}
