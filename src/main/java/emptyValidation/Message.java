package emptyValidation;

import java.util.Arrays;
import java.util.Objects;

public class Message {

  private static final  String DEFAULT_TEMPLATE = "'%s' should be valid";
  private static final Object[] DEFAULT_ARGS = new Object[] {"value"};


  private final String template;
  private final Object[] args;

  public Message(String template, Object[] args) {
    this.template = template;
    this.args = args;
  }

  public static Message withDefaults(){
    return new Message(DEFAULT_TEMPLATE,DEFAULT_ARGS);
  }

  public boolean isDefault(){
    return equals(withDefaults());
  }

  public boolean isDefaultArgs(){
    return Arrays.equals(DEFAULT_ARGS,args);
  }

  public boolean isDefaultTemplate(){
    return template.equals(DEFAULT_TEMPLATE);
  }

  public Message template(String template){
    return new Message(template,args);
  }

  public Message args(Object[] args){
    return new Message(template,args);
  }

  public String getTemplate() {
    return template;
  }

  public Object[] getArgs() {
    return args;
  }

  public Message propagateArgs(Message other){
    if(other.isDefaultArgs()){
      return this;
    }
    else
      return this.args(other.getArgs());
  }

  @Override
  public String toString() {
    return String.format(template,args);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Message message = (Message) o;
    return Objects.equals(template, message.template) &&
        Arrays.equals(args, message.args);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(template);
    result = 31 * result + Arrays.hashCode(args);
    return result;
  }
}
