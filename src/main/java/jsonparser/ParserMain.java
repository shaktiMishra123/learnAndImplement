package jsonparser;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;
import java.time.Instant;

public class ParserMain {
  public static void main(String[] args) throws IOException {
    String inputJson = "{ \"email\":\"abc@123.com\", \"name\":\"shakti\", \"phone\":\"8432739\", \"employee\":{\"id\":\"123\",\"name\":\"sanjeev\"}}";

    String testJson = "{\"_p\":{\"name\":\"shakti\",\"phone\":\"8432739\"},\"_m\":{\"_mt\":\"testType\",\"_id\":\"test\"}}";
    ObjectMapper mapper = new ObjectMapper();
    Parser jsonParser = mapper.readValue(inputJson,Parser.class);
    Parser jp = mapper.readerFor(Parser.class).readValue(inputJson);
    System.out.println(jp.getEmployee().getName());
    System.out.println(jsonParser.getEmail());
    System.out.println(jsonParser.getName());
    System.out.println(jsonParser.getPhone());
    System.out.println(jsonParser.getEmployee().getId());
    System.out.println(jsonParser.getEmployee().getName());

  ObjectNode objectNode = (ObjectNode) mapper.readTree(inputJson);
  if(objectNode.has("test")){
        objectNode.put("_e","testEmployee");
  }

    System.out.println(objectNode);
    JsonNode str = objectNode.remove("email");
    System.out.println(str.toString());
    System.out.println(objectNode);

    System.out.println(Instant.parse("2019-03-19T03:12:46.124Z"));

    System.out.println(objectNode.set("_e",str));

    System.out.println(objectNode);

    ObjectNode testJsonObjNode = (ObjectNode) mapper.readTree(testJson);
    System.out.println("Printing " +testJsonObjNode);

    ObjectNode payload = (ObjectNode) testJsonObjNode.get("_p");
    ObjectNode message = (ObjectNode) testJsonObjNode.get("_m");
    System.out.println(payload);
    System.out.println(message);

    message.put("_test","testValue");
    System.out.println(testJsonObjNode);
    System.out.println(testJsonObjNode);



  }
}
