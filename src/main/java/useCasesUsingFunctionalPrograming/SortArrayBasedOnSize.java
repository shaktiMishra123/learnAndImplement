package useCasesUsingFunctionalPrograming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortArrayBasedOnSize {
  public static void main(String[] args) {
    String stringArray[] = {"This","is","Shakti"};
    Map<String,Integer> stringIntegerMap = new HashMap<>();
    Arrays.stream(stringArray).forEach((k) -> {
      stringIntegerMap.put(k,k.length());
    });

//    stringIntegerMap.forEach((k) -> {});
  }
}
