package jsonparser;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class ParserMain {
  public static void main(String[] args) throws IOException {
    String inputJson = "{ \"email\":\"abc@123.com\", \"name\":\"shakti\", \"phone\":\"8432739\", \"employee\":{\"id\":\"123\",\"name\":\"sanjeev\"}}";
    ObjectMapper mapper = new ObjectMapper();
    Parser jsonParser = mapper.readValue(inputJson,Parser.class);
    Parser jp = mapper.readerFor(Parser.class).readValue(inputJson);
    System.out.println(jp.getEmployee().getName());
    System.out.println(jsonParser.getEmail());
    System.out.println(jsonParser.getName());
    System.out.println(jsonParser.getPhone());
    System.out.println(jsonParser.getEmployee().getId());
    System.out.println(jsonParser.getEmployee().getName());
  }
}
