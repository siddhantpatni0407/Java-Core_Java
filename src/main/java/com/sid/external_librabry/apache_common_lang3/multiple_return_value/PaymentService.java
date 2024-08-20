package com.sid.external_librabry.apache_common_lang3.multiple_return_value;

/**
 * @author Siddhant Patni
 */
public class PaymentService {

    public static PaymentDetails getPaymentDetails(String orderId) {
        return new PaymentDetails("Credit Card", "123456789");
    }

}