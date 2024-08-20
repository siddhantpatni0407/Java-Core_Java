package com.sid.external_librabry.apache_common_lang3.multiple_return_value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Siddhant Patni
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShippingDetails {

    private String userId;
    private String shippingAddress;
    private String deliveryDate;

}