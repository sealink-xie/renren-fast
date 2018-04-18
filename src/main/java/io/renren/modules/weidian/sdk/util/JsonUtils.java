package io.renren.modules.weidian.sdk.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.renren.modules.weidian.sdk.exception.OpenException;

import java.io.IOException;

public class JsonUtils {

  public static final ObjectMapper MAPPER = new ObjectMapper();

  static {
    MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
  }

  public static String toJson(Object obj) throws OpenException {
    try {
      return MAPPER.writeValueAsString(obj);
    } catch (JsonProcessingException e) {
      throw new OpenException("object parse to json string error", e);
    }
  }

  public static <T> T toObject(String json, Class<T> cls) throws OpenException {
    try {
      return MAPPER.readValue(json, cls);
    } catch (IOException e) {
      throw new OpenException("json string parse to object error", e);
    }
  }
}
