package com.sid.solid_principles.srp;

/**
 * @author Siddhant Patni
 */
public class NotificationService {
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        }
        if (medium.equals("mobile")) {
            //write logic using twillio API
        }
    }
}
