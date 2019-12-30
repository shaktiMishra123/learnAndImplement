package useCasesUsingFunctionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Scrambled {
  static  BiPredicate<Map<String,Long>,Map<String,Long>> mapBiPredicate = (stringLongMap, o) -> stringLongMap.equals(o);
  public static void main(String[] args) {
    String firstString = "shakti";
    String secondString = "haktis";
    List<String> list = Arrays.asList(firstString.split(""));
    List<String> list1 = Arrays.asList(secondString.split(""));
    Map<String,Long> firstStringAfterComputation = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    Map<String,Long> secondStringAfterComputation = list1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    if(mapBiPredicate.test(firstStringAfterComputation,secondStringAfterComputation))
      System.out.println("true");
    else
      System.out.println("false");
  }
}
