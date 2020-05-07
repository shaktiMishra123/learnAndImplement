package emptyValidation;

public class ApplicationMain {

  public static void main(String[] args) {
   /* Message msg = new Message("%s is my name" , new Object[] {"Shakti"});
    System.out.println(msg.toString());

    Message defaultMessage =  Message.withDefaults();

    System.out.println(msg.isDefault());
    System.out.println(defaultMessage.isDefault());

    System.out.println(defaultMessage.isDefaultArgs());

    Message msg1 = defaultMessage.propagateArgs(msg);

    System.out.println(msg1);

    System.out.println(String.format("%s shakti","abc"));
*/
    Message msg = new Message("%s is my name" , new Object[] {"Shakti"});
    System.out.println(msg);


    System.out.println(Message.withDefaults().isDefault());
    System.out.println(Message.withDefaults().isDefaultTemplate());
   System.out.println(Message.withDefaults().propagateArgs(msg));

    //System.out.println(Message.withDefaults().template("%s Shakti").getTemplate());
  }

}
