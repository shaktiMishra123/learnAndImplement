package DsProblem;


public class RotateArray {
  public static void main(String[] args) {
    int[] arr = new int[]{1,2};
    rotate(arr,3);

  }

  public static void rotate(int[] nums, int k) {
    // speed up the rotation
    System.out.println(k % nums.length);
    k %= nums.length;
    int temp, previous;
    for (int i = 0; i < k; i++) {
      previous = nums[nums.length - 1];
      for (int j = 0; j < nums.length; j++) {
        temp = nums[j];
        nums[j] = previous;
        previous = temp;
      }
    }
    for (int i : nums){
      System.out.println(i);

    }  }
}
