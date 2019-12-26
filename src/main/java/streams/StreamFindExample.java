package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class StreamFindExample {
  public static<T> Stream<T> of(T... values) {
    return Arrays.stream(values);
  }
  public static void main(String[] args) {
    Stream<Integer> integerStream = StreamFindExample.of(1,2,4,5);
    System.out.println(integerStream.collect(Collectors.toList()));

  }
}
