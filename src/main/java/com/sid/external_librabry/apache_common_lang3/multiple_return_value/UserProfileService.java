package com.sid.external_librabry.apache_common_lang3.multiple_return_value;

/**
 * @author Siddhant Patni
 */
public class UserProfileService {

    public static ShippingDetails getShipmentDetails(String orderId) {
        return new ShippingDetails("Sid", "XYZ", "07-08-2023");
    }

}