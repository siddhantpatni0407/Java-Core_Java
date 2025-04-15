package com.sid.utility;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Siddhant Patni
 */
public class PasswordUtil {

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public static String encodePassword(String password) {
        return encoder.encode(password);
    }

    public static boolean matchPassword(String rawPassword, String encodedPassword) {
        return encoder.matches(rawPassword, encodedPassword);
    }

}