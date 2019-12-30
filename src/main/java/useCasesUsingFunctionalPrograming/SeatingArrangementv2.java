package useCasesUsingFunctionalPrograming;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

public class SeatingArrangementv2 {
  static UnaryOperator<Integer> findSeatArrangement = (arg) -> {
    int half = arg % 12;
    if (half == 0)
      return arg - 12 + 1;
    if (half <= 6)
      return (arg + 2 * (6 - half) + 1);
    else
      return arg - 2 * (half - 6) + 1;
  };

  static Function<Integer, String> findSeatType = (arg) -> {
    int location = arg % 6;
    if (location == 1 || location == 0)
      return "WS";
    else if (location == 2 || location == 5)
      return "MS";
    else return "AS";
  };


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    IntStream.range(0, scanner.nextInt())
        .map(num -> scanner.nextInt())
        .mapToObj(number -> findSeatArrangement.apply(number) + " " + findSeatType.apply(number))
        .forEach(System.out::println);


  }
}
