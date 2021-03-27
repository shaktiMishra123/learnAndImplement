package DsProblem;

import java.util.LinkedList;
import java.util.List;

public class MoveZero {
  public static void main(String[] args) {
    int[] arr = new int[]{0,1,0,3,12};
    moveZeroes(arr);
  }

  public static void moveZeroes(int[] nums) {
    List<Integer> listContainsZero = new LinkedList<>();
    List<Integer> listNotContainsZero = new LinkedList<>();
    List<Integer> fullList = new LinkedList<>();
    for (int i : nums){
      if(i == 0){
        listContainsZero.add(i);
      }
      else listNotContainsZero.add(i);
    }
    fullList.addAll(listNotContainsZero);
    fullList.addAll(listContainsZero);
    int j = 0 ;
    for (int i : fullList){
      nums[j] = i;
      j ++ ;
    }
  }
}
