package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitAndSkip {
  public static void main(String[] args) {
    List<Integer> stringList = Arrays.asList(1,2,4,5,6);
    System.out.println(stringList.stream().skip(2).reduce((x,y) -> x * y));
    System.out.println(stringList.stream().limit(2).reduce((x,y) -> x * y));


  }
}
