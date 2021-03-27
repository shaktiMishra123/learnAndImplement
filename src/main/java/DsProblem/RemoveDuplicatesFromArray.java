package DsProblem;



import java.util.Set;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArray {
  public static void main(String[] args) {
    int[] numArray = {-3,-1,0,0,0,3,3};
    int arraySize = removeDuplicates(numArray);
    System.out.println(arraySize);

  }

  public static int removeDuplicates(int[] nums) {
    Set<Integer> integerSet = new LinkedHashSet<>();
    for (int i : nums){
      integerSet.add(i);
    }

    int j = 0;
    for (int k : integerSet){
      nums[j++] = k;
    }
    return integerSet.size();
  }

}
