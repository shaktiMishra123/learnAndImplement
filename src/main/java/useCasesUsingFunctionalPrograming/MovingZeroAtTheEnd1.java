package useCasesUsingFunctionalPrograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MovingZeroAtTheEnd1 {
  private static List<Integer> integerListZero = new ArrayList<Integer>();
  private static List<Integer> integerListNonZero = new ArrayList<Integer>();
  private static Predicate<Integer> integerPredicateEqual = (s) -> s.equals(0);
  private static Predicate<Integer> integerPredicateNotEqual = (s) -> ! s.equals(0);

  public static void main(String[] args) {
    List<Integer> integerList = Arrays.asList(1,2,0,0,4,0,1);
    // output : 1,2,4,1,0,0,0
    integerListZero = integerList.stream().filter(integerPredicateEqual).collect(Collectors.toList());
    integerListNonZero = integerList.stream().filter(integerPredicateNotEqual).collect(Collectors.toList());
    List<Integer> listAfterZeroAppendedAtTheEnd = new ArrayList<Integer>();
    listAfterZeroAppendedAtTheEnd.addAll(integerListNonZero);
    listAfterZeroAppendedAtTheEnd.addAll(integerListZero);
    System.out.println(listAfterZeroAppendedAtTheEnd);
  }
}
