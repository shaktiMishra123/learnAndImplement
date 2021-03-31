package DsProblem;

import java.util.*;

public class FindDissappearedNumber {
  public static void main(String[] args) {
    int[] arr = new int[]{1,1};
    List<Integer> integers = findDisappearedNumbers(arr);
    System.out.println(integers);

  }

  public static List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> integerList = new LinkedList<>();
    Set<Integer> integerSet = new LinkedHashSet<>();
    for (int i : nums){
      integerSet.add(i);
    }
    for (int j = 1 ; j <= nums.length ; j ++){
      if(!integerSet.contains(j)){
        integerList.add(j);
      }
    }
    return integerList;

  }
}
