package com.sid.utility;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Siddhant Patni
 */
public class JsonUtil {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static String toJson(Object object) throws Exception {
        return mapper.writeValueAsString(object);
    }

    public static <T> T fromJson(String json, Class<T> clazz) throws Exception {
        return mapper.readValue(json, clazz);
    }

}