package jsonparser;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class MessageWrapperMain {
  public static void main(String[] args) throws IOException {
    String inputJson = "{ \"name\":\"shakti\",\"department\":\"IT\"}";
    ObjectMapper mapper = new ObjectMapper();
    JsonNode jsonNode  = mapper.readValue(inputJson,JsonNode.class);
   // JsonNode jsonNode = Node.mapper().readValue(inputJson,JsonNode.class);
    String test = mapper.writeValueAsString(jsonNode);
    System.out.println(test);

    System.out.println(jsonNode);

    MessageWrapper message = MessageWrapper.of(jsonNode);
    System.out.println(message);

    System.out.println(Template.with("project","es-s2dl-core").apply("${project}"));





  }
}
