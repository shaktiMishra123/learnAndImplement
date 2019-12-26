package removeDuplicatesList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicates {
  public static void main(String[] args) {
    List<Integer> integerList = new ArrayList();
    integerList.add(1);
    integerList.add(2);
    integerList.add(2);
    integerList.add(3);
    integerList.add(3);
    integerList.add(5);
    integerList.add(5);
    integerList.add(5);
    integerList.add(6);

    List<Integer> integerList1 = Arrays.asList(1,2,3,4,4,3,4,4);

    List<Integer> uniqueList = integerList.stream().distinct().collect(Collectors.toList());
    System.out.println(uniqueList);

    System.out.println(integerList1.stream().distinct().collect(Collectors.toList()));

    // Sum of the list
    int sum =  IntStream.rangeClosed(1,100).sum();
    System.out.println(sum);
  }
}
