import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

//Below example will clear confusion between Map and Flatmap

public class MapAndFlatMapTest {

  //Nothing special in the first example, a Function is applied to return the String in uppercase.
  @Test
  public void convertStringToUpperCaseStreams() {
    List<String> collected = Stream.of("a", "b", "hello") // Stream of String
        .map(String::toUpperCase) // Returns a stream consisting of the results of applying the given function to the elements of this stream.
        .collect(Collectors.toList());
    assertEquals(asList("A", "B", "HELLO"), collected);
  }


  //In the second example, a Stream of List is passed. It is NOT a Stream of Integer!
  //If a transformation Function has to be used (through map), then first the Stream has to be flattened to something else (a Stream of Integer).
  //If flatMap is removed then the following error is returned: The operator + is undefined for the argument type(s) List, int.
  //It is NOT possible to apply + 1 on a List of Integers!

  @Test
  public void testflatMap() throws Exception {
    List<Integer> together = Stream.of(asList(1, 2), asList(3, 4)) // Stream of List<Integer>
        .flatMap(List::stream)
        .map(integer -> integer + 1)
        .collect(Collectors.toList());
    assertEquals(asList(2, 3, 4, 5), together);
  }
}
