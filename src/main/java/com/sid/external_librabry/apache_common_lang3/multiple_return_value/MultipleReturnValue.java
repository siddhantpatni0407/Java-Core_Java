package com.sid.external_librabry.apache_common_lang3.multiple_return_value;

import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.MutableTriple;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;

/**
 * @author Siddhant Patni
 */
public class MultipleReturnValue {

    // Return two different linked objects
    // By default Pair is immutable in nature
    public static Pair<Order, ShippingDetails> getOrderInfo1(String orderId) {
        // Order Info
        Order order = OrderService.getOrderDetails(orderId);
        // Shipment details
        ShippingDetails shippingDetails = UserProfileService.getShipmentDetails("Sid");
        return Pair.of(order, shippingDetails);
    }

    // using MutablePair
    public static Pair<Order, ShippingDetails> getOrderInfo2(String orderId) {
        // Order Info
        Order order = OrderService.getOrderDetails(orderId);
        // Shipment details
        ShippingDetails shippingDetails = UserProfileService.getShipmentDetails("Sid");
        return MutablePair.of(order, shippingDetails);
    }

    // Immutable Triple
    public static Triple<Order, ShippingDetails, PaymentDetails> getOrderInfo3(String orderId) {
        // Order Info
        Order order = OrderService.getOrderDetails(orderId);
        // Shipment details
        ShippingDetails shippingDetails = UserProfileService.getShipmentDetails("Sid");
        PaymentDetails paymentDetails = PaymentService.getPaymentDetails("123456");
        return Triple.of(order, shippingDetails, paymentDetails);
    }

    // Mutable Triple
    public static MutableTriple<Order, ShippingDetails, PaymentDetails> getOrderInfo4(String orderId) {
        // Order Info
        Order order = OrderService.getOrderDetails(orderId);
        // Shipment details
        ShippingDetails shippingDetails = UserProfileService.getShipmentDetails("Sid");
        PaymentDetails paymentDetails = PaymentService.getPaymentDetails("123456");
        return MutableTriple.of(order, shippingDetails, paymentDetails);
    }

    public static void main(String[] args) {

        System.out.println("******************************************************");
        System.out.println("*********************** Pair *************************");
        /**
         * Examples of Pair
         */
        System.out.println("Immutable Pair");
        Pair<Order, ShippingDetails> orderInfo1 = getOrderInfo1("OD123");
        System.out.println("Order details1 : " + orderInfo1.getLeft());
        System.out.println("Shipping details1 : " + orderInfo1.getRight());

        // Mutable Pair
        System.out.println("Mutable Pair");
        Pair<Order, ShippingDetails> orderInfo2 = getOrderInfo2("OD123");
        orderInfo2.setValue(new ShippingDetails());
        System.out.println("Order details2 : " + orderInfo2.getLeft());
        System.out.println("Shipping details2 : " + orderInfo2.getRight());

        System.out.println("******************************************************");

        System.out.println("********************** Triple ************************");

        /**
         * Examples of Triple
         */
        // Immutable Triple
        System.out.println("Immutable Triple");
        Triple<Order, ShippingDetails, PaymentDetails> orderInfo3 = getOrderInfo3("OD123");
        System.out.println("Order details3 : " + orderInfo3.getLeft());
        System.out.println("Shipping details3 : " + orderInfo3.getMiddle());
        System.out.println("Payment details3 : " + orderInfo3.getRight());

        System.out.println("Mutable Triple");
        MutableTriple<Order, ShippingDetails, PaymentDetails> orderInfo4 = getOrderInfo4("OD123");
        orderInfo4.setRight(new PaymentDetails());
        System.out.println("Order details3 : " + orderInfo4.getLeft());
        System.out.println("Shipping details3 : " + orderInfo4.getMiddle());
        System.out.println("Payment details3 : " + orderInfo4.getRight());

        System.out.println("******************************************************");


    }

}