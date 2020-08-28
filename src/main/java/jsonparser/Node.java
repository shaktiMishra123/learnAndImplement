package jsonparser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Optional;

import static com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATES_AS_TIMESTAMPS;

public class Node {

  private static final ObjectMapper MAPPER =
      new ObjectMapper()
          .enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS)
          .setSerializationInclusion(JsonInclude.Include.NON_NULL)
          .disable(WRITE_DATES_AS_TIMESTAMPS); // write local dates as string instead of array

  public static String serialize(JsonNode jsonNode) {
    try {
      return mapper().writeValueAsString(jsonNode);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }

  public static Optional<byte[]> getBinaryPropertyOptional(JsonNode node, String propertyName) {
    JsonNode property = node.get(propertyName);
    if (property != null && property.isBinary()) {
      try {
        return Optional.of(property.binaryValue());
      } catch (IOException e) {
        return Optional.empty();
      }
    } else {
      return Optional.empty();
    }
  }

  public static ObjectMapper mapper() {
    return MAPPER;
  }

  public static JsonNode deserialize(String string) {
    try {
      return mapper().readTree(string);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}
