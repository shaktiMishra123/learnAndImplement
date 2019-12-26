package functionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {
  static UnaryOperator<String> unaryOperator = (s -> s.toUpperCase());
  static UnaryOperator<String> unaryOperator1 = (s -> s.concat("default"));

  public static void main(String[] args) {
    System.out.println(unaryOperator1.apply("Shakti"));
    System.out.println(unaryOperator.apply("shakti"));

  }
}
