package com.sid.solid.dip;

/**
 * @author Siddhant Patni
 *
 */
public class CreditCard implements BankCard{

    public void doTransaction(long amount){
        System.out.println("payment using Credit card");
    }
}
