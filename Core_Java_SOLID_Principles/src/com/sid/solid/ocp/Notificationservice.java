package com.sid.solid.ocp;

/**
 * @author Siddhant Patni
 *
 */
public interface Notificationservice {

    public void sendOTP(String medium);

    public void sendTransactionReport(String medium);

}