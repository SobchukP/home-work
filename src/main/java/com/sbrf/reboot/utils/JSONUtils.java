package com.sbrf.reboot.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sbrf.reboot.dto.Request;
import com.sbrf.reboot.dto.Response;

public class JSONUtils {
    public static String toJSON(Object object) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(object);
        return json;
    }

    public static Request JSONtoRequest(String json) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Request request = objectMapper.readValue(json, Request.class);
        return request;
    }

    public static Response JSONtoResponse(String json) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Response response = objectMapper.readValue(json, Response.class);
        return response;
    }
}
