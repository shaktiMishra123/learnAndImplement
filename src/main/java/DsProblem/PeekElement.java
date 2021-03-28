package DsProblem;

public class PeekElement {
  public static void main(String[] args) {


    int[] arr = new int[]{1,2,1,3,5,6,4};
    int res = findPeakElement(arr);
    System.out.println(res);

  }
  public static int findPeakElement(int[] nums) {
      int left = 0;
      int right = nums.length - 1;
      while (left < right){
        int mid = left + (right - left) / 2;
        if(nums[mid] < nums[mid + 1]){  // 2 < 3
          left = mid + 1;
        }
        else
          right = mid - 1;
      }
      return left;

  }
}
