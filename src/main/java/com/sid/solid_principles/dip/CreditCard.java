package com.sid.solid_principles.dip;

/**
 * @author Siddhant Patni
 */
public class CreditCard implements BankCard {

    public void doTransaction(long amount) {
        System.out.println("payment using Credit card");
    }
}
