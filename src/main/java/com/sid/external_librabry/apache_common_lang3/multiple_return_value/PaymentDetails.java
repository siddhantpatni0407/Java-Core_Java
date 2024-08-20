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
public class PaymentDetails {

    private String paymentMethod;
    private String transactionId;

}