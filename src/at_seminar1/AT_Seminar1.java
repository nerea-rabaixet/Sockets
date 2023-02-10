/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at_seminar1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nerea
 */
public class AT_Seminar1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        BankAccount account = new BankAccount();
        BankClient client1 = new BankClient(account);
        BankClient client2 = new BankClient(account);
        
        //start the method run() from the bankClient
        client1.start();
        client2.start();
        
        //we will use join to wait for the threads to finish
        try {
            client1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(AT_Seminar1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            client2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(AT_Seminar1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.printf("Balance:%d \n",account.getMoney());
        
    }
    
}
