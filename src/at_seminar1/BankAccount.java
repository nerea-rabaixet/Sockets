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
public class BankAccount {
    public int money;    

    public BankAccount() {
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
    //runs this function in a syncronized manner therefore "one thread waits for the other to modify" 
    public synchronized int increase(int value){
        this.money = this.money + value;
        return money;
    }   
}
