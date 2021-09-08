package com.sbrf.reboot.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.sbrf.reboot.dto.Request;
import com.sbrf.reboot.dto.Response;

public class XMLUtils {
    public static String toXML(Object object) throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(object);
        return xml;
    }

    public static Request XMLtoRequest(String xml) throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        Request request = xmlMapper.readValue(xml, Request.class);
        return request;
    }

    public static Response XMLtoResponse(String xml) throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        Response response = xmlMapper.readValue(xml, Response.class);
        return response;
    }
}
