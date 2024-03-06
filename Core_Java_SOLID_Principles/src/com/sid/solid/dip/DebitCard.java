package com.sid.solid.dip;

/**
 * @author Siddhant Patni
 */
public class DebitCard implements BankCard {

    public void doTransaction(long amount) {
        System.out.println("payment using Debit card");
    }
}
