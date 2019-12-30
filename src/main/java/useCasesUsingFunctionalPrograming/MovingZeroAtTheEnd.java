package useCasesUsingFunctionalPrograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MovingZeroAtTheEnd {
  private static List<Integer> integerListZero = new ArrayList<Integer>();
  private static List<Integer> integerListNonZero = new ArrayList<Integer>();
  private static Predicate<Integer> integerPredicate = (s) -> s.equals(0);
  private static Consumer<Integer> stringConsumer = (s) -> {
    if (integerPredicate.test(s)) {
      integerListZero.add(s);
    } else {
      integerListNonZero.add(s);
    }
  };

  public static void main(String[] args) {
    List<Integer> integerList = Arrays.asList(1,2,0,0,4,0,1);
    // output : 1,2,4,1,0,0,0
    integerList.forEach(s ->stringConsumer.accept(s));
    List<Integer> listAfterZeroAppendedAtTheEnd = new ArrayList<Integer>();
    listAfterZeroAppendedAtTheEnd.addAll(integerListNonZero);
    listAfterZeroAppendedAtTheEnd.addAll(integerListZero);
    System.out.println(listAfterZeroAppendedAtTheEnd);
  }
}
