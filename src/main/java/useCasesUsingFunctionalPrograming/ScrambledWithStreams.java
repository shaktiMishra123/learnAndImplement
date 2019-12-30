package useCasesUsingFunctionalPrograming;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ScrambledWithStreams {
  static BiPredicate<List<String>,List<String>> biPredicate = List::equals;
  public static void main(String[] args) {
    String firstString = "shakti";
    String secondString = "haktis";
    List<String>  streamList = Stream.of(firstString.split("")).parallel().sorted().collect(Collectors.toList());
    List<String>  streamList1 = Stream.of(secondString.split("")).parallel().sorted().collect(Collectors.toList());
    System.out.println(biPredicate.test(streamList,streamList1));
  }

}
