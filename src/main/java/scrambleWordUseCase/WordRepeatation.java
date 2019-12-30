package scrambleWordUseCase;

import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordRepeatation {
  static Predicate<String> checkIfStringIsMoreThanTwoChar = (stringValueToCompare) -> Stream.of(stringValueToCompare.split("")).distinct().count() == 2;
  static BiPredicate<Long, Long> checkIfFirstIsMultipleOfSecond = (firstCharCount, secondCharCount) -> firstCharCount * 2 == secondCharCount;
  //second character should be multiple of 2 of first Character return true otherwise false
  // abb ->  true , bbaaaa -> true , bba -> false
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String : ");
    String stringToCompare = sc.nextLine();
    boolean returnValue = checkIfStringIsValidString(stringToCompare);
    if (returnValue) {
      String firstChar = Stream.of(stringToCompare.split("")).distinct().collect(Collectors.toList()).get(0);
      String secondChar = Stream.of(stringToCompare.split("")).distinct().collect(Collectors.toList()).get(1);
      long countOfFirstChar = Stream.of(stringToCompare.split("")).filter(word -> word.contains(firstChar)).count();
      long countOfSecondChar = Stream.of(stringToCompare.split("")).filter(word -> word.contains(secondChar)).count();
      System.out.println(checkIfFirstIsMultipleOfSecond.test(countOfFirstChar, countOfSecondChar));
    }
  }

  private static boolean checkIfStringIsValidString(String stringToCompare) {
    return checkIfStringIsMoreThanTwoChar.test(stringToCompare);
  }
}
