package numericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumericStreams {
  static Integer getSumUsingReduce(List<Integer> value){
    return value.stream().reduce(0,(x,y) -> x+y);
  }

  static Integer getSumUsingIntStream(){
    return IntStream.rangeClosed(0,6).sum();
  }
  public static void main(String[] args) {
    List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
    System.out.println(getSumUsingReduce(integerList));
    System.out.println(getSumUsingIntStream());

  }
}
