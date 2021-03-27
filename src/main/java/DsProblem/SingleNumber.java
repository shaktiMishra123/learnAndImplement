package DsProblem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber {
  public static void main(String[] args) {
    int[] arr = new int[]{2,2,1,1,3};
    int res = singleNumber(arr);
    System.out.println(res);

  }

  public static int singleNumber(int[] nums) {
    Map<Integer,Integer> integerMap = new HashMap<>();
    for (int i : nums){
      integerMap.put(i,integerMap.getOrDefault(i,0) + 1);
    }
    for (int i : nums){
      if(integerMap.get(i) == 1){
        return i;
      }
    }
    return -1;
  }

}
