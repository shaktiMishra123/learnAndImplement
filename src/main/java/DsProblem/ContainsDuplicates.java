package DsProblem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
  public static void main(String[] args) {
    int[] arr = new int[]{1,2,3};
    boolean res = containsDuplicate(arr);
    boolean res1 = containsDuplicateLinearApproach(arr);
    System.out.println(res);
    System.out.println(res1);
  }

  public static boolean containsDuplicate(int[] nums) {
    Set<Integer> integerSet = new HashSet<>();
    for (int i : nums){
      if(integerSet.contains(i))
        return true;
      integerSet.add(i);
    }
return false;
  }


  public static boolean containsDuplicateLinearApproach(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0 ; i < nums.length - 1 ; i++){
      if(nums[i] == nums[i+1]){ // {1,2,3}
        return true;
      }
    }
    return false;
  }


}
