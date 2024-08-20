package com.sid.external_librabry.apache_common_lang3.multiple_return_value;

/**
 * @author Siddhant Patni
 */
public class OrderService {

    public static Order getOrderDetails(String orderId) {
        return new Order("123", "456");
    }

}