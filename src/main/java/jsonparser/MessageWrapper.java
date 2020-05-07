package jsonparser;

import com.fasterxml.jackson.databind.JsonNode;

public class MessageWrapper {
private final JsonNode json;

  public MessageWrapper(JsonNode json) {
    this.json = json;
  }

  public static MessageWrapper of(JsonNode json){
    return new MessageWrapper(json);
  }


  @Override
  public String toString() {
    return Node.serialize(json);
  }
}

