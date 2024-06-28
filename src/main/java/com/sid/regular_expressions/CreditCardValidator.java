package com.sid.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Siddhant Patni
 */
public class CreditCardValidator {

    public static void main(String[] args) {

        String creditCard = "4111 1111 1111 1111";  // Example Visa card number
        String regex = "^(4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|3[47][0-9]{13})$";

        creditCard = creditCard.replaceAll("\\s+", "");  // Remove spaces

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(creditCard);

        if (matcher.matches()) {
            System.out.println(creditCard + " is a valid credit card number.");
        } else {
            System.out.println(creditCard + " is not a valid credit card number.");
        }
    }

}