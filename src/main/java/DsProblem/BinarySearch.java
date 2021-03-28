package DsProblem;

import java.util.Arrays;

public class BinarySearch {

  public static void main(String[] args) {
    int[] array = new int[]{1,1,3,4,5,6,7,8,9};
     Arrays.sort(array);
      int res = bSearch(array,3);
    System.out.println(res);
  }

  public static int bSearch(int [] arr, int searchElement){
      int left = 0;
      int right = arr.length - 1;

      while (left < right){
        int mid = left + (right - left)/2;
        if(arr[mid] == searchElement ){
          return mid;
        }
        else if(arr[mid] < searchElement){
          left = mid + 1;
        }
        else {
          right = mid - 1;
        }
      }
      return -1;
  }
}
