package com.sid.solid_principles.ocp;

/**
 * @author Siddhant Patni
 */
public interface Notificationservice {

    public void sendOTP(String medium);

    public void sendTransactionReport(String medium);

}