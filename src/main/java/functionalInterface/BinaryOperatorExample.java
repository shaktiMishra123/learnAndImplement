package functionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class BinaryOperatorExample {
  static Predicate<Integer> predicate = (a) -> a > 3;
  static Predicate<Integer> predicate1 = (a) -> a == 3;
  static Comparator<Integer> comparator = (integer, anotherInteger) -> integer.compareTo(anotherInteger);


  public static void main(String[] args) {
    BinaryOperator<Integer> multiply = (a,b) -> a*b;
    System.out.println(multiply.apply(3,4));

    BinaryOperator<Integer> binaryOperator = BinaryOperator.maxBy(comparator);
    System.out.println(binaryOperator.apply(2,4));

    BinaryOperator<Integer> binaryOperator1 = BinaryOperator.minBy(comparator);
    System.out.println(binaryOperator1.apply(2,4));
    System.out.println(predicate.test(3));
    System.out.println(predicate.and(predicate1).test(5));
    System.out.println(predicate.or(predicate1).test(5));



  }
}
