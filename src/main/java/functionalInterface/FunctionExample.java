package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
  static Function<String,String> function = (name) -> name.toUpperCase();
  static Function<Integer,Integer> integerFunction = (value) -> value + 5;
  static Function<String,String> concat = (name) -> name.toUpperCase().concat("default");
  static BiFunction<Integer,Integer,Integer> biFunction = (x,y) -> x + y;

  public static void main(String[] args) {
    //System.out.println(function.apply("test"));
    String test = function.apply("test");
    System.out.println(test);
    System.out.println(function.andThen(concat).apply("Shakti"));
    System.out.println(function.compose(concat).apply("Shakti"));
    System.out.println(integerFunction.apply(10));

    System.out.println(biFunction.apply(10,30));
  }
}
