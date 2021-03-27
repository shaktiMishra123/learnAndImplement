package DsProblem;

public class MergeSortedArray {
  public static void main(String[] args) {
    int[] num1 = new int[]{1,2,3,0,0,0};
    int[] num2 = new int[]{2,5,6};
    int lengthOfnum1ArrayMplusN = num1.length;
    int lengthOfnum2ArrayN = num2.length;
    merge(num1,lengthOfnum1ArrayMplusN,num2,lengthOfnum2ArrayN);
  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
      for(int i : nums1){
          if( i != 0){
            nums1[i] = i;
          }
      }
  }
}
