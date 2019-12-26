package functionalInterface;

import java.util.function.Function;

public class FunctionExample {
  static Function<String,String> function = (name) -> name.toUpperCase();
  static Function<String,String> concat = (name) -> name.toUpperCase().concat("default");

  public static void main(String[] args) {
    //System.out.println(function.apply("test"));
    String test = function.apply("test");
    System.out.println(test);
    System.out.println(function.andThen(concat).apply("Shakti"));
    System.out.println(function.compose(concat).apply("Shakti"));

  }
}
