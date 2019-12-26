package functionalInterface;

import java.util.List;
import java.util.function.BiConsumer;

public class StudentDetails implements BiConsumer<String, List<String>> {

  @Override
  public void accept(String s, List<String> strings) {
    System.out.println(s + ":" + strings);
  }
}
