package com.sid.solid_principles.dip;

/**
 * @author Siddhant Patni
 */
public class ShoppingMall {

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public static void main(String[] args) {
        // DebitCard debitCard=new DebitCard();
        // CreditCard creditCard=new CreditCard();

        BankCard bankCard = new CreditCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.doPurchaseSomething(5000);
    }

    public void doPurchaseSomething(long amount) {
        bankCard.doTransaction(amount);
    }
}