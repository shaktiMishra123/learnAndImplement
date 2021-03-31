package DsProblem;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
  public static void main(String[] args) {
    int[] arr = new  int[]{6,5,5};  // 1,1,1,2,2,3,3,3,3
    int res = majorityElement(arr);
    System.out.println(res);

  }

  public static int majorityElement(int[] nums) {
    int length = nums.length;
    Map<Integer, Integer> integerMap = new HashMap<>();
    for (int i :  nums){
      integerMap.put(i, integerMap.getOrDefault(i,0) + 1);
    }
    System.out.println(integerMap);

    for (int i : nums){
      if(integerMap.get(i) > length/2){
        return i;
      }
    }
  return -1;
  }
}
