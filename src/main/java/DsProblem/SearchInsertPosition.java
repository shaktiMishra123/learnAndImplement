package DsProblem;

public class SearchInsertPosition {
  public static void main(String[] args) {
    int[] arr = new int[]{1,3,5,6};
    int target = 0;
    int res = searchInsert(arr,target);
    System.out.println(res);

  }

  public  static int searchInsert(int[] nums, int target) {
    if(target > nums[nums.length-1]){
      return nums.length;
    }
    int left = 0;
    int right = nums.length-1;
    while (left <= right){
      int mid = left + (right - left)/2;
      if(nums[mid] == target)
        return mid;
      if(nums[mid] < target){
         left =  mid + 1;
      }
      else
        right = mid - 1;
    }
      return  left;
  }
}
