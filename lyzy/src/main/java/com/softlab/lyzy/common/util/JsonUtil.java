package com.softlab.lyzy.common.util;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Map;

public class JsonUtil {

    private static final Logger logger = LoggerFactory.getLogger(JsonUtil.class);

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static String getJsonString(Object object) {
        String jsonString = null;
        try {
            jsonString = objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            logger.error(e.getLocalizedMessage());
        }
        return jsonString;
    }

    public static Map<String, Object> getMapFromJson(String jsonString) {
        Map map;
        try {
            map = objectMapper.readValue(jsonString, Map.class);
        } catch (IOException e) {
            map = null;
            logger.error(e.getLocalizedMessage());
        }
        return map;
    }

    public static <T> T getObjFromJson(String jsonString, Class<T> valueType) {
        T rtv = null;
        try {
            rtv = objectMapper.readValue(jsonString, valueType);
        } catch (IOException e) {
            logger.error(e.getLocalizedMessage());
        }
        return rtv;
    }
}
